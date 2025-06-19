package com.dao;

import java.util.List;

import com.entity.Instructor;

public interface InstructorDAO {
	
	void insertInstructor(Instructor instructor);
	
	int deleteInstructor(int id);
	
	void updateInstructor(Instructor instructor);
	
	List<Instructor> getAllInstructor();

}
