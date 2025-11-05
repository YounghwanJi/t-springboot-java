package com.template.tspringbootjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TSpringbootJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TSpringbootJavaApplication.class, args);
    }

}
