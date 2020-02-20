public class SleepJoin extends Thread
{
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Hello: "+ i);




        }
    }
}
class Mainsss
{
    public static void main(String[] args) throws InterruptedException {
        ThreadRunners runner1 = new ThreadRunners();
        runner1.start();

        ThreadRunners runner2 = new ThreadRunners();
        runner2.start();

        long Start =System.currentTimeMillis();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long End = System.currentTimeMillis();
        System.out.println("Time slept: "+(End-Start));

        /*
        runner1.join();
        runner2.join();
        */

        System.out.println("sdc");
    }
}
