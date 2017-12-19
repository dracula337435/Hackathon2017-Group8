import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.speechandtext.ConvertionController;
import org.dracula.ht2017g8.vo.BroadcastReqVO;
import org.junit.Test;

/**
 *
 */
public class TestConvertion{

    @Test
    public void test(){
        ConvertionController convertion = new ConvertionController();
        convertion.setBaiduAipAppId("10551192");
        convertion.setBaiduAipApiKey("APpErmod7XEARkCG4uUfSeUv");
        convertion.setBaiduAipSecretKey("Rwt29B63vrG0AVwGCw2LnWWM0btoTXF7");
        convertion.setOutputSpeechLocation("e:/tmp_speech/output/");
        BroadcastReqVO req = new BroadcastReqVO();
        req.setMsg("你好百度，就是试一下，hello world and maven");
        CommonBO<String> stringCommonBO = convertion.text2speech(req);
        System.out.println(stringCommonBO);
    }

}