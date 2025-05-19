package com.iot.rule.engine.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.iot")
public class RuleEngineServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuleEngineServiceApplication.class, args);
    }
}
