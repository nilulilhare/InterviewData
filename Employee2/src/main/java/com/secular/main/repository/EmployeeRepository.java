package com.secular.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.secular.main.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {

}
