package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.dao.mybatis.WebBusintroMapper;
import org.dracula.ht2017g8.dao.mybatis.WebCustapplyMapper;
import org.dracula.ht2017g8.dao.mybatis.WebTimelineMapper;
import org.dracula.ht2017g8.po.mybatis.WebBusintro;
import org.dracula.ht2017g8.po.mybatis.WebCustapply;
import org.dracula.ht2017g8.po.mybatis.WebTimeline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyBatisConfig.class, DataSourceEmbeddedH2.class})
public class MyBatisTest {

    @Autowired
    WebTimelineMapper webTimelineMapper;

    @Test
    public void test(){
        List<WebTimeline> webTimelines = webTimelineMapper.selectByExample(null);
        System.out.println(webTimelines);
    }

    @Autowired
    WebBusintroMapper webBusintroMapper;
    @Test
    public void test2(){
        List<WebBusintro> webBusintros = webBusintroMapper.selectByExample(null);
        for(WebBusintro po: webBusintros){
            System.out.println(po.getBusiintro());
        }
    }

    @Autowired
    WebCustapplyMapper webCustapplyMapper;

    @Test
    public void test3(){
        List<WebCustapply> webCustapplies = webCustapplyMapper.selectByExample(null);
        for(WebCustapply po: webCustapplies){
            System.out.println(po);
            System.out.println(po.getMaritalStatus());
        }
    }

}
