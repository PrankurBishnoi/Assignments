import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock
{
    public static void main(String[] args) throws InterruptedException {
        final Runner runner = new Runner();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        
        runner.finished();
    }
}
//-------------------------------------//
class Runner
{
    private Account Acc1 = new Account();
    private Account Acc2 = new Account();

    private Lock Lock1 = new ReentrantLock();
    private Lock Lock2 = new ReentrantLock();

    private void acquireLocks(Lock FirstLock, Lock SecondLock) throws InterruptedException {
        while(true)
        {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;
            try {
                 gotFirstLock = FirstLock.tryLock();
                 gotSecondLock = SecondLock.tryLock();
            }
            finally {
                if(gotFirstLock && gotSecondLock)
                    return;
                if (gotFirstLock)
                    FirstLock.unlock();
                if(gotSecondLock)
                    SecondLock.unlock();
            }
            Thread.sleep(1);
        }
    }
    public void firstThread() throws InterruptedException {
        Random random = new Random();
        for (int i=0; i<10000;i++)
        {
            acquireLocks(Lock1,Lock2);
            try {
                Account.transfer(Acc1, Acc2, random.nextInt(100));
            }
            finally {
                Lock1.unlock();
                Lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();
        for (int i=0; i<10000;i++)
        {
            acquireLocks(Lock2,Lock1);
            try {
                Account.transfer(Acc2, Acc1, random.nextInt(100));
            }
            finally {
                Lock1.unlock();
                Lock2.unlock();
            }
        }
    }
    public void finished()
    {
        System.out.println("Account 1 balance: " + Acc1.getBalance());
        System.out.println("Account 2 balance: " + Acc2.getBalance());
        System.out.println("Total Balance: "+(Acc1.getBalance()+Acc2.getBalance()));
    }
}

//---------------------------------------------------

class Account
{
    private int balance = 10000;

    public void deposit(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        balance-=amount;
    }
    public int getBalance()
    {
        return balance;
    }
    public static void transfer(Account Account1,Account Account2, int amount)
    {
        Account1.withdraw(amount);
        Account2.deposit(amount);
    }
}