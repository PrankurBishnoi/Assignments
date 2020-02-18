public class Banks
{
    private int interest=1;
    int getDetails() { return interest; }
}
class SBI extends Banks
{
    private int interest=2;
    int getDetails() { return interest; }
}

class ICICI extends Banks
{
    private int interest=3;
    int getDetails() { return interest; }
}

class BOI extends Banks
{
    private int interest=4;
    int getDetails() { return interest; }
}
class Main
{
    public static void main(String[] args)
    {
        Banks Bank = new Banks();
        SBI Sbi = new SBI();
        ICICI Icici = new ICICI();
        BOI Boi = new BOI();
        System.out.println("Banks:  "+Bank.getDetails());
        System.out.println("SBI:  "+Sbi.getDetails());
        System.out.println("ICICI:  "+Icici.getDetails());
        System.out.println("BOI:  "+Boi.getDetails());

    }
}