package Java8;

interface First
{
    boolean greater(int a,int b);
}

interface Second
{
    int increments(int a);
}

interface Third
{
    String ConCat(String S1,String S2);
}

interface Fourth
{
    String Upper(String S1);
}

public class Lambdass
{
    public static void main(String[] args) {
        First f = (a,b) -> {
            if(a>b)
                return true;
            else
                return false;
        };
        boolean great = f.greater(1,2);
        if(great)
            System.out.println("First number is greater.");
        else
            System.out.println("First number is not greater.");

        Second s = a->a+1;
        System.out.println("Incremented value is: "+s.increments(1));

        Third t = ((S1, S2) -> {
            return S1.concat(S2);
        });
        System.out.println("String after concatination is: "+t.ConCat("Hello ","World"));

        Fourth f2 = S1 -> S1.toUpperCase();
        System.out.println("String in uppercase is: "+f2.Upper("hello world"));
    }
}