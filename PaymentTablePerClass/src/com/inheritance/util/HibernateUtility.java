package com.inheritance.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	private static SessionFactory factory;
	
	public synchronized static SessionFactory getSessionFactory() {
		
		if(factory == null) {
		       return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;	
	}
}
