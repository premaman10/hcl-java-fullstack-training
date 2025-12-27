package org.example;

import org.example.helper.Person;
import org.example.helper.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("hello world");
//            Person newP = new Person(25,"Prem");
            ApplicationContext newC = new ClassPathXmlApplicationContext("config.xml");

            Person newP = newC.getBean(Person.class);
            newP.name = "Prem";
            newP.age = 23;
            System.out.println("New person name is "+newP.name+" and his or her age is "+newP.age);


            Student st1 = newC.getBean(Student.class);
//            st1.name = "Aman";
//            st1.marks = 98;c
            System.out.println("Student name is "+st1.name+" and he obtained "+st1.marks+" marks in his fav subject");
        }
    }
