import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Statics
{
    static int Static_Block;
    static int Static_Variable = 300;
    static void Static_method()
    {
        System.out.println("Static Method");
    }
    static
    {
        Static_Block=100;
        System.out.println("Static Block = "+Static_Block);
    }
    public static void main(String[] args)
    {
        Static_method();
        System.out.println("Static Variable = "+Static_Variable);
    }
}
