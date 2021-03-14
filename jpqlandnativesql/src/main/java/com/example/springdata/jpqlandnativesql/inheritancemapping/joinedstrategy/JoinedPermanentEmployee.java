package com.example.springdata.jpqlandnativesql.inheritancemapping.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_permanent")
@PrimaryKeyJoinColumn(name = "emp_id")
public class JoinedPermanentEmployee extends EmployeeForJoinedStrategy{

    private String permanent_id;

    public String getPermanent_id() {
        return permanent_id;
    }

    public void setPermanent_id(String permanent_id) {
        this.permanent_id = permanent_id;
    }
}
