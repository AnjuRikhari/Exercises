package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class CallMe
{
    void call(String msg)
    {
        System.out.println(msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Caller implements Runnable
{
    CallMe callMe;
    String str;
    Thread thread;
    public Caller(CallMe callMe,String str)
    {
        this.callMe = callMe;
        this.str = str;
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        synchronized (callMe)
        {
            callMe.call(str);
        }
    }
}
public class Ques11 {
    public static void main(String[] args) {
        //Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
        CallMe callMe = new CallMe();
        Caller c1 = new Caller(callMe,"Hello ");
        Caller c2 = new Caller(callMe,"World. ");
        Caller c3 = new Caller(callMe,"Use of ");
        Caller c4 = new Caller(callMe,"synchronized block.");
    }
}
