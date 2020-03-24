package com.prankur.JPA2.employeesSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepos employeeRepos ;

    public void saveAllEmployees()
    {
        //saving the employeesSQL
		employeeRepos.save(new Employee("ABC", "DEF", 234634, 34));
		employeeRepos.save(new Employee("GHI", "JKL", 783545, 56));
		employeeRepos.save(new Employee("MNO", "PQR", 633462, 63));
		employeeRepos.save(new Employee("STU", "VWX", 854624, 45));
		employeeRepos.save(new Employee("YZA", "BCD", 456624, 72));
		employeeRepos.save(new Employee("EFG", "HIJ", 568346, 32));
        employeeRepos.save(new Employee("Santa", "veer singh", 339464, 27));
    }

    public void displayAllEmployee()
    {
        System.out.println(employeeRepos.findAllEmployees());
    }

    @Transactional
    public void deleteAllEmployee()
    {
        employeeRepos.deleteAllEmployees();
    }

    public void displayFirstAndLastNameOfAllEmployees()
    {
        List<Object[]> partialData = employeeRepos.findFirstAndLastNameOfAllEmployees();
        for (Object[] objects : partialData )
        {
            System.out.println(objects[0] + " " + objects[1]);
        }
    }

    public void displayAllEmployeesByFirstName(String firstName)
    {
        System.out.println(employeeRepos.findAllEmployeesByFirstName(firstName));
    }

    public void displayAllEmployeesWithSalaryGreaterThanAverageSalary()
    {
        List<Object[]> partialData = employeeRepos.findAllEmployeesWithSalaryGreaterThanAverageSalary();
        for (Object[] objects : partialData )
        {
            System.out.println(objects[0] + " " + objects[1]);
        }
    }

    @Transactional
    public void deleteAllEmployeesWithMinimumSalary()
    {
        employeeRepos.deleteAllEmployeesWithMinimumSalary(employeeRepos.returnMinimumSalary());
        System.out.println("Deleted Employees with minimum salary");

    }

    @Transactional
    public void updateSalaryOfEmployeeWithSalaryLowerThanAverageSalary(double updateSalary)
    {
        employeeRepos.updateSalaryOfAllEmployeesWithMinimumSalary(updateSalary, employeeRepos.returnAverageSalary());
        System.out.println("Salary of all Employees with salary lower than average salary has been updated by " + updateSalary);
    }

    public void displayPartialDataOfSingh()
    {
        List<Object[]> singhData = employeeRepos.findPartialDataOfSingh();
        for (Object[] objects : singhData )
        {
            System.out.println(objects[0] + " " + objects[1] + " " + objects[2]);
        }

    }

    @Transactional
    public void deleteAllEmployeesWithAgeGreaterThan45(int age)
    {
        employeeRepos.deleteAllEmployeesWithAgeGreaterThan45(age);
        System.out.println("Deleted Employees with age greater than 45");
    }

}
