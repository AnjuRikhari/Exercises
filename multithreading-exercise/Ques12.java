package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.atomic.AtomicInteger;

class Adder extends Thread {
    AtomicInteger count;
    Adder()
    {
        count = new AtomicInteger();
    }
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            count.addAndGet(1);
        }
    }
}

public class Ques12 {
    public static void main(String[] args) {
        //Use Atomic Classes instead of Synchronize method and blocks
        Adder obj = new Adder();

        Thread first = new Thread(obj, "Thread1");
        Thread second = new Thread(obj, "Thread2");

        first.start();
        second.start();
        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nValue of count is : "+obj.count);
    }
}
