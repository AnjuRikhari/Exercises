package com.example.restfulwebservices.employee;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ApiModel(description = "This EmployeeDaoService manages all the services i.e., to get details of all employee, to delete a specific employee, etc.")
@Component
public class EmployeeDaoService {
    private static List<Employee> employees = new ArrayList<>();
    private static int empCount = 3;

    static {
        employees.add(new Employee(1, "John", 25));
        employees.add(new Employee(2, "Smith", 28));
        employees.add(new Employee(3, "Adam", 30));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getOneEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return employee;
        }
        return null;
    }

    public Employee deleteById(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }

    public Employee save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(++empCount);
        }
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee, int id) {

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                employees.set(employees.indexOf(emp), employee);
                return emp;
            }
        }
        return null;
    }

}
