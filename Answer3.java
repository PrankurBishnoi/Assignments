package Java8;

interface Calculator
{
    int calc(int a, int b);
}

public class Answer3 {
    void instanceMethod()
    {
        System.out.println("Instance Method. ");
    }
    int add(int a, int b)
    {
        return a+b;
    }
    int subtract(int a, int b)
    {
        return a-b;
    }
    static int product(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        Answer3 object = new Answer3();
        Calculator Object1 = object::add;
        Calculator Object2 = object::subtract;
        Calculator Object3 = Answer3::product;

        System.out.println("Sum: " + Object1.calc(1,2));
        System.out.println("Difference: " + Object2.calc(1,2));
        System.out.println("Product: " + Object3.calc(1,2));
    }
}
