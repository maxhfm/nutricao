package com.nutricao.sistemaNutricional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaNutricionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaNutricionalApplication.class, args);
	}
	
	@Bean
	pubic Java8TimeDialect java8TimeDialect(){
		return new Java8TimeDialect();
	}
}
