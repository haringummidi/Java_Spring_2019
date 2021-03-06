package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.employee.dao.EmployeeDAO;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		String fullName = employeeDAO.getEmployee(1);
		System.out.println("fullName = "+fullName);
	}
}
