package com.company;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        //Write a program to find the number of occurrences of a character in a string without using loop
        String str = "Have a great day!";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurrences of 'a' in a string "+ str +" : "+count);


    }
}
