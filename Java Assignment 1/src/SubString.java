import java.util.Scanner;

public class SubString
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String Strings=sc.nextLine();
        System.out.println("Enter the substring");
        String SubStrings=sc.nextLine();
        System.out.println("Enter the replace string");
        String ReplaceStrings=sc.nextLine();

        Strings=Strings.replace(SubStrings,ReplaceStrings);
        System.out.println(Strings);

    }
}
