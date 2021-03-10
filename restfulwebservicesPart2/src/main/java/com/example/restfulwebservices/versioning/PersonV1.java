package com.example.restfulwebservices.versioning;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Contains the Person details and contains the basic details")
public class PersonV1 {
    private String name;
    private int age;

    public PersonV1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonV1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
