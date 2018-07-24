package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.security", "com.demo.web", "com.demo.rest"})
public class SpringBootHelloWorld4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorld4Application.class, args);
	}
}
