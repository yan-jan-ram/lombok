package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Details details = new Details();
		
		details.setId(01);
		details.setName("Ravi");
		details.setIsInterested(true);
		
		System.out.println(details.getId());
		System.out.println(details.getName());
		System.out.println(details.getIsInterested());
	}

}
