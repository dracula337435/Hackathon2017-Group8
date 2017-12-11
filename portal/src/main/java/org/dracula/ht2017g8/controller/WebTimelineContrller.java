package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.WebTimelineBO;
import org.dracula.ht2017g8.service.WebTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTimelineContrller {

    @Autowired
    WebTimelineService webTimelineService;

    @RequestMapping(value="/web_timeline/{custId}", method= RequestMethod.GET)
    public CommonBO<WebTimelineBO> getByCustId(@PathVariable("custId") String custId){
        CommonBO<WebTimelineBO> webTimelineBOCommonBO = webTimelineService.getByCustId(custId);
        if(webTimelineBOCommonBO !=null){
            return webTimelineBOCommonBO;
        }else{
            CommonBO<WebTimelineBO> webTimelineVOCommonVO = new CommonBO<>();
            webTimelineVOCommonVO.setCode("00002");
            webTimelineVOCommonVO.setMsg("查询客户web_timeline信息，后台异常，向portal返回null");
            return webTimelineVOCommonVO;
        }
    }

}
