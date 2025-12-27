package com.Desktop.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Bike implements  Vehicle{
    @Override
    public void Start() {
        System.out.println("Bike Started");
    }
}
