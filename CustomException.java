import java.util.Scanner;

public class CustomException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your Age : ");
            int Age = sc.nextInt();
            if (Age>0)
            {
                System.out.println("Valid Age");
            }
            else
            {
                throw (new AgeInvalidException("Invalid Age"));
            }
        }
        catch (AgeInvalidException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String message)
    {
        super(message);
    }
}