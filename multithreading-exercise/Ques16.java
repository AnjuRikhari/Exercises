import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private int balance = 10000;

    private void deposit(int amount) {
        balance += amount;
    }

    private void withdraw(int amount) {
        if (balance < 500)
            System.out.println("\nCan not withdraw..");
        else
            balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}

class DemoLock {
    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    DemoLock(Account acc1, Account acc2) {
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    private void acquirelocks(Lock firstLock, Lock secondLock) throws InterruptedException {
        while (true) {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;
            try {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
                System.out.println("Got both the locks");

            } finally {
                if (gotFirstLock && gotSecondLock)
                    return;
                if (gotFirstLock) {
                    System.out.println("Release lock1");
                    firstLock.unlock();
                }
                if (gotSecondLock) {
                    System.out.println("Release lock2");
                    secondLock.unlock();
                }
            }
            Thread.sleep(100);
        }
    }

    public void firstThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            acquirelocks(lock1, lock2);

            try {
                Account.transfer(acc1, acc2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            acquirelocks(lock1, lock2);
            try {
                Account.transfer(acc2, acc1, random.nextInt(100));
                Thread.sleep(1000);
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

}

public class Ques16 {
    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account();
        DemoLock ty = new DemoLock(acc1, acc2);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ty.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ty.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Balance of acc1 : " + acc1.getBalance() + "\nBalance of acc2 : " + acc2.getBalance());

    }
}