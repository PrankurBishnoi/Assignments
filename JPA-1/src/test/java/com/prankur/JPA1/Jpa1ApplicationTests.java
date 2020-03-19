package com.prankur.JPA1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Jpa1ApplicationTests {

	@Autowired
	EmployeeRepos employeeRepos;

	@Test
	void contextLoads() {
	}

	@Test
	void displayAllEmployee()
	{
		Iterable<Employee> iterable = employeeRepos.findAll();
		iterable.forEach(System.out::println);
	}

	// Ans 3- Perform Create Operation on Entity using Spring Data JPA
	@Test
	void  saveEmployees()
	{
		employeeRepos.save(new Employee("ABC",23,"DEF"));
		employeeRepos.save(new Employee("GHI",78,"JKL"));
		employeeRepos.save(new Employee("MNO",34,"PQR"));
		employeeRepos.save(new Employee("STU",67,"VWX"));
		employeeRepos.save(new Employee("YZA",45,"BCD"));
		employeeRepos.save(new Employee("EFG",37,"HIJ"));
	}

	// Ans 4- Perform Update Operation on Entity using Spring Data JPA
	// Check id in the table in MySql first then use that id
	@Test
	void updateEmployee()
	{
		Optional<Employee> optional = employeeRepos.findById(1);
		if (optional.isPresent())
		{
			Employee employee = optional.get();
			employee.setName("QWE");
			employeeRepos.save(employee);
		}
	}

	//Ans 5- Perform Delete Operation on Entity using Spring Data JPA
	@Test
	void deleteEmployee()
	{
		System.out.println("Before deleting Employee - ");
		Iterable<Employee> iterable = employeeRepos.findAll();
		iterable.forEach(System.out::println);

		employeeRepos.deleteById(4);

		System.out.println("After deleting Employee - ");
		iterable = employeeRepos.findAll();
		iterable.forEach(System.out::println);

	}

	//Ans 6- Perform Read Operation on Entity using Spring Data JPA
	@Test
	void readOperation()
	{
		Optional<Employee> optional = employeeRepos.findById(1);
		if (optional.isPresent())
		{
			Employee employee = optional.get();
			System.out.println(employee);
		}
	}

	//Ans 7- Get the total count of the number of Employees
	@Test
	void countEmployees()
	{
		long count = employeeRepos.count();
		System.out.println("Total number of Employees is: " + count);
	}

	//Ans 8- Implement Pagination and Sorting on the bases of Employee Age
	@Test
	void paginationAndSorting()
	{
		Pageable pageable = PageRequest.of(0,2, Sort.by(Sort.Direction.ASC,"age"));
		Iterable<Employee> iterable = employeeRepos.findAll(pageable);
		iterable.forEach(System.out::println);
	}

	//Ans 9- Create and use finder to find Employee by Name
	@Test
	void finderEmployeeByName()
	{
		List<Employee> employees = employeeRepos.findByName("ABC");
		employees.forEach(System.out::println);
	}

	//Ans 10- Create and use finder to find Employees starting with A character
	@Test
	void findEmployeeWithNameStartingWithA()
	{
		String pattern = "A%";
		List<Employee> employees = employeeRepos.findByNameLike(pattern);
		employees.forEach(System.out::println);
	}

	//Ans 11- Create and use finder to find Employees Between the age of 28 to 32
	@Test
	void findEmployeesWithAgeBtw28And32()
	{
		List<Employee> employees = employeeRepos.findByAgeBetween(28,32);
		employees.forEach(System.out::println);
	}
}
