package com.example.spring_core_concepts.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Udit Patel";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: " + name + ", Department: " + department.getDepartmentName();
    }
}
