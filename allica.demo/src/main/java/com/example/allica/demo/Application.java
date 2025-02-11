package com.example.allica.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//	here is a requirement to enable storing customer details
//	and provide an endpoint returning the data.
//	Customer details - First Name, Last Name and Date Of Birth

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
