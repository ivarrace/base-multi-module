package com.ivarrace.base.core.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dao")
public class TestServiceProperties {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}