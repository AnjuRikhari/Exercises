package com.example.springdata.jpqlandnativesql.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {
    private int basic_salary;
    private int bonus_salary;
    private int tax_amount;
    private int special_allowance_salary;

    public int getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(int basic_salary) {
        this.basic_salary = basic_salary;
    }

    public int getBonus_salary() {
        return bonus_salary;
    }

    public void setBonus_salary(int bonus_salary) {
        this.bonus_salary = bonus_salary;
    }

    public int getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(int tax_amount) {
        this.tax_amount = tax_amount;
    }

    public int getSpecial_allowance_salary() {
        return special_allowance_salary;
    }

    public void setSpecial_allowance_salary(int special_allowance_salary) {
        this.special_allowance_salary = special_allowance_salary;
    }
}
