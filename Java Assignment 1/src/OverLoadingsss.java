public class OverLoadingsss
{
    static int Add(int a,int b){return a+b;}
    static double Add(double a,double b){return a+b;}
    static float Multiply(float a,float b){return a*b;}
    static int Multiply(int a,int b){return a*b;}
    static String ConCat(String a,String b){return a+b;}
    static String ConCat(String a,String b,String c){return a+b+c;}

    public static void main(String[] args)
    {
        int a=2,b=3;
        double d=2343.234,e=123.124;
        float g=(float)3.3 ,h= (float)4.4 ;
        String S1 = new String("Hi");
        String S2 = new String(" there");
        String S3 = new String(" Handsome");
        int c = Add(a,b);
        double f = Add(d,e);
        float i = Multiply(g,h);
        int m = Multiply(a,b);
        String S4 = ConCat(S1,S2);
        String S5 = ConCat(S1,S2,S3);
        System.out.println("Add 2 Integer:  "+c);
        System.out.println("Add 2 Double:  "+f);
        System.out.println("Multiply 2 Float:  "+i);
        System.out.println("Multiply 2 integer:  "+m);
        System.out.println("ConCatinate 2 String:  "+S4);
        System.out.println("ConCatinate 2 String:  "+S5);


    }
}
