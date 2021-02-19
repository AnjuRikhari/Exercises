package com.company;

import java.util.function.BiFunction;

public class Ques3 {
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public int subtract(int num1, int num2)
    {
        return num2 - num1;
    }
    public static int multiplication(int num1, int num2)
    {
        return num1 * num2;
    }
    public static void main(String[] args) {
        //Using (instance) Method reference create and apply add and subtract method and
        // using (Static) Method reference create and apply multiplication method for the functional interface created.
        Ques3 obj = new Ques3();
        System.out.println("\nInstance Method Reference");
        BiFunction<Integer, Integer, Integer> add = obj::add;
        System.out.println("Sum of two numbers is : "+add.apply(23,25));

        BiFunction<Integer, Integer, Integer> diff = obj::subtract;
        System.out.println("Difference of two numbers is : "+diff.apply(7,30));

        System.out.println("\nStatic Method Reference");
        BiFunction<Integer, Integer, Integer> product = Ques3::multiplication;
        System.out.println("Product of two numbers is : "+product.apply(50,4));

    }

}

