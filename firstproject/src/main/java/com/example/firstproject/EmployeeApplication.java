package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(EmployeeApplication.class,args);
        Employee employee = applicationContext.getBean(Employee.class);
        employee.setEid(101);
        employee.setName("John");
        employee.showEmployeeDetails();
    }
}
