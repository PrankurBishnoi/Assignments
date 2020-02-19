import java.util.Scanner;

// While
public class Done
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Words one by one : ");
        String Strings = sc.next();
        while (!Strings.equalsIgnoreCase("done"))
        {
            if ( Character.toLowerCase(Strings.charAt(0)) == Character.toLowerCase(Strings.charAt(Strings.length()-1)) )
            {
                System.out.println("First and Last are Equal");
            }
            else
            {
                System.out.println("First and Last are not Equal");
            }
            Strings = sc.next();
        }

    }
}

// Do While
//public class Done
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Words one by one : ");
//        String Strings;
//        do
//        {
//            Strings = sc.next();
//            if(!Strings.equalsIgnoreCase("done"))
//            {
//                if ( Character.toLowerCase(Strings.charAt(0)) == Character.toLowerCase(Strings.charAt(Strings.length()-1)) )
//                {
//                    System.out.println("First and Last are Equal");
//                }
//                else
//                {
//                    System.out.println("First and Last are not Equal");
//                }
//            }
//        }while (!Strings.equalsIgnoreCase("done"));
//
//    }
//}
