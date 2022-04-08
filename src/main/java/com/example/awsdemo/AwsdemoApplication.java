package com.example.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static java.time.LocalTime.now;

@SpringBootApplication
public class AwsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsdemoApplication.class, args);
    }

    @Bean
    public void logKek() {
        System.out.println("kek: " + now());
    }


}
