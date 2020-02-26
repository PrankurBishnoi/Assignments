package Java8;

interface Interfaces
{
    default void defaultMethod()
    {
        System.out.println("Default Method.");
    }
}

public class OverrideDefault implements Interfaces
{
    void defaultmethod()
    {
        System.out.println("Overriding Method.");
    }

    public static void main(String[] args) {
        Interfaces interfacess = new OverrideDefault();
        OverrideDefault Object = new OverrideDefault();
        Object.defaultmethod();
        interfacess.defaultMethod();
    }
}
