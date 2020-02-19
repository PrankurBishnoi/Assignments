//Try Catch
public class TryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int i=0/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Error Occured");
        }
        catch (Exception e)
        {
            System.out.println("Error Occured");
        }
        finally
        {
            System.out.println("Finally is Running");
        }
    }
}
