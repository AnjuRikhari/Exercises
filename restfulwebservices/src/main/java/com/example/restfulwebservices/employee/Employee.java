package com.example.restfulwebservices.employee;

import javax.validation.constraints.Size;

public class Employee {

    private Integer id;
    @Size(min = 3, message = "Name should have at least 3 characters")
    private String name;
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
