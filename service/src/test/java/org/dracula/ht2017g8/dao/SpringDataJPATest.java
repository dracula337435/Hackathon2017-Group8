package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.dao.jpa.WebCustomerDAO;
import org.dracula.ht2017g8.po.jpa.WebCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataJPATest.Config.class, DataSourceH2.class})
public class SpringDataJPATest {

    @Autowired
    private WebCustomerDAO webCustomerDAO;

    @Test
    public void test1(){
        List<WebCustomer> list = webCustomerDAO.findAll();
        System.out.println(list);
    }

    @Configuration
    @EnableJpaRepositories(basePackages="org.dracula.ht2017g8.dao.jpa", entityManagerFactoryRef = "entityManagerFactory")
    @ImportResource("classpath:org/dracula/ht2017g8/dao/jpa/jpa.xml")
    public static class Config{

//        @Bean
//        public EntityManagerFactory entityManagerFactory() {
//            LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//            emf.setDataSource(dataSource());
//            emf.setPackagesToScan("org.dracula.ht2017g8.po");
//            emf.setJpaVendorAdapter(jpaVendorAdapter());
//            return emf.getObject();
//        }
//
//        @Bean
//        public JpaTransactionManager transactionManager(){
//            JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//            jpaTransactionManager.setEntityManagerFactory(entityManagerFactory());
//            return jpaTransactionManager;
//        }

    }

}
