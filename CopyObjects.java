public class CopyObjects implements Cloneable
{
    String Stringss;
    int n;

    CopyObjects(String Stringss, int n)
    {
        this.Stringss = Stringss;
        this.n = n;
    }
    public CopyObjects clone() throws CloneNotSupportedException
    {
        return (CopyObjects)super.clone();
    }
}
class Mainssss
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CopyObjects Object1 = new CopyObjects("ABC",23);
        CopyObjects Object2 = Object1.clone();
        System.out.println(Object1.hashCode());
        System.out.println(Object2.hashCode());
        System.out.println(Object1.Stringss+"  "+Object1.n);
        System.out.println(Object2.Stringss+"  "+Object2.n);
    }
}
