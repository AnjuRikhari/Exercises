package com.company;

import java.util.List;

public class Ques10 {

    public static void main(String[] args) {
        //Sum all the numbers greater than 5 in the integer list.
        List<Integer> list = List.of(3,2,5,6,7,8,12);
        System.out.println("Sum of all the numbers greater than 5 in the integer list : ");
        System.out.println(list.stream()
                                .filter(x -> x>5)
                                .reduce(0, (a,b) -> a+b));
    }
}
