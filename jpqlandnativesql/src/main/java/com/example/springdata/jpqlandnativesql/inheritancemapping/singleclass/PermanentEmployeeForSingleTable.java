package com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanent")
public class PermanentEmployeeForSingleTable extends EmployeeTableForSingleClass {

    private String permanent_id;

    public String getPermanent_id() {
        return permanent_id;
    }

    public void setPermanent_id(String permanent_id) {
        this.permanent_id = permanent_id;
    }
}
