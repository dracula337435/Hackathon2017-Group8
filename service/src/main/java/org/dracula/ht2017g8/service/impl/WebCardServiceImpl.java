package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCardBO;
import org.dracula.ht2017g8.dao.mybatis.WebCardMapper;
import org.dracula.ht2017g8.po.mybatis.WebCard;
import org.dracula.ht2017g8.po.mybatis.WebCardExample;
import org.dracula.ht2017g8.service.WebCardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebCardServiceImpl implements WebCardService {

    @Autowired
    WebCardMapper webCardMapper;

    @Override
    public CommonBO<WebCardBO> getById(Integer id) {
        WebCardExample webCardExample = new WebCardExample();
        WebCardExample.Criteria webCardExampleCriteria = webCardExample.createCriteria();
        webCardExampleCriteria.andIdEqualTo(id);
        CommonBO<WebCardBO> webCardBOCommonBO = new CommonBO<>();
        List<WebCard> webCards = webCardMapper.selectByExample(webCardExample);
        if(webCards !=null && webCards.size() >0){
            WebCard webCard = webCards.get(0);
            WebCardBO webCardBO = new WebCardBO();
            BeanUtils.copyProperties(webCard, webCardBO);
            webCardBOCommonBO.setData(webCardBO);
            webCardBOCommonBO.setCode(ReturnCodeAndMsg.SUCCESS);
            return webCardBOCommonBO;
        }else{
            webCardBOCommonBO.setCode("00003");
            webCardBOCommonBO.setMsg("未能检索到此客户的web_card信息");
            return webCardBOCommonBO;
        }
    }

}
