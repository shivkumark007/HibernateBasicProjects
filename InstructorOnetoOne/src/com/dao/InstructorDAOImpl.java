package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Instructor;
import com.utility.HibernateUtility;

public class InstructorDAOImpl implements InstructorDAO{

	@Override
	public void saveInstructor(Instructor instructor) {		
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			session.save(instructor);
			tx.commit();
			System.out.println("Instructor Data Inserted Successfully: ");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("InstructorDAOImpl saveInstructor: " + e);
		}
		session.close();
	}
}
	
