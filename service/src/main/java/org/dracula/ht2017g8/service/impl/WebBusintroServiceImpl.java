package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebBusintroBO;
import org.dracula.ht2017g8.dao.mybatis.WebBusintroMapper;
import org.dracula.ht2017g8.po.mybatis.WebBusintro;
import org.dracula.ht2017g8.service.WebBusintroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class WebBusintroServiceImpl implements WebBusintroService {

    @Autowired
    WebBusintroMapper webBusintroMapper;

    @Override
    public CommonBO<List<WebBusintroBO>> getAll() {
        List<WebBusintro> webBusintroList = webBusintroMapper.selectByExample(null);
        CommonBO<List<WebBusintroBO>> webBusintroBOCommonBO = new CommonBO<>();
        if(webBusintroList != null && webBusintroList.size() > 0){
            List<WebBusintroBO> list = new LinkedList<>();
            for(WebBusintro po: webBusintroList){
                WebBusintroBO bo = new WebBusintroBO();
                BeanUtils.copyProperties(po, bo);
                list.add(bo);
            }
            webBusintroBOCommonBO.setData(list);
            webBusintroBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            return webBusintroBOCommonBO;
        }else{
            webBusintroBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00012);
            return webBusintroBOCommonBO;
        }
    }

}
