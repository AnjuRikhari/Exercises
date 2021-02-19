package com.company;

import java.util.List;

public class Ques12 {
    public static void main(String[] args) {
        //Find the first even number in the integer list which is greater than 3.
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("First even number which is greater than 3 : ");
        System.out.println(list.stream()
                                .filter(number -> number%2==0)
                                .filter(number -> number>3)
                                .findFirst());
    }
}
