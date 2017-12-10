package org.dracula.ht2017g8.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ModelServiceImpl {

    private String wml_service_credentials_url;

    private String wml_service_credentials_username;

    private String wml_service_credentials_password;

    private boolean useProxy;

    private String proxyIP;

    private int proxyPort;

    public String predict(String payload){

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
        HttpURLConnection tokenConnection = null;
        HttpURLConnection scoringConnection = null;
        BufferedReader tokenBuffer = null;
        BufferedReader scoringBuffer = null;
        try {
            // Getting WML token
            URL tokenUrl = new URL(wml_url);
            if(useProxy) {
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyIP, proxyPort));
                tokenConnection = (HttpURLConnection) tokenUrl.openConnection(proxy);
            }else{
                tokenConnection = (HttpURLConnection) tokenUrl.openConnection();
            }
            tokenConnection.setDoInput(true);
            tokenConnection.setDoOutput(true);
            tokenConnection.setRequestMethod("GET");
            tokenConnection.setRequestProperty("Authorization", wml_auth_header);
            tokenBuffer = new BufferedReader(new InputStreamReader(tokenConnection.getInputStream()));
            StringBuffer jsonString = new StringBuffer();
            String line;
            while ((line = tokenBuffer.readLine()) != null) {
                jsonString.append(line);
            }
            // Scoring request
            URL scoringUrl = new URL("https://ibm-watson-ml.mybluemix.net/v3/wml_instances/edbdeb87-218e-4faa-a403-6f418dfc9dd2/published_models/fe1d6cc3-3898-4cff-a979-c19e12010edb/deployments/87f41e76-007c-4437-b8d2-82fa93e571df/online");
            String wml_token = "Bearer " +
                    jsonString.toString()
                            .replace("\"","")
                            .replace("}", "")
                            .split(":")[1];
            if(useProxy){
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyIP, proxyPort));
                scoringConnection = (HttpURLConnection) scoringUrl.openConnection(proxy);
            }else{
                scoringConnection = (HttpURLConnection) scoringUrl.openConnection();
            }

            scoringConnection.setDoInput(true);
            scoringConnection.setDoOutput(true);
            scoringConnection.setRequestMethod("POST");
            scoringConnection.setRequestProperty("Accept", "application/json");
            scoringConnection.setRequestProperty("Authorization", wml_token);
            scoringConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(scoringConnection.getOutputStream(), "UTF-8");

            // NOTE: manually define and pass the array(s) of values to be scored in the next line
            writer.write(payload);
            writer.close();

            scoringBuffer = new BufferedReader(new InputStreamReader(scoringConnection.getInputStream()));
            StringBuffer jsonStringScoring = new StringBuffer();
            String lineScoring;
            while ((lineScoring = scoringBuffer.readLine()) != null) {
                jsonStringScoring.append(lineScoring);
            }
            return jsonStringScoring.toString();
        } catch (IOException e) {
            System.out.println("The URL is not valid.");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
        finally {
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

    public String getWml_service_credentials_url() {
        return wml_service_credentials_url;
    }

    public void setWml_service_credentials_url(String wml_service_credentials_url) {
        this.wml_service_credentials_url = wml_service_credentials_url;
    }

    public String getWml_service_credentials_username() {
        return wml_service_credentials_username;
    }

    public void setWml_service_credentials_username(String wml_service_credentials_username) {
        this.wml_service_credentials_username = wml_service_credentials_username;
    }

    public String getWml_service_credentials_password() {
        return wml_service_credentials_password;
    }

    public void setWml_service_credentials_password(String wml_service_credentials_password) {
        this.wml_service_credentials_password = wml_service_credentials_password;
    }

    public boolean isUseProxy() {
        return useProxy;
    }

    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    public String getProxyIP() {
        return proxyIP;
    }

    public void setProxyIP(String proxyIP) {
        this.proxyIP = proxyIP;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }
}
