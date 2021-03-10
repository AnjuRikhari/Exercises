package com.example.restfulwebservices.employee;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
@ApiModel(description = "Contains all the employees details and their related operations")
public class Employee {

    @ApiModelProperty(notes = "Id will be Unique and Auto-generated")
    private Integer id;
    @Size(min = 3, message = "Name should have at least 3 characters")
    @ApiModelProperty(notes = "Name should have at least 3 characters")
    private String name;
    @ApiModelProperty(notes = "Age should be greater than 18")
    private Integer age;

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("User [ id=%s, Name=%s, Age=%s]", id, name, age);
    }
}
