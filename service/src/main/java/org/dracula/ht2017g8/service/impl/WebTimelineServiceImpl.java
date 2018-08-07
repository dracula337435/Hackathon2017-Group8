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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author dk
 */
@Component
public class WebTimelineServiceImpl implements WebTimelineService {

    @Autowired
    private WebTimelineMapper webTimelineMapper;

    @Override
    public CommonBO<Map<String, List<WebTimelineBO>>> getByCustId(String custId){
        WebTimelineExample webTimelineExample = new WebTimelineExample();
        WebTimelineExample.Criteria criteria = webTimelineExample.createCriteria();
        criteria.andCustidEqualTo(custId);
        List<WebTimeline> webTimelines = webTimelineMapper.selectByExample(webTimelineExample);
        //
        CommonBO<Map<String, List<WebTimelineBO>>> rslt = new CommonBO<>();
        if(webTimelines != null && webTimelines.size() > 0){

            Map<String, List<WebTimelineBO>> mapByYear = new HashMap<>();

            for(WebTimeline webTimeline: webTimelines){
                WebTimelineBO webTimelineBO = new WebTimelineBO();
                BeanUtils.copyProperties(webTimeline, webTimelineBO);
                String dateTime = webTimelineBO.getDatetime();
                if(dateTime != null && dateTime.length()>=4){
                    String year = dateTime.substring(0, 4);
                    add(mapByYear, year, webTimelineBO);
                }else{
                    add(mapByYear, "其他时间", webTimelineBO);
                }
            }

            rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            rslt.setData(mapByYear);
            return rslt;
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00001);
            return rslt;
        }
    }

    private <K, ListElement> void add(Map<K, List<ListElement>> map, K key, ListElement ele){
        List<ListElement> list = map.get(key);
        if(list == null){
            list = new LinkedList<>();
            map.put(key, list);
        }
        list.add(ele);
    }

}
