package com.example.rentsummary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.rentsummary.dao")
public class RentsummaryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RentsummaryApplication.class, args);
    }

}
