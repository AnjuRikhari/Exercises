package com.example.springdata.jpqlandnativesql.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetailDaoService {

    @Autowired
    EmployeeDetailRepository employeeDetailRepository;
    public void addEmployeee(int id, String firstname, String lastname, int age, int basicSalary, int bonusSalary,
                             int taxAmount, int specialAllowanceSalary){
        EmployeeDetail employee = new EmployeeDetail();
        employee.setId(id);
        employee.setFirstname(firstname);
        employee.setLastname(lastname);
        employee.setAge(age);
        Salary salary = new Salary();
        salary.setBasic_salary(basicSalary);
        salary.setBonus_salary(bonusSalary);
        salary.setTax_amount(taxAmount);
        salary.setSpecial_allowance_salary(specialAllowanceSalary);
        employee.setSalary(salary);
        employeeDetailRepository.save(employee);
    }
}

