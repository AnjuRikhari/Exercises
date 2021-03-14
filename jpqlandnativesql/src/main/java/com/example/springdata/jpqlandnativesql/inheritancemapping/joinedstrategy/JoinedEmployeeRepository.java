package com.example.springdata.jpqlandnativesql.inheritancemapping.joinedstrategy;

import org.springframework.data.repository.CrudRepository;

public interface JoinedEmployeeRepository extends CrudRepository<EmployeeForJoinedStrategy,Integer> {

}
