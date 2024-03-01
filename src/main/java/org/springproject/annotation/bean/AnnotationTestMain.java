package org.springproject.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext("org.springproject.annotation.bean");

        Customer customer = applicationContext.getBean("customer", Customer.class);

        customer.setCustomerId(45);
        customer.setCustomerName("Akash");

        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerId());

        CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
        customerService.setCustomerServiceId(392);
        customerService.setCustomerServiceName("Manoj");
        System.out.println(customerService.getCustomerServiceId());
        System.out.println(customerService.getCustomerServiceName());


        CustomerRepository customerRepository = applicationContext.getBean("customerRepository",CustomerRepository.class);
            customerRepository.setCustomer2Id(96);
            customerRepository.setCustomer2Name("Rajesh");
        System.out.println(customerRepository.getCustomer2Id());
        System.out.println(customerRepository.getCustomer2Name());

        applicationContext.close();

    }

}
