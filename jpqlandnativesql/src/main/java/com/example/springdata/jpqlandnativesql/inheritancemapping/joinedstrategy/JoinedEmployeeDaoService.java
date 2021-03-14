package com.example.springdata.jpqlandnativesql.inheritancemapping.joinedstrategy;

import com.example.springdata.jpqlandnativesql.inheritancemapping.PermanentEmployee;
import com.example.springdata.jpqlandnativesql.inheritancemapping.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JoinedEmployeeDaoService {

    @Autowired
    JoinedEmployeeRepository joinedEmployeeRepository;
    public void addTraineeEmployee(int id, String name, String training_id) {
        JoinedTrainee trainee = new JoinedTrainee();
        trainee.setEmp_id(id);
        trainee.setEmp_name(name);
        trainee.setTraining_id(training_id);
        joinedEmployeeRepository.save(trainee);
    }

    public void addPermanentEmployee(int id, String name, String permanent_id) {
        JoinedPermanentEmployee permanentEmployee = new JoinedPermanentEmployee();
        permanentEmployee.setEmp_id(id);
        permanentEmployee.setEmp_name(name);
        permanentEmployee.setPermanent_id(permanent_id);
        joinedEmployeeRepository.save(permanentEmployee);
    }
}

