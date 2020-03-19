package com.study.d2spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class D2SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(D2SpringApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
}
