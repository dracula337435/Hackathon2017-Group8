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
        modelService.setWml_service_scoringUrl("https://ibm-watson-ml.mybluemix.net/v3/wml_instances/edbdeb87-218e-4faa-a403-6f418dfc9dd2/published_models/fe1d6cc3-3898-4cff-a979-c19e12010edb/deployments/87f41e76-007c-4437-b8d2-82fa93e571df/online");
        modelService.setUseProxy(true);
        modelService.setProxyIP("10.64.218.19");
        modelService.setProxyPort(57411);
        String prediction = modelService.predict(payload);
        System.out.println(prediction);
    }

    @Test
    public void test_anotherModel(){
        //
        CardPredictBO predictBO = new CardPredictBO();
        predictBO.setAge(25);
        predictBO.setGender("M");
        predictBO.setMaritalStatus("Single");
        predictBO.setProfession("Other");
        String payload = ModelServiceImpl.getRequiredJson(predictBO);
        System.out.println(payload);
        //
        ModelServiceImpl modelService = new ModelServiceImpl();
        modelService.setWml_service_credentials_url("https://ibm-watson-ml.mybluemix.net");
        modelService.setWml_service_credentials_username("793ddab0-5897-4f74-b20e-dfd0d175b25e");
        modelService.setWml_service_credentials_password("f2d6e707-0b44-4c3b-a1b2-bdfdde1e1887");
        modelService.setWml_service_scoringUrl("https://ibm-watson-ml.mybluemix.net/v3/wml_instances/edbdeb87-218e-4faa-a403-6f418dfc9dd2/published_models/b04129a3-8987-4034-afd6-d23638ce67f5/deployments/7b207b10-d8e2-481b-917c-87fae1adfc58/online");
        modelService.setUseProxy(true);
        modelService.setProxyIP("10.64.218.19");
        modelService.setProxyPort(57411);
        //
        String prediction = modelService.predict(payload);
        System.out.println(prediction);
    }

    @Test
    public void test2(){
        CardPredictBO cardPredictBO1 = new CardPredictBO();
        cardPredictBO1.setGender("M");
        cardPredictBO1.setMaritalStatus("Single");
        cardPredictBO1.setProfession("Student");
        CardPredictBO cardPredictBO2 = new CardPredictBO();
        cardPredictBO2.setGender("M");
        cardPredictBO2.setMaritalStatus("Single");
        cardPredictBO2.setProfession("Student");
        System.out.println(ModelServiceImpl.getRequiredJson(cardPredictBO1, cardPredictBO2));
    }

}

