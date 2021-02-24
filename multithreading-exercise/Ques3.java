package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques3 {
    public static void main(String[] args) {
        // Use a singleThreadExecutor to submit multiple threads.
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task1 Started");
                for (int i=1;i<=5;i++)
                {
                    System.out.println(i+" ");
                }
                System.out.println("Task1 Completed");
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task2 Started");
                for (int i=1;i<=5;i++)
                {
                    System.out.println(i+" ");
                }
                System.out.println("Task2 Completed");
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task3 Started");
                for (int i=1;i<=5;i++)
                {
                    System.out.println(i+" ");
                }
                System.out.println("Task3 Completed");
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }
}
