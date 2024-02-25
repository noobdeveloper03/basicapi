package com.example.basicapi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BasicapiApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(BasicapiApplication.class, args);
		System.out.println("############Sample");
		System.out.println("############Sample");
		System.out.println("############Sample");
		System.out.println("############Sample");
		System.out.println("############Sample");
	}

	@PostConstruct
	public void displayProperties() {
		System.out.println("######DB URL: " + env.getProperty("spring.datasource.url"));
		System.out.println("######DB Username: " +  env.getProperty("spring.datasource.username"));
		System.out.println("######DB Password: " +  env.getProperty("spring.datasource.password"));
	}
}
