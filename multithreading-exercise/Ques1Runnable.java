package com.company;

class MyClass implements Runnable
{
    Thread thread;
    public MyClass(String tname)
    {
        thread = new Thread(this,tname);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
public class Ques1Runnable {
    public static void main(String[] args) {
       MyClass m1 = new MyClass("First Thread");
       MyClass m2 = new MyClass("Second Thread");
    }
}
