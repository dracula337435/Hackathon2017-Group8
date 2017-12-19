package org.dracula.ht2017g8.speechandtext;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.speech.TtsResponse;
import com.baidu.aip.util.Util;
import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ConvertionController {

    private static Logger logger = LoggerFactory.getLogger(ConvertionController.class);

    private String baiduAipAppId = "10551192";
    private String baiduAipApiKey = "APpErmod7XEARkCG4uUfSeUv";
    private String baiduAipSecretKey = "Rwt29B63vrG0AVwGCw2LnWWM0btoTXF7";

    @RequestMapping(value="/speechandtext/speech2text", method= RequestMethod.POST)
    public CommonBO<List<String>> speech2text(@RequestParam("file")MultipartFile file){
        CommonBO<List<String>> rslt = new CommonBO<>();
        logger.info(file.getSize()+"");
        try {
            byte[] bytes = file.getBytes();

            Util.writeBytesToFileSystem(bytes, "e:/tmp_speech/input"+System.currentTimeMillis()+".wav");

            AipSpeech client = getSpeech();
//            JSONObject asrRes = client.asr(bytes, "pcm", 16000, null);
            JSONObject asrRes = client.asr(bytes, "wav", 16000, null);
            logger.info("百度语音返回结果："+asrRes);
            long err_no = asrRes.getLong("err_no");
            if(err_no==0){
                JSONArray resultArray = asrRes.getJSONArray("result");
                List<String> list = new LinkedList<>();
                int len = resultArray.length();
                for(int i=0; i<len; i++){
                    list.add((String)resultArray.get(i));
                }
                rslt.setData(list);
                rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
                return rslt;
            }else{
                rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00038);
                rslt.setMsg(rslt.getMsg()+asrRes);
                return rslt;
            }
        } catch (IOException e) {
            logger.error("出错", e);
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00039);
            return rslt;
        }
    }

    @RequestMapping(value="/speechandtext/text2speech", method= RequestMethod.POST)
    public CommonBO<String> text2speech(BroadcastReqVO req){
        AipSpeech client = getSpeech();
        // 调用接口
        TtsResponse res = client.synthesis(req.getMsg(), "zh", 1, null);
        byte[] data = res.getData();
        JSONObject res1 = res.getResult();
        if (data != null) {
            try {
                Util.writeBytesToFileSystem(data, "e:/tmp_speech/output"+System.currentTimeMillis()+".mp3");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (res1 != null) {
            System.out.println(res1.toString(2));
        }

        return null;
    }

    private AipSpeech getSpeech(){
        // 初始化一个AipSpeech
        AipSpeech client = new AipSpeech(baiduAipAppId, baiduAipApiKey, baiduAipSecretKey);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//            client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//            client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
        return client;
    }

}
