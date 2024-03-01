package org.springproject.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.componentscan");

        ApacReport report = applicationContext.getBean("apacReport" , ApacReport.class);

        report.getReport();
    }
}
