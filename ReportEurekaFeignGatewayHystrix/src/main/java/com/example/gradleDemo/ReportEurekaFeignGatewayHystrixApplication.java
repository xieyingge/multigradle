package com.example.gradleDemo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableDistributedTransaction
public class ReportEurekaFeignGatewayHystrixApplication {
    //天气预报

    public static void main(String[] args) {
        SpringApplication.run(ReportEurekaFeignGatewayHystrixApplication.class, args);
    }

}
