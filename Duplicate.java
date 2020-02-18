import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;

import static java.util.Arrays.*;

public class Duplicate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String Strings = sc.nextLine();
        String[] arrOfStrings = Strings.split(" ");
        Arrays.sort(arrOfStrings);
        int c=1;
        for (int i=0;i<arrOfStrings.length-1;i++)
        {
            if (arrOfStrings[i].equalsIgnoreCase(arrOfStrings[i+1]))
            {
                c++;
            }
            else
            {
                System.out.println("Occurence of "+arrOfStrings[i]+" is: "+c);
                c=1;
            }
        }
        if(arrOfStrings[arrOfStrings.length-2].equalsIgnoreCase(arrOfStrings[arrOfStrings.length-1]))
        {
            System.out.println("Occurence of "+arrOfStrings[arrOfStrings.length-1]+" is: "+(c));
        }
        else
        {
            System.out.println("Occurence of "+arrOfStrings[arrOfStrings.length-1]+" is: ");
        }

    }
}