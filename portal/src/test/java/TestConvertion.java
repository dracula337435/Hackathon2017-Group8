import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.speechandtext.BaiduAipProperties;
import org.dracula.ht2017g8.speechandtext.ConvertionController;
import org.dracula.ht2017g8.speechandtext.SpeechAndTextProperties;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.junit.Test;

/**
 *
 */
public class TestConvertion{

    @Test
    public void test(){
        ConvertionController convertion = new ConvertionController();
        //
        BaiduAipProperties baiduAipProperties = new BaiduAipProperties();
        baiduAipProperties.setAppId("10551192");
        baiduAipProperties.setApiKey("APpErmod7XEARkCG4uUfSeUv");
        baiduAipProperties.setSecretKey("Rwt29B63vrG0AVwGCw2LnWWM0btoTXF7");
        //
        SpeechAndTextProperties speechAndTextProperties = new SpeechAndTextProperties();
        speechAndTextProperties.setOutputLocation("e:/tmp_speech/output/");
        //
        convertion.setBaiduAipProperties(baiduAipProperties);
        convertion.setSpeechAndTextProperties(speechAndTextProperties);
        //
        BroadcastReqVO req = new BroadcastReqVO();
        req.setMsg("你好百度，就是试一下，hello world and maven");
        CommonBO<String> stringCommonBO = convertion.text2speech(req);
        System.out.println(stringCommonBO);
    }

}