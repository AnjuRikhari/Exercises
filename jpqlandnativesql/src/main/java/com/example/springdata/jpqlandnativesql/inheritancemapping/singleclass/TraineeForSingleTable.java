package com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("trainee")
public class TraineeForSingleTable extends EmployeeTableForSingleClass {
    private String training_id;

    public String getTraining_id() {
        return training_id;
    }

    public void setTraining_id(String training_id) {
        this.training_id = training_id;
    }
}
