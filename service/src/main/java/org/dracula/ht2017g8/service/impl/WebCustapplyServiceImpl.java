package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustapplyBO;
import org.dracula.ht2017g8.bo_othersys.CardPredictBO;
import org.dracula.ht2017g8.dao.mybatis.WebCustapplyMapper;
import org.dracula.ht2017g8.po.mybatis.WebCustapply;
import org.dracula.ht2017g8.po.mybatis.WebCustapplyExample;
import org.dracula.ht2017g8.service.WebCustapplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebCustapplyServiceImpl implements WebCustapplyService {

    @Autowired
    private WebCustapplyMapper webCustapplyMapper;

    @Override
    public CommonBO<WebCustapplyBO> getById(String custId) {
        CommonBO<WebCustapplyBO> rslt = new CommonBO<>();
        WebCustapplyExample example = new WebCustapplyExample();
        WebCustapplyExample.Criteria criteria = example.createCriteria();
        criteria.andCustidEqualTo(custId);
        List<WebCustapply> webCustapplies = webCustapplyMapper.selectByExample(example);
        if(webCustapplies != null && webCustapplies.size() >0 ){
            WebCustapply po = webCustapplies.get(0);
            WebCustapplyBO bo = new WebCustapplyBO();
            BeanUtils.copyProperties(po, bo);
            rslt.setData(bo);
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return rslt;
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00028);
            return rslt;
        }
    }
}
