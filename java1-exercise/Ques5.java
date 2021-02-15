package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Ques5 {

    public static void main(String[] args)
    {
        //Find common elements between two arrays.

        int a[] = new int[]{2,1,2,3,2,5,4};
        int b[] = new int[]{1,2,3,7,8,9};

        System.out.println("First Array : ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Second Array : ");
        for (int j=0;j<b.length;j++)
        {
            System.out.print(b[j]+" ");
        }

        Set<Integer> set1 = new HashSet<Integer>();
        for (int i=0;i<a.length;i++)
        {
            set1.add(a[i]);
        }
        System.out.println();
        System.out.println("Common elements are ");
        for (int i=0;i<b.length;i++)
        {
            if (set1.contains(b[i]))
            {
                System.out.println(b[i]);
                set1.remove(b[i]);
            }
        }
    }
}
