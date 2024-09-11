package com.moduler.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EntityScan(basePackages = "org.module.persistence.entity")
@EnableJpaRepositories(basePackages = {"org.module.persistence.repository"})
@SpringBootApplication(scanBasePackages = {"org.module", "com.moduler"})
public class TodoModuleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoModuleAppApplication.class, args);
    }

}
