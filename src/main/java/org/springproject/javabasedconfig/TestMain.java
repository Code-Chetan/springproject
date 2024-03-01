package org.springproject.javabasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.javabasedconfig");

        Employee employee = applicationContext.getBean("employee", Employee.class);

        System.out.println("___________________________________________");
        employee.getEmployeeDetails();
        System.out.println("___________________________________________");

    }
}
