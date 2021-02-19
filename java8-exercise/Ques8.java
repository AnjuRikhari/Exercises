package com.company;
interface First
{
    default void show()
    {
        System.out.println("\n Inside First Interface Show()!!");
    }
}

interface Second
{
    default void show()
    {
        System.out.println("\n Inside Second Interface Show()!!");
    }
}
class Test implements First, Second
{

    @Override
    public void show() {
        First.super.show();
        Second.super.show();

    }
}
public class Ques8{

    public static void main(String[] args) {
        // Implement multiple inheritance with default method inside  interface
        Test ob = new Test();
        ob.show();
    }
}
