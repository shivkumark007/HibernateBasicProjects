package com.dao;

public class InstructorDAOFactory {
	
	public InstructorDAO getInstructorDAO() {
		
		return new InstructorDAOImpl();
	}
}
