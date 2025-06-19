package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Instructor;
import com.utility.HibernateUtility;

public class InstructorDAOImpl implements InstructorDAO{

	@Override
	public void insertInstructor(Instructor instructor) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			session.save(instructor);
			tx.commit();
			System.out.println("Data Inserted Successfully: ");
		} catch (Exception e) {
			System.out.println("InstructorDAOImpl insertInstructor: " + e);
			tx.rollback();
		}
		session.close();
	}

	@Override
	public int deleteInstructor(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Instructor> getAllInstructor() {
		// TODO Auto-generated method stub
		return null;
	}

}
