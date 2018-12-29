package com.ivarrace.base.app.controller;

import com.ivarrace.base.lib.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String home() {
        return testService.message();
    }

    @GetMapping("/log")
    public String log() {
        testService.testLog();
        return "DONE! Show app log";
    }
}
