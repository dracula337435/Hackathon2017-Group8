package org.dracula.ht2017g8.speechandtext;

import com.baidu.aip.speech.AipSpeech;
import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class ConvertionController {

    private static Logger logger = LoggerFactory.getLogger(ConvertionController.class);

    private String baiduAipAppId = "10551192";
    private String baiduAipApiKey = "APpErmod7XEARkCG4uUfSeUv";
    private String baiduAipSecretKey = "Rwt29B63vrG0AVwGCw2LnWWM0btoTXF7";

    @RequestMapping(value="/speechandtext/speech2text", method= RequestMethod.POST)
    public CommonBO<String> speech2text(@RequestParam("file")MultipartFile file){

        logger.info(file.getSize()+"");
        try {
            byte[] bytes = file.getBytes();

            FileOutputStream fos = new FileOutputStream(new File("e:/tmp_audio/"+System.currentTimeMillis()+".wav"));
            fos.write(bytes);
            fos.close();

            // 初始化一个AipSpeech
            AipSpeech client = new AipSpeech(baiduAipAppId, baiduAipApiKey, baiduAipSecretKey);

            // 可选：设置网络连接参数
            client.setConnectionTimeoutInMillis(2000);
            client.setSocketTimeoutInMillis(60000);

            // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//            client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//            client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

//            JSONObject asrRes2 = client.asr(bytes, "pcm", 16000, null);
            JSONObject asrRes2 = client.asr(bytes, "wav", 16000, null);
            logger.info("百度语音返回结果："+asrRes2);


        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonBO<String> rslt = new CommonBO<>();
        rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
        return rslt;
    }

    @RequestMapping(value="/speechandtext/text2speech", method= RequestMethod.POST)
    public CommonBO<String> text2speech(@RequestParam("file")MultipartFile file){
        return null;
    }

}
