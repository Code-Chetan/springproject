package org.springproject.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Hyundai implements Vehicle{
    @Override
    public void engine() {
        System.out.println("+++++++++Hyndai Engine+++++++++");
    }
}
