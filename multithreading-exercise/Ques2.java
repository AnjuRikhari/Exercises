package com.company;
class Test extends Thread
{
    public void run()
    {
        for (int i=0;i<4;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        // Use sleep and join methods with thread
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.start();
        t1.join();

        t2.start();
        t3.start();

    }
}
