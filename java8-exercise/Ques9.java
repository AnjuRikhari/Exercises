package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        // Collect all the even numbers from an integer list.
        List<Integer> list = List.of(2,3,4,5,6,7,8,9);
        System.out.println("Actual list : " );
        list.stream()
             .forEach(System.out::println);

        System.out.println(list.stream()
            .filter(x -> x%2==0)
            .collect(Collectors.toList()));
    }
}
