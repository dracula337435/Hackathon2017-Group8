package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustapplyBO;
import org.dracula.ht2017g8.bo_othersys.CardPredictBO;
import org.dracula.ht2017g8.service.ModelService;
import org.dracula.ht2017g8.service.PredictionService;
import org.dracula.ht2017g8.service.WebCustapplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PredictionServiceImpl implements PredictionService {

    private static Logger logger = LoggerFactory.getLogger(PredictionServiceImpl.class);

    @Autowired
    private WebCustapplyService webCustapplyService;

    @Autowired
    private ModelService modelService;

    @Override
    public CommonBO<String> getPayLoad(String custId) {
        CommonBO<String> rslt = new CommonBO<>();
        CommonBO<WebCustapplyBO> webCustapplyBOCommonBO = webCustapplyService.getById(custId);
        logger.info("从数据库查web_custapply，入参custId="+custId+"，返回="+webCustapplyBOCommonBO);
        String payload = null;
        if(webCustapplyBOCommonBO != null){
            WebCustapplyBO po = null;
            if(ReturnCodeAndMsg.SUCCESS.getCode().equals(webCustapplyBOCommonBO.getCode())){
                po = webCustapplyBOCommonBO.getData();
            }else{
                CommonBO<String> tmpRslt = new CommonBO<>();
                tmpRslt.setCode(webCustapplyBOCommonBO.getCode());
                tmpRslt.setMsg(webCustapplyBOCommonBO.getMsg());
                return tmpRslt;
            }
            CardPredictBO bo = new CardPredictBO();
            BeanUtils.copyProperties(po, bo);
            try {
                payload = ModelServiceImpl.getRequiredJson(bo);
                logger.info("拼凑预测所需内容。入参="+bo+"，返回="+payload);
                rslt.setData(payload);
                rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
                return rslt;
            } catch (Exception e) {
                e.printStackTrace();
                rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00020);
                return rslt;
            }
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00019);
            return rslt;
        }
    }

    @Override
    public CommonBO<String> predict(String custId){
        logger.info("将要进行客户推荐的信用卡预测，入参custId="+custId);
        CommonBO<String> rslt = getPayLoad(custId);
        if(rslt != null){
            if(!ReturnCodeAndMsg.SUCCESS.getCode().equals(rslt.getCode())){
                return rslt;
            }
        }else{
            rslt = new CommonBO<>();
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00032);
            return rslt;
        }
        String payload = rslt.getData();
        CommonBO<String> stringCommonBO = modelService.predict(payload);
        if(stringCommonBO != null){
            return stringCommonBO;
        }else{
            stringCommonBO = new CommonBO<>();
            stringCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00025);
            return stringCommonBO;
        }
    }
}
