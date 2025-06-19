package com.inheritance.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;
import com.inheritance.entity.Payment;
import com.inheritance.util.HibernateUtility;

public class PaymentDAOImpl implements PaymentDAO {

	@Override
	public void saveCard(CreditCard card) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(card);

		tx.commit();

		session.close();
		System.out.println("Credit Card Transaction Added Succes ! ! !");

	}

	@Override
	public void saveCheque(Cheque cheque) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(cheque);

		tx.commit();

		session.close();
		System.out.println("cheque  Transaction Added Succes ! ! !");

	}

	@Override
	public List<Payment> getAllCredit() {
		List<Payment> pList = new ArrayList<Payment>();
		try {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		
		String hql = "From Payment Where PMODE = 'CC";
		
		Query<Payment> query = session.createQuery(hql, Payment.class);
		
		pList  = query.list();
		
		} catch (Exception e) {
			System.out.println("PaymentDAOImpl Get All Credit: " + e);
		}
		return pList;
	}

	@Override
	public List<Payment> getAllCheque() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getOnlyCardType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getMultipleCol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllCreditt() {
		List<Payment> pList = new ArrayList<Payment>();
		try {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		
		
		
		  Criteria criteria=session.createCriteria(Payment.class);

		  List list=criteria.list();

		
		} catch (Exception e) {
			System.out.println("PaymentDAOImpl Get All Credit: " + e);
		}
		return pList;
	}


}
