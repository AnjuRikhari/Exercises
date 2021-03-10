package com.example.restfulwebservices.versioning;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Another Version of person that contains the Person details and contains the enhanced details")
public class PersonV2 {
    private Name name;
    private int age;

    public PersonV2() {
    }

    public PersonV2(Name name, int age) {
        this.name = name;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
