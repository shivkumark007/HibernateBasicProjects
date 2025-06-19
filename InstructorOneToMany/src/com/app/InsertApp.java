package com.app;

import com.dao.CourseDAO;
import com.dao.CourseDAOImpl;
import com.dao.InstructorDAO;
import com.dao.InstructorDAOFactory;
import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetails;

public class InsertApp {
	
	public static void main(String[] args) {
		
		InstructorDAOFactory instf = new InstructorDAOFactory();
		InstructorDAO dao = instf.getInstructorDAO();

		Instructor instructor = new Instructor();
		instructor.setFname("Sharad");
		instructor.setLname("Pawar");
		instructor.setEmail("sp@gmail.com");

		InstructorDetails indet = new InstructorDetails();
		indet.setChannel("Quantom Mechanic");
		indet.setHobby("Painting");

		instructor.setInstructorDetails(indet);

		dao.insertInstructor(instructor);

		CourseDAO cdao = new CourseDAOImpl();

		Course course1 = new Course();
		course1.setTitle("BA.Quantom Mechanic");
		course1.setInstructor(instructor);

		Course course2 = new Course();
		course2.setTitle("MA.Quantom Mechanic");
		course2.setInstructor(instructor);

		Course course3 = new Course();
		course3.setTitle("PHD In Quantom Mechanic");
		course3.setInstructor(instructor);

		instructor.getCourses().add(course1);
		instructor.getCourses().add(course2);
		instructor.getCourses().add(course3);

		cdao.insertCourse(course1);
		cdao.insertCourse(course2);
		cdao.insertCourse(course3);

		System.out.println("Inserted Operation Completed");
	}
}
