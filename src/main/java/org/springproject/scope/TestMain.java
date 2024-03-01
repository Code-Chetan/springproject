package org.springproject.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.scope");

        Student student = applicationContext.getBean("student", Student.class);
        Student student1 = applicationContext.getBean("student", Student.class);

        System.out.println("student hashcode " +student.hashCode());
        System.out.println("student1 hashcode " +student1.hashCode());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        Teacher teacher1= applicationContext.getBean("teacher", Teacher.class);

        System.out.println("teacher hashcode " +teacher.hashCode());
        System.out.println("teacher hashcode1 "+teacher1.hashCode());

    }
}
