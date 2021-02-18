package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ques3 {
    static final int noOfChars = 256;
    void countChars(String str)
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
        System.out.print("Occurrence of each character ");
        System.out.println();
        for (int j=0;j<n;j++)
        {
            if (str.charAt(j)!=' ' && count[(int)str.charAt(j)]>0)
            {
                System.out.print("Occurrence of "+str.charAt(j)+" "+count[(int)str.charAt(j)]);
                System.out.println();
                count[(int)str.charAt(j)]=0;
            }
        }
    }
    public static void main(String[] args) {
        // Write a method that takes a string and print the number of
        // occurrence of each character characters in the string.
        String str = " to the new";
        Ques3 q = new Ques3();
        q.countChars(str);

    }
}
