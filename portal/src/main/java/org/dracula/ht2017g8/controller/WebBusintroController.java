package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebBusintroBO;
import org.dracula.ht2017g8.service.WebBusintroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dk
 */
@RestController
public class WebBusintroController {

    @Autowired
    private WebBusintroService webBusintroService;

    @RequestMapping(value="/web_busintro", method=RequestMethod.GET)
    public CommonBO<List<WebBusintroBO>> getAll(){
        CommonBO<List<WebBusintroBO>> listCommonBO = webBusintroService.getAll();
        if(listCommonBO != null){
            return listCommonBO;
        }else{
            listCommonBO = new CommonBO<>();
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00013);
            return listCommonBO;
        }
    }

}
