package com.example.spring_core_concepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }


    @GetMapping("/helloworld")
    public String sayHelloWithLogger() {
        logger.info("Received request for /hello endpoint");
        logger.debug("Processing request in sayHello method");
        return "Hello, Spring Boot!";
    }
}