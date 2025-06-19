package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.utility.HibernateUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void saveEmployee(Employee employee) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(employee);
			
		    System.out.println("Employee data inserted successfully.");

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		session.close();
	}
}
