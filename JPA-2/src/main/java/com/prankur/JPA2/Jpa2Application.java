package com.prankur.JPA2;

import com.prankur.JPA2.embeddedMapping.Employeee;
import com.prankur.JPA2.embeddedMapping.EmployeeeRepos;
import com.prankur.JPA2.embeddedMapping.Salary;
import com.prankur.JPA2.employeesSQL.EmployeeService;
import com.prankur.JPA2.inheritance.joined.ChequeJoined;
import com.prankur.JPA2.inheritance.joined.CreditCardJoined;
import com.prankur.JPA2.inheritance.joined.PaymentReposJoined;
import com.prankur.JPA2.inheritance.singleTable.ChequeSingleTable;
import com.prankur.JPA2.inheritance.singleTable.CreditCardSingleTable;
import com.prankur.JPA2.inheritance.singleTable.PaymentReposSingleTable;
import com.prankur.JPA2.inheritance.tablePerClass.ChequeTablePerClass;
import com.prankur.JPA2.inheritance.tablePerClass.CreditCardTablePerClass;
import com.prankur.JPA2.inheritance.tablePerClass.PaymentReposTablePerClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Jpa2Application {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(Jpa2Application.class, args);

		//EmployeeRepos employeeRepos = applicationContext.getBean(EmployeeRepos.class);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

//Delete all Employees
		//employeeService.deleteAllEmployee();

//Save all Employees
		//employeeService.saveAllEmployees();

//Display all Employees
		//employeeService.displayAllEmployee();

//Display firstName and lastName of all Employees
		//employeeService.displayFirstAndLastNameOfAllEmployees();

//Display All employeesSQL by firstName
		//employeeService.displayAllEmployeesByFirstName("GHI");

//Ans 1-
		System.out.println(" ");
		System.out.println("Ans 1-");
		//employeeService.displayAllEmployeesWithSalaryGreaterThanAverageSalary();

//Ans 2-
		System.out.println(" ");
		System.out.println("Ans 2-");
		//employeeService.updateSalaryOfEmployeeWithSalaryLowerThanAverageSalary(999999);

//Ans 3-
		System.out.println(" ");
		System.out.println("Ans 3-");
		//employeeService.deleteAllEmployeesWithMinimumSalary();

//Ans 4-
		System.out.println(" ");
		System.out.println("Ans 4-");
		//employeeService.displayPartialDataOfSingh();

//Ans 5-
		System.out.println(" ");
		System.out.println("Ans 5-");
		//employeeService.deleteAllEmployeesWithAgeGreaterThan45(45);


//Inheritance Mapping
//Ans 6- Single Table Mapping
		//PaymentReposSingleTable paymentReposSingleTable = applicationContext.getBean(PaymentReposSingleTable.class);
		//paymentReposSingleTable.save(new ChequeSingleTable(23562,"cheque1"));
		//paymentReposSingleTable.save(new CreditCardSingleTable(45756,"CreditCard1"));

//Ans 7- Table Per Cass Mapping
		//PaymentReposTablePerClass paymentReposTablePerClass = applicationContext.getBean(PaymentReposTablePerClass.class);
		//paymentReposTablePerClass.save(new ChequeTablePerClass(23562,"cheque1"));
		//paymentReposTablePerClass.save(new CreditCardTablePerClass(45756,"CreditCard1"));

//Ans 8- Joined Mapping
		//PaymentReposJoined paymentReposJoined = applicationContext.getBean(PaymentReposJoined.class);
		//paymentReposJoined.save(new ChequeJoined(23562,"cheque1"));
		//paymentReposJoined.save(new CreditCardJoined(45756,"CreditCard1"));


//Ans 9- Embedded Mapping
		//EmployeeeRepos employeeeRepos = applicationContext.getBean(EmployeeeRepos.class);
		//employeeeRepos.save(new Employeee("ABC","DEF",45, new Salary(100000,10000,1000,100)));


	}
}
