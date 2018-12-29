package com.ivarrace.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(TestServiceProperties.class)
public class TestService {

    private final TestServiceProperties testServiceProperties;

    Logger logger = LoggerFactory.getLogger(TestService.class);

    public TestService(TestServiceProperties testServiceProperties) {
        this.testServiceProperties = testServiceProperties;
    }

    public String message() {
        return this.testServiceProperties.getMessage();
    }

    public void testLog(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
    }
}