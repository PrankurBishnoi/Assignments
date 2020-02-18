import java.util.Scanner;
import java.lang.*;
    public class CharDuplicate
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String Strings = sc.nextLine();
            int Length1 = Strings.length();
            System.out.println("Enter the Character to be counted");
            String characters = sc.next();
            int Length2 = Strings.replace(characters,"").length();
            System.out.println("Number of Occurance of '"+characters+"' is:  "+(Length1-Length2));
        }
    }


