package com.example.springdata.jpqlandnativesql.inheritancemapping.tableperclass;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("permanent")
@Table(name = "permanent_employee")
public class PermanentEmployee extends EmployeeForTablePerClassInheritance{

    private String permanent_id;

    public String getPermanent_id() {
        return permanent_id;
    }

    public void setPermanent_id(String permanent_id) {
        this.permanent_id = permanent_id;
    }
}
