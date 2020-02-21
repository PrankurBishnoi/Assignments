import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator
{
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<Employee>();

        employee.add(new Employee(80,5000,"ABC"));
        employee.add(new Employee(45,6000,"DEF"));
        employee.add(new Employee(67,9000,"GHI"));
        employee.add(new Employee(34,3000,"JKL"));
        employee.add(new Employee(64,5000,"MNO"));

        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee E1, Employee E2) {
                if(E1.getSalary()>E2.getSalary())
                    return 1;
                else if (E1.getSalary()<E2.getSalary())
                    return -1;
                return 0;
            }
        });
        for (Employee employees: employee )
        {
            System.out.println("Employee: " + employees.getName() + " Age: " + employees.getAge() + " Salary: " + employees.getSalary());
        }
    }
}

class Employee
{
    private double Age;
    private double Salary;
    private String Name;

    Employee(double age,double salary, String name)
    {
        this.Age=age;
        this.Salary=salary;
        this.Name=name;
    }

    double getAge() { return Age; }
    double getSalary() { return Salary; }
    String getName() { return Name; }


}