package com.company;

public class Ques4 {
    public static void main(String[] args) {
        //WAP to create singleton class.

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        x.str = (x.str).concat(" Hello").toUpperCase();
        System.out.println("String from x : "+ x.str);
        System.out.println("String from y : "+ y.str);

        y.str = (y.str).toLowerCase();
        System.out.println("String from x : " + x.str);
        System.out.println("String from y : " + y.str);

    }
}
