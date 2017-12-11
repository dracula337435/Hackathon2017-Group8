package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebTimelineBO;
import org.dracula.ht2017g8.service.WebTimelineService;
import org.dracula.ht2017g8.vo.CommonVO;
import org.dracula.ht2017g8.vo.WebTimelineVO;
import org.springframework.beans.BeanUtils;
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
    public CommonVO<WebTimelineVO> getByCustId(@PathVariable("custId") String custId){
        CommonBO<WebTimelineBO> webTimelineBOCommonBO = webTimelineService.getByCustId(custId);
        CommonVO<WebTimelineVO> webTimelineVOCommonVO = new CommonVO<>();
        if(webTimelineBOCommonBO !=null){
            if(ReturnCodeAndMsg.SUCCESS.equals(webTimelineBOCommonBO.getCode())){
                WebTimelineBO webTimelineBO = webTimelineBOCommonBO.getData();
                WebTimelineVO webTimelineVO = new WebTimelineVO();
                BeanUtils.copyProperties(webTimelineBO, webTimelineVO);
                webTimelineVOCommonVO.setCode(ReturnCodeAndMsg.SUCCESS);
                webTimelineVOCommonVO.setData(webTimelineVO);
                return webTimelineVOCommonVO;
            }else{
                webTimelineVOCommonVO.setCode(webTimelineBOCommonBO.getCode());
                webTimelineVOCommonVO.setMsg(webTimelineBOCommonBO.getMsg());
                return webTimelineVOCommonVO;
            }
        }else{
            webTimelineVOCommonVO.setCode("00002");
            webTimelineVOCommonVO.setMsg("查询客户web_timeline信息，后台异常，向portal返回null");
            return webTimelineVOCommonVO;
        }
    }

}
