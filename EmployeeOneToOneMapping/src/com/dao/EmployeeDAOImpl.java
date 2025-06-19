package com.dao;

import java.util.List;

import org.hibernate.Criteria;
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

		// System.out.println("===============> "+employee.getDepartment());

		try {
			tx = session.beginTransaction();

			session.save(employee);
			tx.commit();

		} catch (Exception e) {
			System.out.println("EmployeeDAOImpl saveEmployee: " + e);
			tx.rollback();
		}
		session.close();

	}

	@Override
	public int deleteEmployee(int id) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee employee = session.get(Employee.class, id);

			if (employee != null) {
				session.delete(employee);
				tx.commit();
				System.out.println("Employee with ID " + id + " deleted successfully: ");
			} else {
				System.out.println("Employee with ID " + id + " not found: ");
			}

		} catch (Exception e) {
			System.out.println("EmployeeDAOImpl deleteEmployee: " + e);
			tx.rollback();
		}
		session.close();
		return id;
	}

	@Override
	public void updateEmployee(Employee employee) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Employee e1=session.get(Employee.class, employee.getId());

			if (e1 != null) 
			{
				e1.setName(employee.getName());
				e1.setSalary(employee.getSalary());
				
				//e1.setDepartment(employee.getDepartment());
				
				session.update(e1);
				tx.commit();
				System.out.println("Updated Successfully");
			} else {
				System.out.println("Employee ID is missing, update failed.");
			}
		} catch (Exception e) {
			System.out.println("EmployeeDAOImpl updateEmployee: " + e);
			if (tx != null) {
				tx.rollback();
			}
		} 
			session.close();
	}

	@Override
	public List<Employee> getAllEmployee() {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		return criteria.list();
	}

	@Override
	public void getEmployeeGetById(int id) {
		
		
	}
}
