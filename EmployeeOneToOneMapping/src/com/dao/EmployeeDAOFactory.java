package com.dao;

public class EmployeeDAOFactory {

	public static EmployeeDAO getEmployeeDAO() {

		return new EmployeeDAOImpl();
	}

}
