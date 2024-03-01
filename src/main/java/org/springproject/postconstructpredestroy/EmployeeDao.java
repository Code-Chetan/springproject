package org.springproject.postconstructpredestroy;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Repository
public class EmployeeDao {

    @PostConstruct
    public void getDBConnection(){
        System.out.println("******Object created*****");
    }

    @PreDestroy
    public void closeDBConnection(){
        System.out.println("*********Object destroyed***********");
    }
}
