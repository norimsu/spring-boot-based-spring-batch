package com.example.springbootbasedspringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBootBasedSpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasedSpringBatchApplication.class, args);
    }

}
