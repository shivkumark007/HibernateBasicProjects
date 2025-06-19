package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Course;
import com.utility.HibernateUtility;

public class CourseDAOImpl implements CourseDAO{

	@Override
	public void insertCourse(Course course) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			session.save(course);
			tx.commit();
			System.out.println("Course Data Inserted Successfully: ");
		} catch (Exception e) {
			System.out.println("CourseDAOImpl insertCourse: " + e);
			tx.rollback();
		}
		session.close();
	}

	@Override
	public int deleteCourse(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
