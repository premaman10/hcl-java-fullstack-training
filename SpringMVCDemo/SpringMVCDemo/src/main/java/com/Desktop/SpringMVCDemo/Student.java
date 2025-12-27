package com.Desktop.SpringMVCDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {
    int roll;
    int age;
    String name;
    String branch;
    double cgpa;
    boolean isPlaced;
    public Student(int roll, int age, String name){
        this.roll = roll;
        this.age = age;
        this.name = name;
    }


}
