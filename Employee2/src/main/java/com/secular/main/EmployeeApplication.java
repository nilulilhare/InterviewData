package com.secular.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		System.out.println("Employee project"); 
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
