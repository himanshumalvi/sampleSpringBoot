package com.boot.learning1.SpringBootSamplePlayGround;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.boot.learning3.bean")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {
   
        @Value("${spring.datasource.driver-class-name}") String driverClassName;
        @Value("${spring.datasource.url}") String url;
        @Value("${spring.datasource.username}") String username;
        @Value("${spring.datasource.password}") String password;
        @Bean(name = "dataSource")
        public DataSource getDataSource() {
            DataSource dataSource = DataSourceBuilder
                    .create()
                    .username(username)
                    .password(password)
                    .url(url)
                    .driverClassName(driverClassName)
                    .build();
            return dataSource;
        }

    @Bean(name = "sessionFactory")
        public SessionFactory getSessionFactory(DataSource dataSource) {
            LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
            sessionBuilder.scanPackages("com.boot.learning3.bean");
            return sessionBuilder.buildSessionFactory();
        }
        @Bean(name = "transactionManager")
        public HibernateTransactionManager getTransactionManager(
                SessionFactory sessionFactory) {
            HibernateTransactionManager transactionManager = new HibernateTransactionManager(
                    sessionFactory);
            return transactionManager;
        }   
        @Bean
        public DataSourceInitializer dataSourceInitializer(final DataSource dataSource) {
            final DataSourceInitializer initializer = new DataSourceInitializer();
            initializer.setDataSource(dataSource);
            return initializer;
        }  
}