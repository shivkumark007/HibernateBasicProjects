package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.CreditCard;
import com.utility.HibernateUtility;

public class CreditCardDAOImpl implements CreditCardDAO{

	@Override
	public void saveCreditCard(CreditCard card) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(card);
		
		tx.commit();
		
		session.close();
		
		System.out.println("Credit Card Data Inserted Successfully: ");
		
	}

	@Override
	public void updateCreditCard(CreditCard card) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
		
		tx = session.beginTransaction();
		
	    CreditCard c = session.get(CreditCard.class, card.getPayId());
	    
	    if(c != null) {
	      	c.setCardNo(card.getCardNo());
	    	c.setCardType(card.getCardType());
	  
	    	
	    	session.update(c);
	    	
	    	tx.commit();
	    		
	    	System.out.println("Credit Card Data Update Successfully: ");
	    }
	} catch (Exception e) {
		System.out.println("Credit Card Data Update Successfully: ");	
		session.close();
	}
	}

	@Override
	public void deleteCreditCard(int id) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session =factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			CreditCard c = session.get(CreditCard.class, id);
			
			if(c != null) {
				session.delete(c);
				tx.commit();
				System.out.println("CreditCard Data Delete Successfully: ");
			}
		} catch (Exception e) {
			System.out.println("CreditCardDAOImpl deleteCard: " + e);
			session.close();
		}
	}

	@Override
	public CreditCard getCreditCardById(int id) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
		//	CreditCard c = (CreditCard) session.load(CreditCard.class, id);
			CreditCard c = session.get(CreditCard.class, id);
			
			if(c != null) {
				return c;
			}
		} catch (Exception e) {
			System.out.println("CreditCardDAOImpl Get Card By Id: " + e);
			session.close();
		}
		return null;
	}

	@Override
	public List<CreditCard> getAllCards() {
		// TODO Auto-generated method stub
		return null;
	}

}
