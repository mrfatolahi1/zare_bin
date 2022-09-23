package com.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class UrlCounterApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UrlCounterApplication.class, args);
    }
}
