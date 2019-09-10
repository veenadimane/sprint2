package com.sakha.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class EmployeeAspect {
	
	@Before("execution(* com.sakha.ems.EmployeeService.deleteEmployee(..))")
	public void showDeleting() {
		System.out.println("deleting....");
	}
	
	

}


