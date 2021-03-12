package com.example.springdatajpa.firstjpaproject;

import com.example.springdatajpa.firstjpaproject.entities.Employee;
import com.example.springdatajpa.firstjpaproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(String name, int age, String location) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setLocation(location);
        employeeRepository.save(employee);
    }

    public void updateEmployee() {
        Employee employee = employeeRepository.findById(1).get();
        employee.setName("Marrie");
        employeeRepository.save(employee);
    }

    public void deleteEmployee() {
        employeeRepository.deleteById(5);   //Delete employee of id 5
    }

    public void getEmployeeDetails() {
        Employee employee = employeeRepository.findById(1).get();
        System.out.println("Employee details of id 1 : " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
    }

    public void countEmployees() {
        System.out.println("Number of Employees: " + employeeRepository.count());
    }

    public void pagingAndSortingOnAge() {
        Pageable pageable = PageRequest.of(1, 2, Sort.Direction.ASC, "age");
        employeeRepository.findAll(pageable).forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getLocation()));
    }

    public void findEmployeeByName() {
        List<Employee> employees = employeeRepository.findByName("Smith");
        employees.forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getLocation()));
    }

    public void findByInitials() {
        List<Employee> employees = employeeRepository.findByNameLike("A%");
        employees.forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getLocation()));
    }

    public void findEmployeeWithinAgeRange() {
        List<Employee> employees = employeeRepository.findByAgeBetween(28, 32);
        employees.forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getLocation()));
    }
}
