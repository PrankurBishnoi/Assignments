import java.util.Scanner;

public class Versatiles extends Thread
{
        private volatile boolean running = true;

        public void run()
        {
            while(running)
            {
                System.out.println("Running");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void Shutdown()
        {
            running = false;
        }
}

class Apps
{
    public static void main(String[] args) {
        Versatiles versatiles = new Versatiles();
        versatiles.start();

        new Scanner(System.in).nextLine();
        versatiles.Shutdown();
        System.out.println("Return Key pressed, Ending Program ");
    }
}