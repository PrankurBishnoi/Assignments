import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Percentage
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String Strings=sc.nextLine();

        int u=0,l=0,d=0,s=0,i=0,j=0;

        for(i=0;i<Strings.length();i++)
        {
            if(Character.isLowerCase(Strings.charAt(i)))
            {
                l++;
            }
            else if(Character.isUpperCase(Strings.charAt(i)))
            {
                u++;
            }
            else if(Character.isDigit(Strings.charAt(i)))
            {
                d++;
            }
            else
            {
                s++;
            }
        }
        System.out.println("Total:- "+(l+u+s+d));
        System.out.println("LowerCase:-   Number ( "+l+" ) and percentage ( "+((l*100)/Strings.length())+"),");
        System.out.println("UpperCase:-   Number ( "+u+" ) and percentage ( "+((u*100)/Strings.length())+"),");
        System.out.println("UpperCase:-   Number ( "+d+" ) and percentage ( "+((d*100)/Strings.length())+"),");
        System.out.println("UpperCase:-   Number ( "+s+" ) and percentage ( "+((s*100)/Strings.length())+"),");


    }
}
