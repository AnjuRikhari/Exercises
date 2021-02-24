package com.company;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable
{

    @Override
    public void run() {
        Random random = new Random();
        Long duration = random.nextLong();

        try {
            System.out.println("Running Thread Name : "+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(duration);
            System.out.println("Completed Thread Name : "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Ques5 {
    public static void main(String[] args) {
        //Use isShutDown() and isTerminated() with ExecutorService.
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Task());
        System.out.println("Is Executor shutdown : "+executorService.isShutdown());
        executorService.submit(new Task());
        executorService.shutdown();
        System.out.println("Is Executor shutdown : "+executorService.isShutdown());
        System.out.println("Is Executor terminated : "+executorService.isTerminated());
    }
}
