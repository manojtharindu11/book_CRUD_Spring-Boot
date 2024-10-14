package com.example.bookcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.bookcrud.model")
@EnableJpaRepositories(basePackages = "com.example.bookcrud.repository")
public class BookCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCrudApplication.class, args);
    }
}
