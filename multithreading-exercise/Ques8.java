package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ques8 {
    public static void main(String[] args)
    {
       // Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService scheduledExecutorServ = Executors.newScheduledThreadPool(3);

        int initialDelay=2;
        scheduledExecutorService.schedule(new Task(),initialDelay,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Task(),initialDelay,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Task(),initialDelay,TimeUnit.SECONDS);

        int periodicDelay = 2;

        scheduledExecutorService.scheduleAtFixedRate(new Task(),initialDelay,periodicDelay,TimeUnit.SECONDS);

        scheduledExecutorServ.scheduleWithFixedDelay(new Task(),initialDelay,periodicDelay,TimeUnit.SECONDS);
    }
}
