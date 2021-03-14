package com.example.springdata.jpqlandnativesql;

import com.example.springdata.jpqlandnativesql.embedded.EmployeeDetailDaoService;
import com.example.springdata.jpqlandnativesql.inheritancemapping.joinedstrategy.JoinedEmployeeDaoService;
import com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass.EmployeeDaoServiceForSingleClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpqlandnativesqlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpqlandnativesqlApplication.class, args);
		EmployeeDaoService employeeDaoService = context.getBean(EmployeeDaoService.class);

		//employees having salary greater than average salary ordered in ascending
		// by their age and in descending by their salary
		employeeDaoService.findEmployeeNamesSalaryGreaterThanAvgSalary();

		//employeeDaoService.findAllEmployees();

	//	employeeDaoService.updateEmployeeSalaryWhoseSalaryLessThanAvgSalary(47000);

		//Delete all employees with minimum salary.
		//employeeDaoService.deleteEmployeesWithMinimumSalary(46000);

		//Find by last name
//		employeeDaoService.findByLastName();

		//Delete by Employee Age
		//employeeDaoService.deleteEmployeeByAge();

		//For single table inheritance
		EmployeeDaoServiceForSingleClass employeeDaoServiceForSingleClass = context.getBean(EmployeeDaoServiceForSingleClass.class);
//		employeeDaoService.addPermanentEmployee(102,"Clark",50000,"p1");
//		employeeDaoService.addTraineeEmployee(103,"Stark",10000,"t2");
		employeeDaoServiceForSingleClass.addTraineeEmployee(104,"Bravo",10000,"t3");

		//For Table per Class
//		employeeDaoService.addPermanentEmployee(101,"Clark",50000,"p1");
//		employeeDaoService.addTraineeEmployee(101,"Stark",10000,"t1");

//		JoinedEmployeeDaoService joinedEmployeeDaoService = context.getBean(JoinedEmployeeDaoService.class);
//		//Joined Strategy
//		joinedEmployeeDaoService.addPermanentEmployee(101,"Clark","p1");
//		joinedEmployeeDaoService.addTraineeEmployee(102,"Stark","t1");

		//Embedded mapping using Employee table
//		EmployeeDetailDaoService employeeDetailDaoService = context.getBean(EmployeeDetailDaoService.class);
//		employeeDetailDaoService.addEmployeee(1,"John","Smith",30,30000,5000,2000,1000);
	}


}
