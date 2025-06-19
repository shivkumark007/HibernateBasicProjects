package com.inheritance.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;
import com.inheritance.utility.HibernateUtility;

public class PaymentDAOImpl implements PaymentDAO {

	@Override
	public void saveCreditCard(CreditCard card) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(card);

		tx.commit();

		session.close();

		System.out.println("Card Details Added Successfully: ");
	}

	@Override
	public void saveCheque(Cheque cheque) {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(cheque);

		tx.commit();

		session.close();

		System.out.println("Cheque Data Added Successfully: ");
	}
}
