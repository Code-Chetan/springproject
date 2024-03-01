package org.springproject.postconstructpredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.postconstructpredestroy");

        //removing the bean
        applicationContext.close();

    }
}
