package com.company;


import java.util.List;

public class Ques11 {
    public static void main(String[] args) {
        //Find average of the number inside integer list after doubling it.
        System.out.println("Average of number inside integer list after doubling : ");
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(list.stream()
                                .mapToDouble(x -> x+x)
                                .average()
                                .orElse(0.0));
    }
}
