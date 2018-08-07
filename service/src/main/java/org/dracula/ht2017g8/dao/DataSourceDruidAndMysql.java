package org.dracula.ht2017g8.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 * @author dk
 */
@Configuration
@Profile("DataSourceDruidAndMysql")
public class DataSourceDruidAndMysql {

    @Value("${db.ip.and.port}")
    private String db_ip_port;

    @Value("${db.user}")
    private String db_user;

    @Value("${db.pswd}")
    private String db_pswd;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://" +
                db_ip_port +
                "/" +
                "team8" +
                "?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
        dataSource.setUsername(db_user);
        dataSource.setPassword(db_pswd);
        dataSource.setInitialSize(0);
        dataSource.setMaxActive(30);
        dataSource.setMinIdle(1);
        dataSource.setMaxWait(60000);
        dataSource.setValidationQuery("SELECT 1");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(false);
        adapter.setGenerateDdl(true);
        return adapter;
    }

}
