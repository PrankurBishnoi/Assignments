import javax.crypto.spec.PSource;
import java.util.*;

public class SpecialStack
{
    static LinkedList<Integer> list = new LinkedList<>();
    static int min=101;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values for Linked list (Range 1-100),(Enter 0 to end)");
        int n;
        while((n=sc.nextInt())!=0)
        {
            if(list.size()>=10)
                full();
            else
                push(n);
        }
        showMin();
        pop();  pop();  pop();  pop();  pop();  pop();  pop();  pop();  pop();  pop();  pop();
        showMin();
    }
    static void pop()
    {
        if(list.isEmpty())
            Empty();
        else {
            list.pop();
            if(!list.isEmpty())
                min();
        }
    }
    static void Empty()
    {
        if(list.isEmpty())
            System.out.println("List is Empty.");
        else
            System.out.println("List is not Empty.");
    }
    static void push(int n)
    {
            list.push(n);
            min();
    }
    static void full()
    {
        if(list.size()>=10)
            System.out.println("List is Full (Enter 0)");
        else
            System.out.println("List is not Full");
    }
    static void min()
    {
        if(list.isEmpty())
            System.out.println("Empty list, Can't Min");
        else
            min=Collections.min(list);
    }
    static void showMin()
    {
        if(list.isEmpty())
            System.out.println("Empty list can't show min");
        else
            System.out.println("Minimum is: "+min);
    }

}
