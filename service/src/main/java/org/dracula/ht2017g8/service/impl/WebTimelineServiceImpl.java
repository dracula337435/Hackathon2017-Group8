package org.dracula.ht2017g8.service.impl;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebTimelineBO;
import org.dracula.ht2017g8.dao.mybatis.WebTimelineMapper;
import org.dracula.ht2017g8.po.mybatis.WebTimeline;
import org.dracula.ht2017g8.po.mybatis.WebTimelineExample;
import org.dracula.ht2017g8.service.WebTimelineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebTimelineServiceImpl implements WebTimelineService {

    @Autowired
    private WebTimelineMapper webTimelineMapper;

    @Override
    public CommonBO<WebTimelineBO> getByCustId(String custId){
        WebTimelineExample webTimelineExample = new WebTimelineExample();
        WebTimelineExample.Criteria criteria = webTimelineExample.createCriteria();
        criteria.andCustidEqualTo(custId);
        List<WebTimeline> webTimelines = webTimelineMapper.selectByExample(webTimelineExample);
        //
        CommonBO<WebTimelineBO> rslt = new CommonBO<>();
        if(webTimelines != null && webTimelines.size() > 0){
            WebTimeline webTimeline = webTimelines.get(0);
            WebTimelineBO webTimelineBO = new WebTimelineBO();
            BeanUtils.copyProperties(webTimeline, webTimelineBO);
            rslt.setCode(ReturnCodeAndMsg.SUCCESS);
            rslt.setData(webTimelineBO);
            return rslt;
        }else{
            rslt.setCode("00001");
            rslt.setMsg("未能检索到此客户的web_timeline信息");
            return rslt;
        }
    }

}
