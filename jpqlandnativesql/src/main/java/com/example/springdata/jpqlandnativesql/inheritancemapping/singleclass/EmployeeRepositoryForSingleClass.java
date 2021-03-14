package com.example.springdata.jpqlandnativesql.inheritancemapping.singleclass;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepositoryForSingleClass extends CrudRepository<EmployeeTableForSingleClass,Integer> {
}
