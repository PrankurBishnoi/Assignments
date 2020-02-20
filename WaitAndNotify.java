import java.util.Scanner;

public class WaitAndNotify
{
    public static void main(String[] args) throws InterruptedException {
        final Processor Processor1 = new Processor();
        Thread Thread1 =new Thread(new Runnable(){
            public void run()
            {
                try {
                    Processor1.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread Thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Processor1.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread1.start();
        Thread2.start();

        Thread1.join();
        Thread2.join();
    }
}

class Processor
{
    public void produce() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("Producer Thread running...");
            wait();
            System.out.println("Resumed..");
        }
    }

    void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this)
        {
            System.out.println("Waiting for return key.");
            sc.nextLine();
            System.out.println("Return key pressed. ");
            notify();
            Thread.sleep(5000);
        }
    }
}