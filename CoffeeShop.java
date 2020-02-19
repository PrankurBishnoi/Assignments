public class CoffeeShop {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.GiveOrder(40,"Coffee");

    }
}

class Customer
{
    int cash=100;
    int id;
    static Cashier cashier = new Cashier();
    void GiveOrder(int cost,String order)
    {
        cash-=cost;
        cashier.TakeOrders(cost, order);
    }
    void GivenOrder(int id,String order)
    {
        this.id=id;
        System.out.println("Customer: Order given for "+order+" and orderid is "+id);
    }
    void TakeCoffee(String order)
    {
        System.out.println("Customer: Customer has taken "+order);
    }

}

class Cashier
{
    int cash=120;
    String order;
    static Customer customer = new Customer();
    static Barista barista = new Barista();
    void TakeOrders(int cost, String order)
    {
        this.cash+=cost;
        this.order=order;
        System.out.println("Cashier: Order taken for "+order+" with orderid 1");
        customer.GivenOrder(1,order);
        barista.order(order);
    }
    void GiveCoffee(String order)
    {
        System.out.println("Cashier: "+order+ " is ready, take it");
        customer.TakeCoffee(order);
    }
}

class Barista
{
    String order;
    void order(String order)
    {
        Cashier cashier = new Cashier();
        System.out.println("Barista: Barista is preparing "+order);
        System.out.println("Barista: "+order+" has been prepared");
        cashier.GiveCoffee(order);
    }
}
