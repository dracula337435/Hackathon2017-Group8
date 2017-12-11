package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCardapplyBO;
import org.dracula.ht2017g8.dao.mybatis.WebCardapplyMapper;
import org.dracula.ht2017g8.po.mybatis.WebCardapply;
import org.dracula.ht2017g8.po.mybatis.WebCardapplyExample;
import org.dracula.ht2017g8.service.WebCardapplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebCardapplyServiceImpl implements WebCardapplyService {

    @Autowired
    public WebCardapplyMapper webCardapplyMapper;

    @Override
    public CommonBO<WebCardapplyBO> getById(Integer id) {
        WebCardapplyExample webCardapplyExample = new WebCardapplyExample();
        WebCardapplyExample.Criteria webCardapplyExampleCriteria = webCardapplyExample.createCriteria();
        webCardapplyExampleCriteria.andIdEqualTo(id);
        List<WebCardapply> webCardapplies = webCardapplyMapper.selectByExample(webCardapplyExample);
        CommonBO<WebCardapplyBO> cardapplyBOCommonBO = new CommonBO<>();
        if(webCardapplies != null && webCardapplies.size() >0){
            WebCardapply webCardapply = webCardapplies.get(0);
            WebCardapplyBO webCardapplyBO = new WebCardapplyBO();
            BeanUtils.copyProperties(webCardapply, webCardapplyBO);
            cardapplyBOCommonBO.setData(webCardapplyBO);
            cardapplyBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return cardapplyBOCommonBO;
        }else{
            cardapplyBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00004);
            return cardapplyBOCommonBO;
        }
    }

    @Override
    public CommonBO<Integer> add(WebCardapplyBO webCardapplyBO) {
        WebCardapply webCardapply = new WebCardapply();
        BeanUtils.copyProperties(webCardapplyBO, webCardapply);
        CommonBO<Integer> integerCommonBO = new CommonBO<>();
        int affected = webCardapplyMapper.insert(webCardapply);
        if(affected == 0){
            integerCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00006);
            return integerCommonBO;
        }else{
            integerCommonBO.setData(affected);
            integerCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return integerCommonBO;
        }
    }
}
