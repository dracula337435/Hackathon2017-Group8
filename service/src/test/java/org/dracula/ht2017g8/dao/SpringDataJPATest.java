package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.po.WebCustomer;
import org.dracula.ht2017g8.po.WebTimeLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataJPATest.Config.class})
public class SpringDataJPATest {

    @Autowired
    private WebCustomerDAO webCustomerDAO;

    @Autowired
    private WebTimeLineDAO webTimeLineDAO;

    @Test
    public void test1(){
        List<WebCustomer> list = webCustomerDAO.findAll();
        System.out.println(list);
    }

    @Test
    public void test2(){
        List<WebTimeLine> list = webTimeLineDAO.findAll();
        System.out.println(list);
    }

    @Configuration
    @EnableJpaRepositories(basePackages="org.dracula.ht2017g8.dao", entityManagerFactoryRef = "entityManagerFactory")
    @ImportResource("classpath:org/dracula/ht2017g8/dao/jpa.xml")
    public static class Config{

        @Bean
        public DataSource dataSource(){
            return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2)
                    .addScript("classpath:/org/dracula/ht2017g8/dao/create-tables.sql")
                    .addScript("classpath:/org/dracula/ht2017g8/dao/test-data.sql")
                    .build();
        }

        @Bean
        public JpaVendorAdapter jpaVendorAdapter() {
            HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
            adapter.setDatabase(Database.H2);
            adapter.setShowSql(false);
            adapter.setGenerateDdl(true);
            return adapter;
        }

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
