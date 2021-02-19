package com.company;

import java.util.function.BiFunction;
interface ABC
{
    default void abcDefault()
    {
        System.out.println("\nInside ABC interface abcDefault() ");
    }
}
public class Ques7 implements ABC{
    @Override
    public void abcDefault() {

        System.out.println("\nThis is an overridden method");
    }
    public static void main(String[] args) {
        //Override the default method of the interface.
        Ques7 obj = new Ques7();
        obj.abcDefault();
    }
}
