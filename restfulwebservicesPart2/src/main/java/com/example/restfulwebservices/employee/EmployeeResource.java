package com.example.restfulwebservices.employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@Api(description = "Handles all the Employee request")
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService employeeDaoService;

    //retrive all employees
    @GetMapping("/employee")
    @ApiOperation(value = "Return all the employees", notes = "Get the details of all the employees present.")
    @ApiResponse(code = 200, message = "Success|OK")
    public List<Employee> retrieveEmployees() {
        return employeeDaoService.getAllEmployees();
    }

    //retrieve one employee
    @GetMapping("/employee/{id}")
    @ApiOperation(value = "Return the particular employee on the basis of employee id.", notes = "On the get request it will the employee details on the basis of id.")
    @ApiResponse(code = 404, message = "Not Found")
    public EntityModel<Employee> retrieveOne(@PathVariable int id) {
        Employee employee = employeeDaoService.getOneEmployee(id);
        if (employee == null) {
            throw new EmployeeNotFoundException("id-" + id + " Not Found");
        }
        EntityModel<Employee> entityModel = EntityModel.of(employee);
        WebMvcLinkBuilder linkBuilder = linkTo(methodOn(this.getClass()).retrieveEmployees());
        entityModel.add(linkBuilder.withRel("all-user"));
        return entityModel;
    }

    //Create new Employee
    @PostMapping("/employee")
    @ApiOperation(value = "Create the particular employee on the basis of employee id.", notes = "Get the details the employees present.")
    @ApiResponse(code = 201, message = "Created")
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
    @ApiOperation(value = "Delete an employee on the basis of employee id.", notes = "Delete the details of employee present.")
    @ApiResponse(code = 200, message = "Success|OK")
    public void deleteUser(@PathVariable int id) {
        Employee user = employeeDaoService.deleteById(id);
        if (user == null) {
            throw new EmployeeNotFoundException("id-" + id);
        }
    }

    //Update Employee
    @PutMapping("/employee/{id}")
    @ApiOperation(value = "Update an employee on the basis of employee id.", notes = "Update the details of employee")
    @ApiResponse(code = 200, message = "Success|OK")
    public void updateEmployeeDetail(@RequestBody Employee employee, @PathVariable int id) {
        Employee emp = employeeDaoService.updateEmployee(employee, id);
        if (emp == null) {
            throw new EmployeeNotFoundException("id-" + id);
        }
    }
}
