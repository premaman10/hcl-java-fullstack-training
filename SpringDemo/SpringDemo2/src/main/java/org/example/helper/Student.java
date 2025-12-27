package org.example.helper;

import org.example.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.html.parser.TagElement;

public class Student {
    public String name;
    public int age;
    @Autowired
    public Laptop laptop;
    @Autowired
    public  Pen pen;
//    public  Student(){}
//    public Student(String name, int age, @Autowired  Laptop laptop) {
//        this.age = age;
//        this.name = name;
//        this.laptop = laptop;
//    }
}
