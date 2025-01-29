package com.secular.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secular.main.model.Employee;
import com.secular.main.repository.EmployeeRepository;
import com.secular.main.serviceinterface.EmployeeServiceInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface  {
	@Autowired
	private EmployeeRepository er;

	@Override
	public Employee saveData(Employee emp) {
		
		return er.save(emp);
	}

}
