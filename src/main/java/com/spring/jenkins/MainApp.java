package com.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class MainApp {
    Logger logger = LoggerFactory.getLogger(MainApp.class);

    @PostConstruct
    public void init(){
        logger.info("Application Initiated");
    }
    public static void main(String[] args) {
        System.out.println("Staring Application for Jenkins Deployment");
        SpringApplication.run(MainApp.class, args);
    }

}
