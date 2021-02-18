package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques2 {
    static final int noOfChars = 256;
    void uniqueChars(String str)
    {
        System.out.println("String is : "+str);
        int[] count = new int[noOfChars];
        int i;
        for (i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count[(int)str.charAt(i)]++;
            }
        }
        int n = i;
        System.out.print("Unique Elements are : ");
        for (int j=0;j<n;j++)
        {
            if (count[(int)str.charAt(j)] == 1)
            {
                System.out.print(str.charAt(j)+" ");
            }
        }
    }
    public static void main(String[] args) {
        // Write a method that takes a string and returns the number of unique characters in the string
        String str = " to the new";
        Ques2 q = new Ques2();
        q.uniqueChars(str);
    }
}
