package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ques8 {
    public static void main(String[] args) {
        // Write a program to format date as example "21-March-2016"
        Date today = new Date();
        System.out.println("Today is : " + today);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formatter.format(today);
        System.out.println("Today in dd-MMMM-yyyy format : " + date);

    }
}
