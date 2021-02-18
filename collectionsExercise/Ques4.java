package com.company;

import java.util.*;
class Employee
{
    Double age;
    Double salary;
    String name;

    public Double getSalary() {
        return salary;
    }

    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public String toString()
    {
        return "Employee : "+name+" - "+salary+" - "+age+"\n";
    }
}
public class Ques4 {
    public static void main(String[] args) {
        // Write a program to sort Employee objects based on highest salary using Comparator.
        // Employee class{ Double Age; Double Salary; String Name

        Employee e1 = new Employee(27.0,50000.25,"Smith");
        Employee e2 = new Employee(30.0,45200.70,"Clark");
        Employee e3 = new Employee(28.0,34000.00,"Stark");
        Employee e4 = new Employee(32.0,42000.50,"David");
        Employee e5 = new Employee(35.0,47500.50,"Tony");
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("Employee Details : ");
        System.out.println(list);

        Comparator<Employee> firstComp = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return (int)(emp2.getSalary()-emp1.getSalary());
            }
        };
        Collections.sort(list,firstComp);
        System.out.println("Sorted Details based on highest Salary \n"+list);

    }
}
