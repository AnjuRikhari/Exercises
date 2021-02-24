package com.company;

class MyThread extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }
}
public class Ques1ThreadClass {

    public static void main(String[] args) {
	// Create and Run a Thread using Runnable Interface and Thread class
    MyThread thread = new MyThread();
    thread.start();
    MyThread thread2 = new MyThread();
    thread2.start();
    }
}
