package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class ThreadClass implements Runnable
{
    private int id;
    public ThreadClass(int id)
    {
        this.id=id;
    }
    public void run()
    {
        System.out.println("\nRunning Thread: "+id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed Thread: "+id);
    }
}
public class Ques9 {
    public static void main(String[] args) {
        //Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newCachedThreadPool();

        for(int i=0;i<3;i++)
        {
            executor1.submit(new ThreadClass(i));
        }
        for(int i=4;i<5;i++)
        {
            executor2.submit(new ThreadClass(i));
        }
        executor1.shutdown();
        executor2.shutdown();

        try {
            executor1.awaitTermination(1, TimeUnit.HOURS);
            executor2.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}