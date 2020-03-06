import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPools
{
    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(2);

        executer.submit(new Thread1());
        executer.submit(new Thread2());

        executer.shutdown();
        System.out.println("All tasks submitted.");
        try {
            executer.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All Tasks Completed.");
    }
}

class Thread1 implements Runnable
{

    public void run()
    {
        Random random = new Random();
        for (int i=0; i<100; i++)
        {
            if (i%2==0)
                System.out.println("One:   "+i);
        }

        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed One ");
    }
}

class Thread2 implements Runnable
{
    Random random = new Random();
    public void run()
    {
        for (int i=0; i<100; i++)
        {
            if (i%2!=0)
                System.out.println("Two:   "+i);
        }

        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed Two ");
    }
}

