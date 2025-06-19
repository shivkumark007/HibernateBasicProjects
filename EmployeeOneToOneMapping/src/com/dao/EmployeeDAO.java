package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDAO {
	
	void saveEmployee(Employee employee);
	
	int deleteEmployee(int id);
	
	void updateEmployee(Employee employee);
	
	void getEmployeeGetById(int id);
	
	List<Employee> getAllEmployee();

}
