package org.dracula.ht2017g8.service;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo_othersys.CardPredictBO;
import org.dracula.ht2017g8.bo_othersys.PayLoadsBO;
import org.dracula.ht2017g8.service.impl.ModelServiceImpl;
import org.dracula.ht2017g8.service.impl.util.Json;
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
        modelService.setProxyIP("172.16.100.11");
        modelService.setProxyPort(8388);
        CommonBO<String> stringCommonBO = modelService.predict(payload);
        System.out.println(stringCommonBO);
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
        modelService.setProxyIP("172.16.100.11");
        modelService.setProxyPort(8388);
        //
        CommonBO<String> stringCommonBO = modelService.predict(payload);
        System.out.println(stringCommonBO);
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

    @Test
    public void test3(){
        String result = "{\n" +
                "\"fields\": \n" +
                "\t[\"GENDER\", \"MARITAL_STATUS\", \"PROFESSION\", \"PRODUCT_LINE\", \"label\", \"PROFESSION_IX\", \"GENDER_IX\", \"MARITAL_STATUS_IX\", \"features\", \"rawPrediction\", \"probability\", \"prediction\", \"predictedLabel\"],\n" +
                "\"values\": \n" +
                "\t[\n" +
                "\t\t[\"M\", \"Single\", \"Student\", \"hot-035\", 0.0, 6.0, 0.0, 1.0, [0.0, 1.0, 6.0], [4.037308441972462, 8.023582303689006, 5.462742089238387, 0.1486108751053541, 2.3277562899947912], [0.20186542209862307, 0.40117911518445026, 0.27313710446191936, 0.007430543755267705, 0.11638781449973956], 1.0, \"hot-060\"], \n" +
                "\t\t[\"M\", \"Single\", \"Executive\", \"hot-035\", 0.0, 3.0, 0.0, 1.0, [0.0, 1.0, 3.0], [11.94271837293909, 1.8774194434195093, 5.776683919504683, 0.11867914127923208, 0.284499122857486], [0.5971359186469544, 0.09387097217097545, 0.28883419597523413, 0.0059339570639616035, 0.014224956142874298], 0.0, \"hot-035\"]\n" +
                "\t]\n" +
                "}";
        PayLoadsBO payLoadsBO = Json.readJson(result, PayLoadsBO.class);
        System.out.println(payLoadsBO);
    }

    @Test
    public void test4(){
        System.out.println("\\abcd\\".replace("\\", ""));
    }

}

