package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
	// Write Java code to define List .
    // Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
        List<Float> list = new ArrayList<Float>();
        float n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Floating point Numbers ");
        for (int i=0; i<5;i++)
        {
            n = sc.nextFloat();
            list.add(n);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            sum+=(Float) iterator.next();
        }
        System.out.println("Sum of floating point numbers : "+sum);
    }
}
