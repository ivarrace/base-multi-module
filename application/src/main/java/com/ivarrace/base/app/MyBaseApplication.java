package com.ivarrace.base.app;

import com.ivarrace.base.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.ivarrace.base")
@RestController
public class MyBaseApplication {

    private final TestService testService;

    public MyBaseApplication(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String home() {
        return testService.message();
    }

    @GetMapping("/log")
    public void log() {
        testService.testLog();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyBaseApplication.class, args);
    }
}