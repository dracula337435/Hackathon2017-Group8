package org.dracula.ht2017g8.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author dk
 */
@Configuration
@EnableJpaRepositories(basePackages="org.dracula.ht2017g8.dao.jpa", entityManagerFactoryRef = "entityManagerFactory")
@ImportResource("classpath:org/dracula/ht2017g8/dao/jpa/jpa.xml")
public class SpringDataJPAConfig {

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
