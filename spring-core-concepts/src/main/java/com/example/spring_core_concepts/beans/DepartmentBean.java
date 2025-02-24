package com.example.spring_core_concepts.beans;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "IT";

    public String getDepartmentName() {
        return departmentName;
    }
}