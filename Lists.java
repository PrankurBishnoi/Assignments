import java.util.*;

public class Lists
{
    public static void main(String[] args)
    {
        float FloatAdd=(float) 0;
        Scanner sc = new Scanner(System.in);
        LinkedList<Float> Numbers = new LinkedList<Float>();
        System.out.println("Enter 5 Floating Numbers: ");

        for(int i=0; i<5 ; i++)
        {
            Numbers.add(sc.nextFloat());
        }
        Iterator<Float> It = Numbers.iterator();

        while(It.hasNext())
        {
            FloatAdd += It.next();
        }

        System.out.println("Sum is: " + FloatAdd);
    }
}
