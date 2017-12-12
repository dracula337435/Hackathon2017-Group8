package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustomerBO;
import org.dracula.ht2017g8.dao.mybatis.WebCustomerMapper;
import org.dracula.ht2017g8.po.mybatis.WebCustomer;
import org.dracula.ht2017g8.po.mybatis.WebCustomerExample;
import org.dracula.ht2017g8.service.WebCustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebCustomerServiceImpl implements WebCustomerService{

    @Autowired
    private WebCustomerMapper webCustomerMapper;

    @Override
    public CommonBO<WebCustomerBO> getByCustId(String custId) {
        WebCustomerExample webCustomerExample = new WebCustomerExample();
        WebCustomerExample.Criteria webCustomerExampleCriteria = webCustomerExample.createCriteria();
        webCustomerExampleCriteria.andCustidEqualTo(custId);
        CommonBO<WebCustomerBO> webCustomerBOCommonBO = new CommonBO<>();
        List<WebCustomer> webCustomers = webCustomerMapper.selectByExample(webCustomerExample);
        if(webCustomers != null && webCustomers.size() > 0){
            WebCustomer webCustomer = webCustomers.get(0);
            WebCustomerBO webCustomerBO = new WebCustomerBO();
            BeanUtils.copyProperties(webCustomer, webCustomerBO);
            webCustomerBOCommonBO.setData(webCustomerBO);
            webCustomerBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return webCustomerBOCommonBO;
        }else{
            webCustomerBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00005);
            return webCustomerBOCommonBO;
        }
    }
}
