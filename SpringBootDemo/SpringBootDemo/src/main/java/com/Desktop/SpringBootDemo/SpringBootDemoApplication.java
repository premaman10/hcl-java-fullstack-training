package com.Desktop.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		Person p1 = context.getBean(Person.class);
		p1.name = "PREM";
		p1.age = 21;
		System.out.println(p1.name+"  "+p1.age);
//		Vehicle vehicle = context.getBean(Car.class);\
//		Vehicle vehicle = context.getBean(Bike.class);
//		p1.vehicle = vehicle;
		p1.vehicle.Start();
	}

}
