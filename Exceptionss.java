
//ClassNotFoundException is a runtime exception that is thrown when an application tries to load a class at runtime using the Class.forName() or loadClass() or findSystemClass() methods ,and the class with specified name are not found in the classpath. For example, you may have come across this exception when you try to connect to MySQL or Oracle databases and you have not updated the classpath with required JAR files. Most of the time, this exception occurs when you try to run an application without updating the classpath with required JAR files.
//Class is not declared so exception with be given
public class Exceptionss
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("ddsc");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

//NoClassDefFoundError is an error that is thrown when the Java Runtime System tries to load the definition of a class, and that class definition is no longer available. The required class definition was present at compile time, but it was missing at runtime.
//if this code below is compiled, two files will be created a.class b.class. If a.class is deleted and b.class is run, it will show NoClassDefFoundError
class A
{
    // some code
}
class B
{
    public static void main(String[] args)
    {
        A a = new A();
    }
}