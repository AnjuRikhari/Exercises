package com.company;

import java.util.Random;
import java.util.concurrent.*;

public class Ques6 {
    public static void main(String[] args)
    {
        //Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled()
        // with the Future object to know the status of task submitted.
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            public Integer call()
            {
                Random random = new Random();
                int duration = random.nextInt(500);
                System.out.println("Starting...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                return duration;
            }
        });
        executorService.shutdown();
        try {
            System.out.println("result is : "+future.get());


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("future object done? :"+future.isDone());
        System.out.println("future object cancelled? :"+future.isCancelled());
    }
}
