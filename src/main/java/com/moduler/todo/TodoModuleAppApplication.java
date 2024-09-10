package com.moduler.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.module.*"})
public class TodoModuleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoModuleAppApplication.class, args);
	}

}
