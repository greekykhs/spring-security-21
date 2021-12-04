package com.greekykhs.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.greekykhs.controller")
public class SpringSecurity21Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity21Application.class, args);
	}
}
