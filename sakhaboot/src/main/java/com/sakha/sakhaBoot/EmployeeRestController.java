package com.sakha.sakhaBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.sakhaBoot.model.Employee;
import com.sakha.sakhaBoot.service.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
		@Autowired
		EmployeeService es;
		
		@GetMapping("/employees")
		public List<Employee> getAllEmployees() throws Exception{
			return es.getAllEmployees();
		}
		
		@GetMapping("/employees/{empId}")
		public Employee getEmployee(@PathVariable("empId") String empId) throws Exception {
			return es.getEmployee(empId);
		}
		
		@PostMapping("/employees")
		public Boolean saveEmployee(@RequestBody Employee emp) throws Exception {
			return es.save(emp);
		}
		
		@DeleteMapping("/employees/{empId}")
		public Boolean deleteEmployee(@PathVariable("empId") String empId) throws Exception {
			return es.delete(empId);
		}
		
		@PutMapping("/employees")
		public Boolean updateEmployee(@RequestBody Employee emp) throws Exception {
			return es.update(emp);
		}
		
		
	}