import java.util.Arrays;
import java.util.Scanner;

public class Sortingss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String Strings = sc.nextLine();
        char[] CharArrays = new char[Strings.length()];
        for (int i=0;i<Strings.length();i++)
        {
            CharArrays[i]=Strings.charAt(i);
        }

        Arrays.sort(CharArrays);
        System.out.println(new String(CharArrays));
    }
}
