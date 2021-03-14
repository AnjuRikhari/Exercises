package com.example.springdata.jpqlandnativesql.inheritancemapping.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_training")
@PrimaryKeyJoinColumn(name = "emp_id")
public class JoinedTrainee extends EmployeeForJoinedStrategy {

    private String training_id;

    public String getTraining_id() {
        return training_id;
    }

    public void setTraining_id(String training_id) {
        this.training_id = training_id;
    }
}

