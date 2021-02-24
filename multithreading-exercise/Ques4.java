package com.company;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//class Task1 implements Runnable
//{
//
//    @Override
//    public void run() {
//        Random random = new Random();
//        Long duration = random.nextLong();
//
//        try {
//            System.out.println("Running Thread Name : "+Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(duration);
//            System.out.println("Completed Thread Name : "+Thread.currentThread().getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
public class Ques4 {
    public static void main(String[] args) {
        //Try shutdown() and shutdownNow() and observe the difference
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.shutdown();
        System.out.println("Is Executor shutdown : "+executorService.isShutdown());

    }
}
