package org.springproject.aop1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.aop1");

        PaymentServiceImpl paymentServicrImpl = applicationContext.getBean("paymentServiceImpl", PaymentServiceImpl.class);

        paymentServicrImpl.makePayment();
    }
}
