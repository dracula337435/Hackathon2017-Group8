package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCardapplyBO;
import org.dracula.ht2017g8.service.WebCardapplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class WebCardApplyController {

    @Autowired
    private WebCardapplyService webCardapplyService;

    @RequestMapping(value="/web_cardapply/{id}", method=RequestMethod.GET)
    public CommonBO<WebCardapplyBO> getById(@PathVariable("id") String id){
        int idInt;
        try {
            idInt = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            CommonBO<WebCardapplyBO> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00009);
            return rslt;
        }
        CommonBO<WebCardapplyBO> webCardapplyBOCommonBO = webCardapplyService.getById(idInt);
        if(webCardapplyBOCommonBO != null){
            return webCardapplyBOCommonBO;
        }else{
            CommonBO<WebCardapplyBO> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00010);
            return rslt;
        }
    }

    @RequestMapping(value="/web_cardapply", method=RequestMethod.POST)
    public CommonBO<Integer> apply(WebCardapplyBO webCardapplyBO){
        CommonBO<Integer> integerCommonBO = webCardapplyService.add(webCardapplyBO);
        if(integerCommonBO != null){
            return integerCommonBO;
        }else{
            CommonBO<Integer> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00011);
            return rslt;
        }
    }


}
