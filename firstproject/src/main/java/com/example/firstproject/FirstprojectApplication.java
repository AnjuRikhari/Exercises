package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstprojectApplication.class, args);

		BinarySearchImpl bSearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = bSearch.binarySearch(new int[]{1,2,4,6},2);
		if (result==1)
			System.out.println("Searched Number found ");
		else
			System.out.println("Number Not found");

	}

}


