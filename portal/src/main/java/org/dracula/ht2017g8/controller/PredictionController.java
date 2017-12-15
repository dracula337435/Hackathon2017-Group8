package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @RequestMapping(value="/prediction/card/payload/{custId}", method= RequestMethod.GET)
    public CommonBO<String> getPayload(@PathVariable("custId") String custId){
        CommonBO<String> stringCommonBO = predictionService.getPayLoad(custId);
        if(stringCommonBO != null){
            return stringCommonBO;
        }else{
            stringCommonBO = new CommonBO<>();
            stringCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00033);
            return stringCommonBO;
        }
    }

    @RequestMapping(value="/prediction/card/{custId}", method= RequestMethod.GET)
    public CommonBO<String> prediction_card(@PathVariable("custId") String custId){
        CommonBO<String> stringCommonBO = predictionService.predict(custId);
        if(stringCommonBO != null){
            return stringCommonBO;
        }else{
            stringCommonBO = new CommonBO<>();
            stringCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00026);
            return stringCommonBO;
        }
    }

}
