package com.company;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        // Write a program to find the number of occurrences of the duplicate words in a string and print them
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter the String : ");
        str = sc.nextLine();
        int count =1;
        String words[] = str.split(" ");
        for (int i=0;i<words.length;i++)
        {
            count=1;
            for (int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
            if (count > 1 && words[i]!= "0")
            {
                System.out.println(words[i]+ " has repeated " + count + " times");
            }
        }
    }
}
