package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebRateBO;
import org.dracula.ht2017g8.dao.mybatis.WebRateMapper;
import org.dracula.ht2017g8.po.mybatis.WebRate;
import org.dracula.ht2017g8.service.WebRateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class WebRateServiceImpl implements WebRateService {

    @Autowired
    private WebRateMapper webRateMapper;

    @Override
    public CommonBO<List<WebRateBO>> getAll() {
        List<WebRate> webRateList = webRateMapper.selectByExample(null);
        CommonBO<List<WebRateBO>> webListCommonBO = new CommonBO<>();
        if(webRateList != null && webRateList.size() > 0){
            List<WebRateBO> list = new LinkedList<>();
            for(WebRate po: webRateList){
                WebRateBO bo = new WebRateBO();
                BeanUtils.copyProperties(po, bo);
                list.add(bo);
            }
            webListCommonBO.setData(list);
            webListCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return webListCommonBO;
        }else{
            webListCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00014);
            return webListCommonBO;
        }
    }

}
