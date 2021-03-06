package com.example.restfulwebservices.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService employeeDaoService;

    //retrive all employees
    @GetMapping("/employee")
    public List<Employee> retrieveEmployees() {
        return employeeDaoService.getAllEmployees();
    }

    //retrieve one employee
    @GetMapping("/employee/{id}")
    public Employee retrieveOne(@PathVariable int id) {
        Employee employee = employeeDaoService.getOneEmployee(id);
        if (employee == null) {
            throw new EmployeeNotFoundException("id-" + id + " Not Found");
        }
        return employee;
    }

    //Create new Employee
    @PostMapping("/employee")
    public ResponseEntity<Object> createUsers(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeDaoService.save(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //Delete Employee
    @DeleteMapping("/employee/{id}")
    public void deleteUser(@PathVariable int id) {
        Employee user = employeeDaoService.deleteById(id);
        if (user == null) {
            throw new EmployeeNotFoundException("id-" + id);
        }
    }

    //Update Employee
    @PutMapping("/employee/{id}")
    public void updateEmployeeDetail(@RequestBody Employee employee, @PathVariable int id) {
        Employee emp = employeeDaoService.updateEmployee(employee, id);
        if (emp == null) {
            throw new EmployeeNotFoundException("id-" + id);
        }
    }
}
