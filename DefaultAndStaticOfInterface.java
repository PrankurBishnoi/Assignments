package Java8;

interface Interface
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
    default void defaultMethod()
    {
        System.out.println("Default Method");
    }
}

public class DefaultAndStaticOfInterface implements Interface
{
    public static void main(String[] args) {
        DefaultAndStaticOfInterface Objects = new DefaultAndStaticOfInterface();
        Interface.staticMethod();
        Objects.defaultMethod();
    }
}
