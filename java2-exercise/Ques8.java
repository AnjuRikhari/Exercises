package com.company;
import java.util.Scanner;

public class Ques8 {
    public void callWhile(String st)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using while loop ");
        while (!st.equals("done"))
        {
            if(st.charAt(0)==st.charAt(st.length()-1))
            {
                System.out.println("First and last character are same in a string ");
            }
            else
                System.out.println("First and last character are not same in a string ");
            System.out.println("Enter new string : ");
            st = sc.nextLine();
        }
    }
    public void callDoWhle(String st)
    {
        System.out.println("Using do while loop ");
        Scanner sc = new Scanner(System.in);
        do{
            if(st.charAt(0)==st.charAt(st.length()-1))
            {
                System.out.println("First and last character are same in a string ");
            }
            else
                System.out.println("First and last character are not same in a string ");
            System.out.println("Enter new string : ");
            st = sc.nextLine();
        }while (!st.equals("done"));
    }
    public static void main(String[] args) {
        //WAP to read words from the keyboard until the word done is entered. For each word except done,
        // report whether its first character is equal   to  its last character. For the required loop, use a
        //a)while statement
        //b)do-while statement
        Scanner sc = new Scanner(System.in);
        String str;
        Ques8 q = new Ques8();
        System.out.println("Enter string : ");
        str = sc.nextLine();
        q.callWhile(str);
        q.callDoWhle(str);
    }
}
