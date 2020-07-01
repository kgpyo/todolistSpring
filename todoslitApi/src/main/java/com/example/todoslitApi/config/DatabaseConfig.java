package com.example.todoslitApi.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;

@Configuration
public class DatabaseConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource datasource() {
        BasicDataSource datasource = new BasicDataSource();
        datasource.setDriverClassName(driverClassName);
        datasource.setUrl(url);
        datasource.setUsername(userName);
        datasource.setPassword(password);
        return datasource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(datasource());
        return factoryBean.getObject();
    }
}