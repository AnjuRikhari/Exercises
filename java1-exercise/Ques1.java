package com.company;

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
	    // Write a program to replace a substring inside a string with other string
        Scanner sc = new Scanner(System.in);
        String str,substr,repstr;
        System.out.println("Enter the String : ");
        str = sc.nextLine();
        System.out.println("Enter the substring which to be replaced : ");
        substr = sc.nextLine();
        System.out.println("Enter the string which replaces substring : ");
        repstr = sc.nextLine();

        String newstr = str.replace(substr,repstr);
        System.out.println(newstr);
    }
}
