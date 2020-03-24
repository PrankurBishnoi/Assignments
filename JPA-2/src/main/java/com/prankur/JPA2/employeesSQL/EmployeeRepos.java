package com.prankur.JPA2.employeesSQL;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepos extends CrudRepository<Employee,Long>
{
    @Query("from Employee")
    List<Employee> findAllEmployees();

    @Query("select firstName,lastName from Employee")
    List<Object[]> findFirstAndLastNameOfAllEmployees();

    @Query("from Employee where firstName = :fName")
    List<Employee> findAllEmployeesByFirstName(@Param("fName") String firstName);

    @Query("select firstName,lastName from Employee where salary > (select avg(salary) from Employee) order by age asc, salary desc ")
    List<Object[]> findAllEmployeesWithSalaryGreaterThanAverageSalary();

    @Modifying
    @Query("delete from Employee")
    void deleteAllEmployees();

    @Query("select MIN(salary) from Employee")
    double returnMinimumSalary();

    @Modifying
    @Query("delete from Employee where salary = :minSalary")
    void deleteAllEmployeesWithMinimumSalary(@Param("minSalary") double minimumSalary);

    @Query("select AVG(salary) from Employee")
    double returnAverageSalary();

    @Modifying
    @Query("update Employee set salary =salary + :updateSalary where salary < :averageSalary")
    void updateSalaryOfAllEmployeesWithMinimumSalary(@Param("updateSalary") double updateSalary, @Param("averageSalary") double averageSalary);

    @Query(value = "select emp_id,emp_first_name,emp_age from employee_table where emp_last_name like '%singh'", nativeQuery = true)
    List<Object[]> findPartialDataOfSingh();

    @Modifying
    @Query(value = "delete from employee_table where emp_age > :age",nativeQuery = true)
    void deleteAllEmployeesWithAgeGreaterThan45(@Param("age") int age);

}
