package com.Desktop.SpringBootDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{

    @Override
    public void Start() {
        System.out.println("Car Started");
    }
}
