package com.company;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        // Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
        String str = "Hello World!!";
        System.out.println("Actual String: " + str);
        StringBuffer strbuf = new StringBuffer(str);
        strbuf.reverse();
        System.out.println("Reverse String: " + strbuf);
        strbuf.delete(4, 10);
        System.out.println("After removing character from index 4 to index 9 :  " + strbuf);
    }
}
