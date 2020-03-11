package com.prankur.RestfulServices.Employees;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeDaoService
{
    private static List<Employee> employees = new ArrayList<>();
    private static int usersCount = 3;
    static
    {
        employees.add(new Employee(1,"ABC",54));
        employees.add(new Employee(2,"DEF",34));
        employees.add(new Employee(3,"GHI",67));
    }

    public List<Employee> findAll()
    {
        return employees;
    }

    public Employee save(Employee employee)
    {
        if(employee.getId()==null)
            employee.setId(++usersCount);
        employees.add(employee);
        return employee;
    }

    public Employee findOne(int id)
    {
        for(Employee employee:employees)
        {
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    public Employee deleteone(int id)
    {
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            if(employee.getId()==id)
            {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }

    public Employee updateOne(Employee employee)
    {
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext())
        {
            Employee employee1 = iterator.next();
            if(employee1.getId()==employee.getId())
            {
                employee1.setAge(employee.getAge());
                employee1.setName(employee.getName());
                return iterator.next();
            }
        }
        return null;
    }
}
