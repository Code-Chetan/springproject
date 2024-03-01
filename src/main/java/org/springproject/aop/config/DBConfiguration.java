package org.springproject.aop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource("classpath:dbconfig.properties")
public class DBConfiguration {

    @Value("${dbconfig.url}")
    private String url;
    @Value("${dbconfig.username}")
    private String username;
    @Value("${dbconfig.password}")
    private String password;
    @Value("${dbconfig.driver}")
    private String driver;


    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setDriverClassName(driver);

        return  driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource());
      //  jdbcTemplate.setDataSource(driverManagerDataSource());
        return  jdbcTemplate;
    }
}
