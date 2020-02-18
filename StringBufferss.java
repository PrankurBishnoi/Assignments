import java.util.Scanner;
import java.lang.*;

public class StringBufferss
{
    public static void main(String[] args)
    {
        StringBuffer StringBuffer = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuffer.append(sc.nextLine());
        System.out.println(StringBuffer);
        StringBuffer.reverse();
        System.out.println(StringBuffer);
        StringBuffer.delete(4,9);
        System.out.println(StringBuffer);

    }
}
