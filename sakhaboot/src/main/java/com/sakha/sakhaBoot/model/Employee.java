package com.sakha.sakhaBoot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empId;
	
	int Age;
	String empName;
	
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Age=" + Age + ", empName=" + empName + "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
