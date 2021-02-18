package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student
{
    String name;
    Double Score;
    Double Age;

    public Student(String name, Double score, Double age) {
        this.name = name;
        Score = score;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return Score;
    }

    public Double getAge() {
        return Age;
    }
    public String toString()
    {
        return "Student : "+name+" - "+Age+" - "+Score+"\n";
    }
}
public class Ques5 {
    public static void main(String[] args) {
        // Write a program to sort the Student objects based on Score ,
        //if the score are same then sort on First Name .
        //Class Student{ String Name; Double Score; Double Age

        Student s1 = new Student("John",80.5,25.0);
        Student s2 = new Student("Smith",90.0,24.0);
        Student s3 = new Student("Clark",84.5,27.0);
        Student s4 = new Student("David",90.0,25.0);
        Student s5 = new Student("Stark",84.5,23.0);

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("Student Details : ");
        System.out.println(list);
        Comparator<Student> firstComp = new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu1.getScore().compareTo(stu2.getScore());
            }
        };
        Comparator<Student> secondComp = firstComp.thenComparing(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
        Collections.sort(list,secondComp);
        System.out.println("Sorted Student details based on highest Score \n"+list);
    }
}
