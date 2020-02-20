import javax.swing.*;

public class SynchronizeBlock
{
    private int count = 0;
// Removed synchronized and it will be a synchronized block
    synchronized void increment()
    {
        //Remove synchronize(this) and it will be a Synchronized Method
        synchronized (this)
        {
            count++;
        }
    }

    public static void main(String[] args) {
        SynchronizeBlock Blocks = new SynchronizeBlock();
        Blocks.doWork();
    }

    public void doWork()
    {
        Thread Thread1 = new Thread(new Runnable()
        {
           public void run()
           {
               for( int i = 0 ; i<10000; i++)
               {
                   increment();
               }
           }
        });

        Thread Thread2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i = 0; i<10000;i++)
                {
                    increment();
                }
            }
        });
        Thread1.start();
        Thread2.start();

        try {
            Thread1.join();
            Thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }

}
