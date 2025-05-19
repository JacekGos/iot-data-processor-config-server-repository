package com.iot.mqtt.to.kafka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.iot")
public class MqttToKafkaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqttToKafkaServiceApplication.class, args);
    }
}
