package Java8;

interface Interface1
{
    default void sum(int a, int b)
    {
        System.out.println("Sum is: " + (a+b));
    }
}

interface Interface2
{
    default void product(int a, int b)
    {
        System.out.println("Multiplication is: "+(a*b));
    }
}

public class MultipleInheritance implements Interface1,Interface2
{
    public static void main(String[] args) {
        MultipleInheritance object = new MultipleInheritance();
        object.sum(1,2);
        object.product(2,3);
    }
}
