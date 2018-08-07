package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCardBO;
import org.dracula.ht2017g8.dao.mybatis.WebCardMapper;
import org.dracula.ht2017g8.dao.mybatis.WebCardNewMapper;
import org.dracula.ht2017g8.po.mybatis.WebCard;
import org.dracula.ht2017g8.po.mybatis.WebCardExample;
import org.dracula.ht2017g8.service.WebCardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class WebCardServiceImpl implements WebCardService {

    @Autowired
    private WebCardMapper webCardMapper;

    @Autowired
    private WebCardNewMapper webCardNewMapper;

    @Override
    public CommonBO<WebCardBO> getByCardCode(String cardCode) {
        WebCardExample webCardExample = new WebCardExample();
        WebCardExample.Criteria webCardExampleCriteria = webCardExample.createCriteria();
        webCardExampleCriteria.andCardCodeEqualTo(cardCode);
        CommonBO<WebCardBO> webCardBOCommonBO = new CommonBO<>();
        List<WebCard> webCards = webCardMapper.selectByExampleWithBLOBs(webCardExample);
        if(webCards !=null && webCards.size() >0){
            WebCard webCard = webCards.get(0);
            WebCardBO webCardBO = new WebCardBO();
            BeanUtils.copyProperties(webCard, webCardBO);
            webCardBOCommonBO.setData(webCardBO);
            webCardBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return webCardBOCommonBO;
        }else{
            webCardBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00003);
            return webCardBOCommonBO;
        }
    }

    @Override
    public CommonBO<List<WebCardBO>> getSome(int limit) {
        WebCardExample webCardExample = new WebCardExample();
        webCardExample.setOrderByClause("id");
        List<WebCard> webCards = webCardMapper.selectByExampleWithBLOBs(webCardExample);
        CommonBO<List<WebCardBO>> rslt = new CommonBO<>();
        List<WebCardBO> list = new LinkedList<>();
        if(webCards != null && webCards.size()>0){
            int size = webCards.size();
            if(size < limit) {
                limit = size;
            }
            for(int i=0; i<limit; i++){
                WebCard po = webCards.get(i);
                WebCardBO bo = new WebCardBO();
                BeanUtils.copyProperties(po, bo);
                list.add(bo);
            }
            rslt.setData(list);
            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return rslt;
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00016);
            return rslt;
        }
    }

    @Override
    public CommonBO<List<WebCardBO>> getByProduct(String product) {
        CommonBO<List<WebCardBO>> listCommonBO = new CommonBO<>();
        List<WebCard> poList = webCardNewMapper.getByProduct(product);
        if(poList != null && poList.size() > 0){
            List<WebCardBO> boList = new LinkedList<>();
            for(WebCard po: poList){
                WebCardBO bo = new WebCardBO();
                BeanUtils.copyProperties(po, bo);
                boList.add(bo);
            }
            listCommonBO.setData(boList);
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return listCommonBO;
        }else{
            listCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00030);
            return listCommonBO;
        }
    }
}
