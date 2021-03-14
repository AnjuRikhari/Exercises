package com.example.springdata.jpqlandnativesql;
import com.example.springdata.jpqlandnativesql.inheritancemapping.tableperclass.EmployeeForTablePerClassInheritance;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeForTablePerClassInheritance,Integer> {

    @Query("select firstName, lastName from Employee where salary > ( select AVG(salary) from Employee) order by age ASC, salary DESC")
    List<Object[]>  findEmployeeNamesSalaryGreaterThanAverageSalary();

    @Query("from Employee")
    List<Employee> findAllEmployees();

    @Query("select id from Employee where salary < ( select AVG(salary) from Employee)")
    List<Integer> getEmployeeIdWhoseSalaryLessThanAvgSalary();


    @Modifying
    @Query("UPDATE Employee set salary = :updatedSalary where id= :givenId")
    void updateEmpSalary(@Param("updatedSalary") int updatedSalary, @Param("givenId") int id);

    @Modifying
    @Query("delete from Employee where salary< :empSalary")
    void deleteEmployeeWithMinimumSalary(@Param("empSalary") int salary);

    @Query(value = "select emp_id, emp_first_name, emp_age from employee_table where emp_last_name=:lastName", nativeQuery = true)
    List<Object[]> findByLastNameNQ(@Param("lastName")String lastName);

    @Modifying
    @Query(value = "delete from employee_table where emp_age>:empAge", nativeQuery = true)
    void deleteEmployeeByAge(@Param("empAge") int empAge);


}
