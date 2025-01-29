package com.secular.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.secular.main.model.Employee;
import com.secular.main.serviceinterface.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceInterface esi;
	
	@PostMapping("/saveEmpData")
	public ResponseEntity<Employee> SaveData(@RequestBody Employee emp)
	{
		Employee eData=esi.saveData(emp);
		return new ResponseEntity<Employee>(eData,HttpStatus.CREATED);
		
	}
	

}
