enum House
{
    A(300),B(400),C(3000);
    House(int Price)
    {
        this.price=Price;
    }
    private int price;
    int getPrice()
    {
        return this.price;
    }

}

class Enumms
{
    public static void main(String[] args)
    {
        System.out.println(House.A.getPrice());
        System.out.println(House.B.getPrice());
        System.out.println(House.C.getPrice());

    }
}