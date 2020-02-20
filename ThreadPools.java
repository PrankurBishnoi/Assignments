import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPools
{
    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(2);
        for (int i=0; i<5; i++)
        {
            executer.submit(new Threads(i));
        }
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

class Threads implements Runnable
{
    private int id;
    public Threads(int id)
    {
        this.id=id;
    }
    public void run()
    {
        System.out.println("Starting: "+ id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed: "+id);
    }
}

