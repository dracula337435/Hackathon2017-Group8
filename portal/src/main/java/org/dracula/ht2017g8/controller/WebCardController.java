package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCardBO;
import org.dracula.ht2017g8.service.WebCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebCardController {

    @Autowired
    private WebCardService webCardService;

    @RequestMapping(value="/web_card/{id}", method=RequestMethod.GET)
    public CommonBO<WebCardBO> getById(@PathVariable("id") String id){
        int id_int;
        try {
            id_int = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            CommonBO<WebCardBO> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00009);
            return rslt;
        }
        CommonBO<WebCardBO> webCardBOCommonBO = webCardService.getById(id_int);
        if(webCardBOCommonBO != null){
            return webCardBOCommonBO;
        }else{
            CommonBO<WebCardBO> rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00008);
            return rslt;
        }
    }

    @RequestMapping(value="/web_card", method=RequestMethod.GET)
    public CommonBO<List<WebCardBO>> getSome(){
        CommonBO<List<WebCardBO>> listCommonBO = webCardService.getSome(8);
        if(listCommonBO != null){
            return listCommonBO;
        }else{
            listCommonBO = new CommonBO<>();
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00017);
            return listCommonBO;
        }
    }

    @RequestMapping(value="/web_card/scanner/column", method=RequestMethod.GET)
    public CommonBO<List<WebCardBO>> getByProduct(@RequestParam("product") String product){
        CommonBO<List<WebCardBO>> listCommonBO = webCardService.getByProduct(product);
        if(listCommonBO != null){
            return listCommonBO;
        }else{
            listCommonBO = new CommonBO<>();
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00031);
            return listCommonBO;
        }
    }

}
