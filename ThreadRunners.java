//    Thread Class

 public class ThreadRunners extends Thread
{
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Hello: "+ i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Mainss
{
    public static void main(String[] args)
    {
        ThreadRunners runner1 = new ThreadRunners();
        runner1.start();

        ThreadRunners runner2 = new ThreadRunners();
        runner2.start();
    }
}


// Runnable Interface

//class ThreadRunners implements Runnable
//{
//    @Override
//    public void run()
//    {
//        for (int i=0; i<5;i++)
//        {
//            System.out.println("Hello: "+i);
//            try
//            {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Mainss
//{
//    public static void main(String[] args)
//    {
//        Thread Thread1 = new Thread(new ThreadRunners());
//        Thread1.start();
//    }
//}