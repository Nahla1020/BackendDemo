package com.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.repository.*;

@Service
public class EmployeeService {
	 
	@Autowired
	 private EmployeeRepository employeeRepository;
	
	 public List getallemployees() {
		return employeeRepository.findAll();
	}

}
