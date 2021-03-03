package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eid;
    private String name;
    @Autowired
    Department department;
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showEmployeeDetails()
    {
        System.out.println("Employee Id : "+eid+"\nEmployee Name : "+name);
        department.setDeptName("Computer Science");
        System.out.println("Department Name : "+department.getDeptName());
    }
}
