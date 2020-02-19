import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Secondss
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds : ");
        long Seconds = sc.nextLong();
        long Dayss = TimeUnit.SECONDS.toDays(Seconds);
        long hours = TimeUnit.SECONDS.toHours(Seconds) - (Dayss * 24);
        long Minutes = TimeUnit.SECONDS.toMinutes(Seconds) - (Dayss * 24 * 60) - (hours * 60);
        Seconds = Seconds - (Dayss * 24 * 60 * 60) - (hours * 60 * 60) - (Minutes * 60);
        System.out.println(Dayss + " Days " + hours + ", Hours " + Minutes + ", Minutes " + ", Seconds " + Seconds);

    }
}
