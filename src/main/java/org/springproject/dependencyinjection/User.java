package org.springproject.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    //Autowire Annotation injecting ways -order wise
    //by Type
    //By qualifer
    //By name

    @Qualifier("toyota")
    @Autowired
    Vehicle vehicle;


    public User(){
    }

    public  void print(){
        vehicle.engine();
    }
}
