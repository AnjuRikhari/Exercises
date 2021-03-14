package com.example.springdata.jpqlandnativesql;


import com.example.springdata.jpqlandnativesql.inheritancemapping.tableperclass.PermanentEmployee;
import com.example.springdata.jpqlandnativesql.inheritancemapping.tableperclass.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeDaoService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void findEmployeeNamesSalaryGreaterThanAvgSalary() {
        List<Object[]> employees = employeeRepository.findEmployeeNamesSalaryGreaterThanAverageSalary();
        for (Object[] objects : employees) {
            System.out.print(objects[0] + " ");
            System.out.println(objects[1]);
        }
    }

//    public void findAllEmployees(){
//        System.out.println(employeeRepository.findAllEmployees());
//    }

      @Transactional
      public void updateEmployeeSalaryWhoseSalaryLessThanAvgSalary(int salary){
            List<Integer> employeesId = employeeRepository.getEmployeeIdWhoseSalaryLessThanAvgSalary();
            for (Integer id:employeesId)
            {
                employeeRepository.updateEmpSalary(salary,id);
            }
      }

    public void findByLastName() {
        List<Object[]> employees = employeeRepository.findByLastNameNQ("singh");
        for (Object[] objects : employees) {
            System.out.print(objects[0] + " ");
            System.out.print(objects[1] + " ");
            System.out.println(objects[2]);
        }
    }

    @Transactional
    public void deleteEmployeeByAge() {
        employeeRepository.deleteEmployeeByAge(45);
    }

    @Transactional
    public void deleteEmployeesWithMinimumSalary(int minimumSalary) {
        employeeRepository.deleteEmployeeWithMinimumSalary(minimumSalary);
    }

    public void addTraineeEmployee(int id, String name, int salary, String training_id) {
        Trainee trainee = new Trainee();
        trainee.setEmp_id(id);
        trainee.setEmp_name(name);
        trainee.setEmp_salary(salary);
        trainee.setTraining_id(training_id);
        employeeRepository.save(trainee);
    }

    public void addPermanentEmployee(int id, String name, int salary, String permanent_id) {
        PermanentEmployee permanent = new PermanentEmployee();
        permanent.setEmp_id(id);
        permanent.setEmp_name(name);
        permanent.setEmp_salary(salary);
        permanent.setPermanent_id(permanent_id);
        employeeRepository.save(permanent);
    }

}
