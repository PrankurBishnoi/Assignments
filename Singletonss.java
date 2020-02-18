public class Singletonss
{
    private static Singletonss Single_Instance = null;

    int i;

    private Singletonss()
    {
        i=10;
    }
    public static Singletonss getInstance()
    {
        if(Single_Instance == null)
            Single_Instance = new Singletonss();
        return Single_Instance;
    }
}

class Main
{
    public static void main(String[] args) {
        Singletonss Singles = Singletonss.getInstance();

        System.out.println("Singles is : "+Singles.i);
    }
}