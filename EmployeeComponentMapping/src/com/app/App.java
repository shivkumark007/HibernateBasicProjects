package com.app;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOFactory;
import com.entity.Address;
import com.entity.Employee;

public class App {
	public static void main(String args[]) {
		
		Address address = new Address("Baramati", "Pune", 8535);
		Employee employee = new Employee(11, "Ajit Pawar", 302230, address);
		
		employee.setAddress(address);
		
		EmployeeDAOFactory employeeDAOFactory = new EmployeeDAOFactory();
		
		EmployeeDAO  dao = employeeDAOFactory.getEmployeeDAO();
		
		dao.saveEmployee(employee);
		
	}

}
