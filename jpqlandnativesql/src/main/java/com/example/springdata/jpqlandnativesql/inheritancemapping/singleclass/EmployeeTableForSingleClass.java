package com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass;

import javax.persistence.*;

@Entity
@Table(name = "employee_for_single_table_inheritance")
@DiscriminatorColumn(name = "employment_type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EmployeeTableForSingleClass {
    @Id
    private int emp_id;
    private String emp_name;
    private int emp_salary;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(int emp_salary) {
        this.emp_salary = emp_salary;
    }
}
