package com.Prankur.SpringAssignment_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAssignment1Application {


	public static void main(String[] args)
	{
		//TightlyCoupled
		BinarySearchTightlyCoupled binarySearchTight = new BinarySearchTightlyCoupled();
		int result = binarySearchTight.binarySearchImplementation(new int[]{3,1,2},3);
		System.out.println(result);

		//Loosely Coupled
		BinarySearchLooslyCoupled binarySearchlooslyCoupled = new BinarySearchLooslyCoupled(new BubbleSort());
		result = binarySearchlooslyCoupled.binarySearchImplementation(new int[]{3,1,2},3);

		//Using beans, @Component, @Autowired
		ApplicationContext applicationContext = SpringApplication.run(SpringAssignment1Application.class, args);
		BinarySearchLooslyCoupled binarySearchLoose = applicationContext.getBean(BinarySearchLooslyCoupled.class);
		result = binarySearchLoose.binarySearchImplementation(new int[]{3,1,2},3);
		System.out.println(result);
		System.out.println(binarySearchLoose);
	}
}

