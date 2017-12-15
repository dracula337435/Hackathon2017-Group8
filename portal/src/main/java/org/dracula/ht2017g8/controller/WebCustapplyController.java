package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustapplyBO;
import org.dracula.ht2017g8.service.WebCustapplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCustapplyController {

    @Autowired
    private WebCustapplyService webCustapplyService;

    @RequestMapping(value="/web_custapply/{custId}", method= RequestMethod.GET)
    public CommonBO<WebCustapplyBO> getById(@PathVariable("custId") String custId){
        CommonBO<WebCustapplyBO> rslt = webCustapplyService.getById(custId);
        if(rslt != null){
            return rslt;
        }else{
            rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00029);
            return rslt;
        }
    }

}
