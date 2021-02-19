package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;
interface EmployeeSupplier{
    Employee get(String name, Integer age, String city);
}
class Employee
{
    String name;
    Integer age;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void print()
    {
        System.out.println("Name : "+name+"\nAge : "+age+"\nCity : "+city);
    }
}
public class Ques4 {
    public static void main(String[] args) {
        //Create an Employee Class with instance variables (String) name, (Integer)age,
        // (String)city and get the instance of the Class using constructor reference
        EmployeeSupplier employeeSupplier = Employee::new;
        Employee e = employeeSupplier.get("Smith",23,"Delhi");
        e.print();
    }
}
