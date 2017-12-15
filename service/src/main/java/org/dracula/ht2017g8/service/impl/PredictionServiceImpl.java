package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo_othersys.CardPredictBO;
import org.dracula.ht2017g8.dao.mybatis.WebCustapplyMapper;
import org.dracula.ht2017g8.po.mybatis.WebCustapply;
import org.dracula.ht2017g8.po.mybatis.WebCustapplyExample;
import org.dracula.ht2017g8.service.ModelService;
import org.dracula.ht2017g8.service.PredictionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PredictionServiceImpl implements PredictionService {

    @Autowired
    private WebCustapplyMapper webCustapplyMappler;

    @Autowired
    private ModelService modelService;

    @Override
    public CommonBO<String> predict(String custId){
        CommonBO<String> rslt = new CommonBO<>();
        WebCustapplyExample example = new WebCustapplyExample();
        WebCustapplyExample.Criteria criteria = example.createCriteria();
        criteria.andCustidEqualTo(custId);
        List<WebCustapply> webCustapplies = webCustapplyMappler.selectByExample(example);
        String payload = null;
        if(webCustapplies != null && webCustapplies.size() >0 ){
            WebCustapply po = webCustapplies.get(0);
            CardPredictBO bo = new CardPredictBO();
            BeanUtils.copyProperties(po, bo);
            try {
                payload = ModelServiceImpl.getRequiredJson(bo);
            } catch (Exception e) {
                e.printStackTrace();
                rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00020);
                return rslt;
            }
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00019);
            return rslt;
        }
        CommonBO<String> stringCommonBO = modelService.predict(payload);
        if(stringCommonBO != null){
            return stringCommonBO;
        }else{
            stringCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00007);
            return stringCommonBO;
        }
    }
}
