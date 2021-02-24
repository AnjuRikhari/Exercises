package com.company;

import java.util.Scanner;

class Processor{
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("\nRunning Producer Thread...");
            wait();
            System.out.println("Thread Resumed..");
        }
    }

    public void consume() throws InterruptedException {

        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Press a key to continue...");
            new Scanner(System.in).nextLine();
            System.out.println("Key pressed..");
            notifyAll();

        }
    }
}
class ProcessProduce implements Runnable
{
    Processor processor;
    Thread thread;
    public ProcessProduce(Processor processor,String name)
    {
        this.processor = processor;
        thread = new Thread(this,name);
        thread.start();
    }
    @Override
    public void run() {
        try
        {
            processor.produce();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class ProcessConsume implements Runnable
{
    Processor processor;
    Thread thread;
    public ProcessConsume(Processor processor,String name)
    {
        this.processor = processor;
        thread = new Thread(this,name);
        thread.start();
    }
    @Override
    public void run() {
        try
        {
            processor.consume();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
public class Ques14 {
    public static void main(String[] args)
    {
        Processor obj1 = new Processor();
        ProcessProduce process1 = new ProcessProduce(obj1,"First");
        ProcessProduce process2 = new ProcessProduce(obj1,"Second");
        ProcessConsume processConsume = new ProcessConsume(obj1,"Third");

    }
}