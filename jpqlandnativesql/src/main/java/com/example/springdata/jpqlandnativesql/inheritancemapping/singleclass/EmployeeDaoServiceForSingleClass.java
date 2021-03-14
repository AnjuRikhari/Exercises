package com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass;


import com.example.springdata.jpqlandnativesql.inheritancemapping.PermanentEmployee;
import com.example.springdata.jpqlandnativesql.inheritancemapping.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoServiceForSingleClass {

    @Autowired
    EmployeeRepositoryForSingleClass employeeRepository;

    public void addTraineeEmployee(int id, String name, int salary, String training_id) {
        TraineeForSingleTable trainee = new TraineeForSingleTable();
        trainee.setEmp_id(id);
        trainee.setEmp_name(name);
        trainee.setEmp_salary(salary);
        trainee.setTraining_id(training_id);
        employeeRepository.save(trainee);
    }

    public void addPermanentEmployee(int id, String name, int salary, String permanent_id) {
        PermanentEmployeeForSingleTable permanent = new PermanentEmployeeForSingleTable();
        permanent.setEmp_id(id);
        permanent.setEmp_name(name);
        permanent.setEmp_salary(salary);
        permanent.setPermanent_id(permanent_id);
        employeeRepository.save(permanent);
    }
}
