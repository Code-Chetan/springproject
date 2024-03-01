package org.springproject.xml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        // This one is for capturing file from classpath
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // By using this FIleSystemXmlApplicationContext we can keep our file at any location.
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("C://XML Config Files/applicationContext.xml");


        Employee employee = applicationContext.getBean("employee", Employee.class);
        Student student = applicationContext.getBean("student", Student.class);

        employee.getEmployeeDetails();
        student.getStdentDetails();
    }
}
