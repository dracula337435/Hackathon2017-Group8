package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustomerBO;
import org.dracula.ht2017g8.service.WebCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCustomerController {

    @Autowired
    private WebCustomerService webCustomerService;

    @RequestMapping(value="/web_customer/{custId}", method= RequestMethod.GET)
    public CommonBO<WebCustomerBO> getByCustId(@PathVariable("custId") String custId){
        CommonBO<WebCustomerBO> customerBOCommonBO = webCustomerService.getByCustId(custId);
        if(customerBOCommonBO != null){
            return customerBOCommonBO;
        }else{
            CommonBO<WebCustomerBO> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00007);
            return rslt;
        }
    }

}
