package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.dao.mybatis.WebTimeLineDAO;
import org.dracula.ht2017g8.po.mybatis.WebTimeLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyBatisConfig.class, DataSourceH2.class})
public class MyBatisTest {

    @Autowired
    WebTimeLineDAO webTimeLineDAO;

    @Test
    public void test(){
        List<WebTimeLine> webTimeLines = webTimeLineDAO.selectAll();
        System.out.println(webTimeLines);
    }

}
