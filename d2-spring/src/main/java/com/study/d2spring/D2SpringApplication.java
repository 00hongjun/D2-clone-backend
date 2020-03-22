package com.study.d2spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class D2SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(D2SpringApplication.class, args);
    }

}
