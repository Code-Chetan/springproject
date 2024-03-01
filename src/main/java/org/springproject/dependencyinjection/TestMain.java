package org.springproject.dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.dependencyinjection");
        User user = applicationContext.getBean("user", User.class);

        user.print();
    }
}
