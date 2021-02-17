package com.company;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        //WAP to convert seconds into days, hours, minutes and seconds

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int seconds = sc.nextInt();
        int days,hours,min,sec;
        sec = seconds;

        days = seconds / (24*3600);
        seconds = seconds % (24*3600);
        hours = seconds / 3600;
        seconds %= 3600;
        min = seconds / 60;
        seconds %= 60;


        System.out.println("No. of days, hours, minutes and seconds in "+sec+" : "+days
                +" days "+hours+" hours "+min+" minutes "+seconds+" seconds" );

    }
}
