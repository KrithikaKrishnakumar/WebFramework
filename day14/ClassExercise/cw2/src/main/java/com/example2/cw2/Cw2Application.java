package com.example2.cw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;


@SpringBootApplication
@OpenAPIDefinition
public class Cw2Application {
    
	public static void main(String[] args) {
		SpringApplication.run(Cw2Application.class, args);
	}

}
