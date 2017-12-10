package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.service.impl.ModelServiceImpl;
import org.junit.Test;

public class ModelServiceTest {

    @Test
    public void test(){
        String payload =
                "{\"fields\": " +
                        "[\"ID\",\"Status\",\"Children\",\"Est Income\",\"Car Owner\",\"Age\",\"LongDistance\",\"International\",\"Local\",\"Dropped\",\"Paymethod\",\"LocalBilltype\",\"LongDistanceBilltype\",\"Usage\",\"RatePlan\"], "+
                        "\"values\": " +
                        "[[2048,\"S\",1,13576.5,\"N\",39.426667,14.83,0,25.66,0,\"CC\",\"Budget\",\"Standard\",40.49,1]]}";
        ModelServiceImpl modelService = new ModelServiceImpl();
        modelService.setWml_service_credentials_url("https://ibm-watson-ml.mybluemix.net");
        modelService.setWml_service_credentials_username("793ddab0-5897-4f74-b20e-dfd0d175b25e");
        modelService.setWml_service_credentials_password("f2d6e707-0b44-4c3b-a1b2-bdfdde1e1887");
        modelService.setUseProxy(true);
        modelService.setProxyIP("127.0.0.1");
        modelService.setProxyPort(50374);
        String prediction = modelService.predict(payload);
        System.out.println(prediction);
    }

}

