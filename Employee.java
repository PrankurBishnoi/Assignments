package Java8;

public class Employee
{
    private String name;
    private String city;
    private int age;

    Employee(String name, String city, Integer age)
    {
        this.name=name;
        this.city=city;
        this.age= age;
    }

    public String toString()
    {
        return "{" + "name= '" + name + "', city+'" + city + "', age='" + age +"'}";
    }
}

interface Reference
{
    Employee refer(String name, String city, Integer age);
}

class Class
{
    public static void main(String[] args) {
        Reference ref = Employee::new;
        Employee employee = ref.refer("ABC", "DEF",10);
        System.out.println(employee.toString());
    }
}
