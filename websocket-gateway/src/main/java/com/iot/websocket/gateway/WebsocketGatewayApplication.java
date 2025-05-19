package com.iot.websocket.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.iot")
public class WebsocketGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsocketGatewayApplication.class, args);
    }
}
