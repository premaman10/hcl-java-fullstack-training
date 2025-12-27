package org.example;

import org.example.helper.Laptop;
import org.example.helper.Pen;
import org.example.helper.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Student getStudent() {
        return new Student();
    }


    @Bean
    public Laptop getLaptop() {
        return new Laptop();
    }

    @Bean
    public Pen getPen(){
        return  new Pen();
    }
}
