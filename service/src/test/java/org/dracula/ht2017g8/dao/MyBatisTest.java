package org.dracula.ht2017g8.dao;

import org.dracula.ht2017g8.dao.mybatis.WebTimeLineDAO;
import org.dracula.ht2017g8.po.mybatis.WebTimeLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyBatisTest.Config.class, DataSourceH2.class})
public class MyBatisTest {

    @Autowired
    WebTimeLineDAO webTimeLineDAO;

    @Test
    public void test(){
        List<WebTimeLine> webTimeLines = webTimeLineDAO.selectAll();
        System.out.println(webTimeLines);
    }

    @Configuration
    public static class Config{

        @Bean
        public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException{
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(dataSource);
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("org/dracula/ht2017g8/dao/mapper/*.xml"));
            return sqlSessionFactoryBean;
        }

        @Bean
        public MapperScannerConfigurer mapperScannerConfigurer(){
            MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
            mapperScannerConfigurer.setBasePackage("org.dracula.ht2017g8.dao.mybatis");
            mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
            return mapperScannerConfigurer;
        }

    }

}
