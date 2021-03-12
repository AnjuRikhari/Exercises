package com.example.springdatajpa.firstjpaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstjpaprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstjpaprojectApplication.class, args);
		EmployeeDaoService employeeDaoService = context.getBean(EmployeeDaoService.class);

//		//Adding employees
//		employeeDaoService.addEmployee("Marriam",24,"India");
//		employeeDaoService.addEmployee("Smith",28,"America");
//		employeeDaoService.addEmployee("Clark",30,"South Africa");
//		employeeDaoService.addEmployee("Annie",30,"America");
//		employeeDaoService.addEmployee("Brek",32,"South Africa");

//		//Read details of Employee
//		employeeDaoService.getEmployeeDetails();
//
//		//Update employee details
//		employeeDaoService.updateEmployee();
//
//		//delete employee details
//		employeeDaoService.deleteEmployee();

		//Count Number of employees
		employeeDaoService.countEmployees();

		//Pagination and Sorting on the bases of Employee Age
		employeeDaoService.pagingAndSortingOnAge();

		//Find Employee by Name
		employeeDaoService.findEmployeeByName();

		//Find Employee by their initials
		employeeDaoService.findByInitials();

		//Find Employees Between the age range
		employeeDaoService.findEmployeeWithinAgeRange();
	}

}
