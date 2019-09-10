package com.sakha.sakhaBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.ems.model.Employee;
import com.sakha.sakhaBoot.model.*;
import com.sakha.sakhaBoot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService es;
//	EmployeeService service;
//	@PostMapping("/employee")
//	public String saveEmployee(@ModelAttribute Employee emp,Model m) {
//		Employee savedEmp=service.save(emp);
//		m.addAttribute("emp",savedEmp);
//		return "view";		
//	}
//	@PostMapping("/byname")
//	public String byNameEmployee(@RequestParam("empName") String name,Model m) {
//		Employee savedName=service.getByName(name);
//		m.addAttribute("savedName",savedName);
//		return "view";
//	}
//	@GetMapping("/delete")
//	public String dEmployee(@RequestParam("empId") int id, Model m) {
//	    service.deleteEmployee(id);
//		
//		return "view";
//		
//	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return es.getAllEmployee();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable("empId")String empId)
	{
		return es.getEmployee(empId);
	}
	@PostMapping("/employees")
	public com.sakha.sakhaBoot.model.Employee saveEmployee(@RequestBody Employee emp){
		return es.save(emp);
	}
	@DeleteMapping("/employees/{empId}")
	public Boolean deleteEmployee(@PathVariable("empId") String empId) throws Exception {
		return es.delete(empId);
	}
	
	@PutMapping("/employees")
	public Boolean updateEmployee(@RequestBody Employee emp) {
		return es.Update(emp);
	}
		
	
	}
	

