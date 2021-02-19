package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {
        //Implement following functional interfaces from java.util.function using lambdas:
        //(1) Consumer
        //(2) Supplier
        //(3) Predicate
        //(4) Function


        //Consumer
        Consumer<Integer>  consumer = x ->{
            System.out.println("Number is :"+x);
        };
        consumer.accept(55);
        //Supplier
        Supplier<String> str = () -> "Implementation of Supplier ";
        System.out.println(str.get());
        //Predicate
        int a=37;
        Predicate<Integer> isOddPredicate = x -> x%2 != 0;
        System.out.println("Is "+a+" Odd Number :"+isOddPredicate.test(a));
        //Function
        int b=7;
        Function<Integer,Integer> squareFunction = x -> x*x;
        System.out.println("Square of "+b+" is "+squareFunction.apply(b));

        //Example
        List<Integer> list = List.of(12,9,13,4,6,2,4);
        Consumer<Integer>  con = System.out::println;
        System.out.println("Example(Square of odd no.) : ");
        list.stream()
            .filter(isOddPredicate)
            .map(squareFunction)
            .forEach(con);



    }
}
