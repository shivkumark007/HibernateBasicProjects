package com.app;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOFactory;
import com.entity.Department;
import com.entity.Employee;

public class App {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Ajit Pawar");
		employee.setSalary(238549);

		Department dept = new Department();
		dept.setName("Finance");

		//System.out.println("--->  "+dept);
		employee.setDepartment(dept);

		EmployeeDAOFactory empf = new EmployeeDAOFactory();

		EmployeeDAO dao = empf.getEmployeeDAO();

		dao.saveEmployee(employee);

		System.out.println("Employee Data Inserted Successfully:");

	}
}