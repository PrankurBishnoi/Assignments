import java.util.Scanner;
//  didnt print element with only one copy bcz there can be an element with 3 copies
public class TwiceExceptOne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements to be in the array");
        int n = sc.nextInt();
        int Array1[]= new int[n];
        System.out.println("Enter the values for Array");
        for(int i=0;i<n;i++)
        {
            Array1[i]=sc.nextInt();
        }
        for (int i:Array1)
        {
            int c=0;
            for (int j:Array1 )
            {
                if( i==j )
                    c++;
            }
            if ( c!=2) {
                System.out.println("Element is: " + i);
                break;
            }
        }
    }
}