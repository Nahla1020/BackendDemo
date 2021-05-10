package com.springboot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Service.EmployeeService;
import com.springboot.model.Employee;
import java.util.List;

@RestController
@RequestMapping("/Employees/")
@CrossOrigin(origins= "*")


public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("All")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getAllEmployees() {
		return employeeService.getallemployees();
				
	}
		
	}
	
	
	
