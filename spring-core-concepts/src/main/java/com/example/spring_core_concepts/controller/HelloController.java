package com.example.spring_core_concepts.controller;

import com.example.spring_core_concepts.beans.EmployeeBean;

import org.springframework.beans.factory.annotation.Autowired;
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
        logger.info("Received request for /helloworld endpoint");
        logger.debug("Processing request in sayHelloWithLogger method");
        return "Hello, Spring Boot!";
    }

    @Autowired
    private EmployeeBean employee;
    @GetMapping("/employee")
    public String getEmployeeDetails() {
        logger.info("Received request for /employee endpoint");
        return employee.getEmployeeDetails();
    }
}