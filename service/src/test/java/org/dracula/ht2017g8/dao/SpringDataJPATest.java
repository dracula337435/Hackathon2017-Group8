package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.dao.jpa.WebCustomerDAO;
import org.dracula.ht2017g8.po.jpa.WebCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringDataJPAConfig.class,
                                DataSourceDruidAndMysql.class,
                                DataSourceEmbeddedH2.class})
@ActiveProfiles("DataSourceEmbeddedH2")
public class SpringDataJPATest {

    @Autowired
    private WebCustomerDAO webCustomerDAO;

    @Test
    public void test1(){
        List<WebCustomer> list = webCustomerDAO.findAll();
        System.out.println(list);
    }

}
