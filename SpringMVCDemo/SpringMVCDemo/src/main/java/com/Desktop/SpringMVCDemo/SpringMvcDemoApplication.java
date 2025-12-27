package com.Desktop.SpringMVCDemo;

import com.Desktop.SpringMVCDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringMvcDemoApplication implements CommandLineRunner {

	@Autowired
	StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		repo.save(List.of()); // THIS LINE CREATES TABLE
	}
}

