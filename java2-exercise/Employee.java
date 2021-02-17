package com.company;

public class Employee implements Cloneable {
    public int empid;
    public String name;

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
    Employee(Employee s) {
        System.out.println("Inside Copy constructor");
        empid = s.empid;
        name = s.name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
