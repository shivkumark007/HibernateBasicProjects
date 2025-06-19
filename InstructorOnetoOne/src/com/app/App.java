package com.app;

import com.dao.InstructorDAO;
import com.dao.InstructorDAOFactory;
import com.entity.Instructor;
import com.entity.InstructorDetail;

public class App {
	public static void main(String args[]) {
		
		Instructor instructor = new Instructor();
		instructor.setEmail("sp@gmail.com");
		instructor.setFname("Sharad");
		instructor.setLname("Pawar");
		
		InstructorDetail instDetails = new InstructorDetail();
		instDetails.setChannel("maharashtraLive");
		instDetails.setHobby("Polytecian");
		
		instructor.setInstructorDetails(instDetails);
		
		InstructorDAOFactory instdao = new InstructorDAOFactory();
		
		InstructorDAO dao = instdao.getInstructorDAO();
		
		dao.saveInstructor(instructor);
		
		System.out.println("Data Saved in the Databnase: ");
	
	}

}
