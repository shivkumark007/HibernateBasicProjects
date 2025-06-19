package com.dao;

import java.util.List;

import com.entity.Course;

public interface CourseDAO {
	
	void insertCourse(Course course);
	
	int deleteCourse(int id);
	
	void updateCourse(Course course);
	
	List<Course> getAllCourse();	

}
