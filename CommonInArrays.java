import java.util.Scanner;

public class CommonInArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Array1[] = {24,547,756,23,43,6,87,54};
        int Array2[] = {234,532,547,23,5,6,254,45};
        for (int i : Array1)
            for (int j : Array2)
            {
                if ( i == j )
                {
                    System.out.println(i);
                }
            }

    }
}
