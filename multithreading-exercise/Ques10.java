package com.company;

import java.util.Random;

class Table
{
    synchronized void printable(int num)
    {
       System.out.println("Multiplication of : "+num);
        for (int i=1;i<=5;i++)
        {
            System.out.print(num*i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
class MyThread1 extends Thread
{
    Table table;
    MyThread1(Table table)
    {
        this.table = table;
    }
    public void run()
    {
        Random random = new Random();
        int num = random.nextInt(15);
        System.out.println(num);
        table.printable(num);
    }

}

public class Ques10 {
    public static void main(String[] args) {
        //Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.
        Table table = new Table();
        MyThread1 t1 = new MyThread1(table);
        MyThread1 t2 = new MyThread1(table);
        MyThread1 t3 = new MyThread1(table);
        MyThread1 t4 = new MyThread1(table);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
