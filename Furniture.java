public class Furniture
{
    String FireTest;
    String StressTest;
    int Weight;
    int Height;
}

class WoodenChair extends Furniture
{
    WoodenChair()
    {
        super.Weight=290;
        super.Height=3244;
        super.FireTest="Failed";
        super.StressTest="Passed";
    }
    void ShowWoodenChair()
    {
        System.out.println("\nWooden Chair: ");
        System.out.println("Weight = "+super.Weight);
        System.out.println("Weight = "+super.Height);
        System.out.println("FireTest = "+super.FireTest);
        System.out.println("StressTest = "+super.StressTest);
    }
}

class WoodenTable extends Furniture
{
    WoodenTable()
    {
        super.Weight = 2930;
        super.Height = 7755;
        super.FireTest = "Failed";
        super.StressTest = "Passed";
    }
    void ShowWoodenTable()
    {
        System.out.println("\nWooden Table: ");
        System.out.println("Weight = "+super.Weight);
        System.out.println("Weight = "+super.Height);
        System.out.println("FireTest = "+super.FireTest);
        System.out.println("StressTest = "+super.StressTest);
    }
}

class MetalChair extends Furniture
{
    MetalChair()
    {
        super.Weight = 579;
        super.Height = 5698;
        super.FireTest = "Passed";
        super.StressTest = "Passed";
    }
    void ShowMetalChair()
    {
        System.out.println("\nMetal Chair: ");
        System.out.println("Weight = "+super.Weight);
        System.out.println("Weight = "+super.Height);
        System.out.println("FireTest = "+super.FireTest);
        System.out.println("StressTest = "+super.StressTest);
    }
}

class MetalTable extends Furniture
{
    MetalTable()
    {
        super.Weight = 986;
        super.Height = 7654;
        super.FireTest = "Passed";
        super.StressTest = "Passed";
    }
    void ShowMetaltable()
    {
        System.out.println("\nMetal Table: ");
        System.out.println("Weight = "+super.Weight);
        System.out.println("Weight = "+super.Height);
        System.out.println("FireTest = "+super.FireTest);
        System.out.println("StressTest = "+super.StressTest);
    }
}

class Mains
{
    public static void main(String[] args)
    {
        WoodenChair WChair = new WoodenChair();
        WoodenTable WTable = new WoodenTable();
        MetalChair MChair = new MetalChair();
        MetalTable MTable = new MetalTable();

        WChair.ShowWoodenChair();
        WTable.ShowWoodenTable();
        MChair.ShowMetalChair();
        MTable.ShowMetaltable();
    }
}