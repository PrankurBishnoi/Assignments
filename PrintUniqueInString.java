import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueInString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String Strings = new String(sc.nextLine());
        Set<Character> Sets = new HashSet<>();
        for ( int i = 0 ; i < Strings.length() ; i++)
        {
            Sets.add(Strings.charAt(i));
        }
        System.out.println("Number of unique characters in the given String is : "+Sets.size());
    }
}
