package com.example.gradleDemo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.gradleDemo.dao")
@EnableDistributedTransaction
public class CityEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityEurekaApplication.class, args);
    }

}
