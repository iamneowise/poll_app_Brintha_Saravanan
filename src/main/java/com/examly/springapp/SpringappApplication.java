package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		System.out.println("Started");
		System.out.println("Controller is started");
		SpringApplication.run(SpringappApplication.class, args);
	}

}
