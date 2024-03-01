package org.springproject.propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.propertysource");

        MailConfiguration mailConfiguration = applicationContext.getBean("mailConfiguration", MailConfiguration.class);

        mailConfiguration.getMailConfigDetails();
        mailConfiguration.getUserDetailsFromFile();
    }
}
