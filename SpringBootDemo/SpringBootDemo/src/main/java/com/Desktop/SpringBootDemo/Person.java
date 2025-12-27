package com.Desktop.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public  int age;
    public  String name;
    @Autowired
    @Qualifier
    public  Vehicle vehicle;
}
