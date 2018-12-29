package com.ivarrace.base.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.ivarrace.base")
@EnableSwagger2
public class MyBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBaseApplication.class, args);
    }
}