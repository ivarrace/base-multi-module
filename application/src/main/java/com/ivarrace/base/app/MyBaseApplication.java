package com.ivarrace.base.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ivarrace.base")
public class MyBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBaseApplication.class, args);
    }
}