package org.springproject.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaBasedconfig {


    @Bean(name = "date1")
    public Date date(){
        return new Date();
    }
}
