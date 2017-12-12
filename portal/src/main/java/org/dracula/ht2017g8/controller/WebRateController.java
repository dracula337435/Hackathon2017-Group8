package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebRateBO;
import org.dracula.ht2017g8.service.WebRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebRateController {

    @Autowired
    private WebRateService webRateService;

    @RequestMapping(value="/web_rate", method=RequestMethod.GET)
    public CommonBO<List<WebRateBO>> getAll(){
        CommonBO<List<WebRateBO>> listCommonBO = webRateService.getAll();
        if(listCommonBO != null){
            return listCommonBO;
        }else{
            listCommonBO = new CommonBO<>();
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00015);
            return listCommonBO;
        }
    }
}
