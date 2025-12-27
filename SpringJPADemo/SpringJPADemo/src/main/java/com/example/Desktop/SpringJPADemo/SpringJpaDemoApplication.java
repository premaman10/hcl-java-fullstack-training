package com.example.Desktop.SpringJPADemo;

import com.example.Desktop.SpringJPADemo.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaDemoApplication.class, args);
		StudentController contoller = context.getBean(StudentController.class);
	}

}
