package com.example.gradleDemo;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerServerApplication {
    //天气预报

    public static void main(String[] args) {
        SpringApplication.run(TxManagerServerApplication.class, args);
    }

}
