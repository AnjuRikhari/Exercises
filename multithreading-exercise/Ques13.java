package com.company;

class Data
{
    String msg;
    boolean msgAvailable = false;
    public synchronized void receive()
    {
        if (!msgAvailable)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received Message : "+msg);
        msgAvailable = false;
        notify();
    }
    public synchronized void send(String msg)
    {
            if (msgAvailable)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.msg=msg;
            msgAvailable = true;
            System.out.println("Sending message : "+msg);
            notify();
    }
}
class Sender implements Runnable
{
    Data data;
    Thread thread;
    Sender(Data data)
    {
        this.data = data;
        thread = new Thread(this,"Sender");
        thread.start();
    }
    @Override
    public void run() {
            String msgs[] = {"First Message","Second Message","Third Message"};
            for (String msg:msgs)
            {
                data.send(msg);
            }
    }
}
class Receiver implements Runnable
{
    Data data;
    Thread thread;
    Receiver(Data data)
    {
        this.data=data;
        thread = new Thread(this,"Receiver");
        thread.start();
    }

    @Override
    public void run() {
        while (true)
        {
            data.receive();
        }
    }
}
public class Ques13 {
    public static void main(String[] args) {
        //Coordinate 2 threads using wait() and notify().
        Data data = new Data();
        new Sender(data);
       new Receiver(data);

    }
}
