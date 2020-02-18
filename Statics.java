import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Statics
{
    static String FirstName;
    static String LastName;
    static int Age = 30;
    static void Static_method()
    {
        LastName="HIJKLMNO";
        System.out.println("Last Name = "+LastName);
    }
    static
    {
        FirstName="ABCDEFG";
        System.out.println("First Name = "+FirstName);
    }
    public static void main(String[] args)
    {
        Static_method();
        System.out.println("Age = "+Age);
    }
}