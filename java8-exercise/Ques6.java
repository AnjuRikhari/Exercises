package com.company;

import java.util.function.BiFunction;
interface Demo {
    default void demoDefault() {
        System.out.println("\nInside default method");
    }

    static void demoStatic() {
        System.out.println("\nInside static method");
    }
}
public class Ques6 implements Demo{
    public static void main(String[] args) {
        //Create and access default and static method of an interface.
        Ques6 obj = new Ques6();
        obj.demoDefault();
        Demo.demoStatic();
    }
}
