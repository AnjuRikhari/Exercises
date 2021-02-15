package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        //There is an array with every element repeated twice except one. Find that element
        int a[] = {2,3,2,1,3,1,5};
        int res = 0;
        System.out.println("Array elements are : ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        System.out.println("\nElement which is not repeated  :"+res);


    }
}
