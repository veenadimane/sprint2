package com.sakha.sakhaBoot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.sakhaBoot.repo.EmployeeRepo;
import com.sakha.sakhaBoot.model.Employee;

@Service 
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee save(Employee emp) {
		return repo.save(emp);
	}
//	public Employee getByName(String name) {
//		return repo.getemployeeByName(name);
//	}
	public Employee getEmployee(Integer empId) {
	return repo.getOne(empId);
	}
	public void deleteEmployee(Integer empId) {
		repo.deleteById(empId);
	}
	public List<Employee>getAllEmployee(){
		return repo.findAll();
	}
}
