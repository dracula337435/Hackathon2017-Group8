package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo_othersys.CardPredictBO;
import org.dracula.ht2017g8.bo_othersys.PayLoadsNewBO;
import org.dracula.ht2017g8.service.ModelService;
import org.dracula.ht2017g8.service.impl.util.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.*;

@Component
@ManagedResource
public class ModelServiceImpl implements ModelService {

    private static Logger logger = LoggerFactory.getLogger(ModelServiceImpl.class);

    @Value("${predict.auth.url}")
    private String wml_service_credentials_url;

    @Value("${predict.auth.username}")
    private String wml_service_credentials_username;

    @Value("${predict.auth.password}")
    private String wml_service_credentials_password;

    @Value("${predict.scoringUrl}")
    private String wml_service_scoringUrl;

    @Value("${predict.proxy.switch}")
    private boolean useProxy;

    @Value("${predict.proxy.ip}")
    private String proxyIP;

    @Value("${predict.proxy.port}")
    private int proxyPort;

    private long lastAuthTimeMilli = -1;

    private long maxBetweenAuth = 3600*1000;

    private String lastAuthToken;

    static{
        try {
            trustAllHttpsCertificates();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CommonBO<String> predict(String payload){

        CommonBO<String> rslt = new CommonBO<>();
        HttpsURLConnection scoringConnection = null;
        BufferedReader scoringBuffer = null;
        try {
            // Getting WML token
            String wml_token;
            CommonBO<String> tokenCommonBO = getAuth();
            logger.info("包含认证token的bo="+tokenCommonBO);
            if(tokenCommonBO != null){
                if(ReturnCodeAndMsg.SUCCESS.getCode().equals(tokenCommonBO.getCode())){
                    wml_token = tokenCommonBO.getData();
                }else{
                    return tokenCommonBO;
                }
            }else{
                CommonBO<String> tmpRslt = new CommonBO<>();
                tmpRslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00027);
                return tmpRslt;
            }
            // Scoring request
            try {
                logger.info("将要发送到mybluemix预测。目标url="+wml_service_scoringUrl+"，代理开关="+useProxy+"，代理ip:port="+proxyIP+":"+proxyPort);
                URL scoringUrl = new URL(wml_service_scoringUrl);
                if(useProxy){
                    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(proxyIP, proxyPort));
                    scoringConnection = (HttpsURLConnection) scoringUrl.openConnection(proxy);
                }else{
                    scoringConnection = (HttpsURLConnection) scoringUrl.openConnection();
                }

                scoringConnection.setDoInput(true);
                scoringConnection.setDoOutput(true);
                scoringConnection.setRequestMethod("POST");
                scoringConnection.setRequestProperty("Accept", "application/json");
                scoringConnection.setRequestProperty("Authorization", wml_token);
                scoringConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(scoringConnection.getOutputStream(), "UTF-8");

                // NOTE: manually define and pass the array(s) of values to be scored in the next line
                logger.info("将要行预测，送mybluemix的数据="+payload);
                writer.write(payload);
                writer.close();

                scoringBuffer = new BufferedReader(new InputStreamReader(scoringConnection.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
                rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00023);
            }
            StringBuffer jsonStringScoring = new StringBuffer();
            String lineScoring;
            while ((lineScoring = scoringBuffer.readLine()) != null) {
                jsonStringScoring.append(lineScoring);
            }
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            rslt.setData(jsonStringScoring.toString());
            return rslt;
        } catch (IOException e) {
            System.out.println("The URL is not valid.");
            System.out.println(e.getMessage());
            e.printStackTrace();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00024);
            return rslt;
        }
        finally {
            if (scoringConnection != null) {
                scoringConnection.disconnect();
            }
            try {
                if (scoringBuffer != null) {
                    scoringBuffer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void trustAllHttpsCertificates() throws Exception {
        TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
        TrustManager tm = new miTM();
        trustAllCerts[0] = tm;
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                logger.info("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }


    static class miTM implements TrustManager, X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public boolean isServerTrusted(X509Certificate[] certs) {
            return true;
        }

        public boolean isClientTrusted(X509Certificate[] certs) {
            return true;
        }

        public void checkServerTrusted(X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }

        public void checkClientTrusted(X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }
    }

    private CommonBO<String> getAuth(){
        long currentMili = System.currentTimeMillis();
        if(currentMili - lastAuthTimeMilli >= maxBetweenAuth){
            logger.info("距离上次成功认证太久，重新认证");
            return getAuth0();
        }else{
            logger.info("使用上次认证的信息");
            CommonBO<String> rslt = new CommonBO();
            rslt.setData(lastAuthToken);
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return rslt;
        }
    }

    @ManagedOperation
    public CommonBO<String> getAuth0(){

        CommonBO<String> rslt = new CommonBO<>();

        // NOTE: you must manually construct wml_credentials hash map below
        // using information retrieved from your IBM Cloud Watson Machine Learning Service instance
        Map<String, String> wml_credentials = new HashMap<String, String>()
        {{
            put("url", wml_service_credentials_url);
            put("username", wml_service_credentials_username);
            put("password", wml_service_credentials_password);
        }};
        String wml_auth_header = "Basic " +
                Base64.getEncoder().encodeToString((wml_credentials.get("username") + ":" +
                        wml_credentials.get("password")).getBytes(StandardCharsets.UTF_8));
        String wml_url = wml_credentials.get("url") + "/v3/identity/token";
        HttpsURLConnection tokenConnection = null;
        BufferedReader tokenBuffer = null;

        try {
            logger.info("将要发送认证信息。目标url="+wml_url+"，代理开关="+useProxy+"，代理ip:port="+proxyIP+":"+proxyPort);
            URL tokenUrl = new URL(wml_url);
            if(useProxy) {
                Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(proxyIP, proxyPort));
                tokenConnection = (HttpsURLConnection) tokenUrl.openConnection(proxy);
            }else{
                tokenConnection = (HttpsURLConnection) tokenUrl.openConnection();
            }
            tokenConnection.setDoInput(true);
            tokenConnection.setDoOutput(true);
            tokenConnection.setRequestMethod("GET");
            tokenConnection.setRequestProperty("Authorization", wml_auth_header);
            tokenBuffer = new BufferedReader(new InputStreamReader(tokenConnection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00021);
            return rslt;
        }
        StringBuffer jsonString = new StringBuffer();
        String line;
        try {
            while ((line = tokenBuffer.readLine()) != null) {
                jsonString.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (tokenConnection != null) {
                tokenConnection.disconnect();
            }
            try {
                if (tokenBuffer != null) {
                    tokenBuffer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.info("认证请求的返回信息="+jsonString.toString());
        String wml_token = null;
        try {
            wml_token = "Bearer " +
                    jsonString.toString()
                            .replace("\"","")
                            .replace("}", "")
                            .split(":")[1];
            logger.info("认证成功，得到token="+wml_token+"。即将更新上次成功认证时间和新token");
            //
            lastAuthToken = wml_token;
            lastAuthTimeMilli = System.currentTimeMillis();
            //
            rslt.setData(wml_token);
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return rslt;
        } catch (Exception e) {
            e.printStackTrace();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00022);
            return rslt;
        }
    }

    public static String getRequiredJson(CardPredictBO cardPredictBO){
        PayLoadsNewBO newBO = new PayLoadsNewBO();
        newBO.setFields(new LinkedList<>());
        newBO.getFields().add("GENDER");
        newBO.getFields().add("AGE");
        newBO.getFields().add("MARITAL_STATUS");
        newBO.getFields().add("PROFESSION");
        newBO.setValues(new LinkedList<>());
        newBO.getValues().add(new LinkedList<>());
        newBO.getValues().get(0).add(cardPredictBO.getGender());
        newBO.getValues().get(0).add(cardPredictBO.getAge());
        newBO.getValues().get(0).add(cardPredictBO.getMaritalStatus());
        newBO.getValues().get(0).add(cardPredictBO.getProfession());
        return Json.getJsonString(newBO);
    }

//    public static String getRequiredJson(Object... boList){
//        String rslt = null;
//        if(boList != null && boList.length > 0){
//            PayLoadsBO payLoadsBO = new PayLoadsBO();
//            Map<String, String> tmpMap = null;
//            //
//            List<String> fieldsList = new LinkedList<>();
//            payLoadsBO.setFields(fieldsList);
//            boolean is1stElement = true;
//            //
//            List<List<String>> valueListList = new LinkedList<>();
//            for(Object bo: boList){
//                String tmp = Json.getJsonString(bo);
//                tmpMap = Json.readJsonAsMap(tmp, String.class, String.class);
//                List<String> valueList = new LinkedList<>();
//                for(String key: tmpMap.keySet()){
//                    valueList.add(tmpMap.get(key));
//                    if(is1stElement){
//                        fieldsList.add(key);
//                    }
//                }
//                is1stElement = false;
//                valueListList.add(valueList);
//            }
//            payLoadsBO.setValues(valueListList);
//            return Json.getJsonString(payLoadsBO);
//        }
//        return rslt;
//    }

    @ManagedAttribute
    public String getWml_service_credentials_url() {
        return wml_service_credentials_url;
    }

    @ManagedAttribute
    public void setWml_service_credentials_url(String wml_service_credentials_url) {
        this.wml_service_credentials_url = wml_service_credentials_url;
    }

    @ManagedAttribute
    public String getWml_service_credentials_username() {
        return wml_service_credentials_username;
    }

    @ManagedAttribute
    public void setWml_service_credentials_username(String wml_service_credentials_username) {
        this.wml_service_credentials_username = wml_service_credentials_username;
    }

    @ManagedAttribute
    public String getWml_service_credentials_password() {
        return wml_service_credentials_password;
    }

    @ManagedAttribute
    public void setWml_service_credentials_password(String wml_service_credentials_password) {
        this.wml_service_credentials_password = wml_service_credentials_password;
    }

    @ManagedAttribute
    public boolean isUseProxy() {
        return useProxy;
    }

    @ManagedAttribute
    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    @ManagedAttribute
    public String getProxyIP() {
        return proxyIP;
    }

    @ManagedAttribute
    public void setProxyIP(String proxyIP) {
        this.proxyIP = proxyIP;
    }

    @ManagedAttribute
    public int getProxyPort() {
        return proxyPort;
    }

    @ManagedAttribute
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    @ManagedAttribute
    public String getWml_service_scoringUrl() {
        return wml_service_scoringUrl;
    }

    @ManagedAttribute
    public void setWml_service_scoringUrl(String wml_service_scoringUrl) {
        this.wml_service_scoringUrl = wml_service_scoringUrl;
    }
}
