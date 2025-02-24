package com.example.Spring_Learning;

import org.springframework.boot.SpringApplication;

public class TestSpringLearningApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringLearningApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
