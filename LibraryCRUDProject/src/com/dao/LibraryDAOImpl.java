package com.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Library;
import com.utility.HibernateUtility;

public class LibraryDAOImpl implements LibraryDAO{

	@Override
	public Library insertLib(Library library) {
		
		try(SessionFactory factory = HibernateUtility.getSessionFactory(); Session session = factory.openSession()) {
			Transaction tx = null;
			
			try {
				tx = session.beginTransaction();
				session.save(library);
				tx.commit();
				return library;
			} catch (Exception e) {
				if(library != null) {
					System.out.println("Data Successfully Added: ");
				} else {
					System.out.println("Failed to Add Data: ");
				}
			}
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl insertLib: " + e);
		}
		return null;
	}

	@Override
	public void deleteLib(int id) {
		
		try(SessionFactory factory = HibernateUtility.getSessionFactory(); Session session = factory.openSession()) {
			
			Transaction tx = session.beginTransaction();
			Library lib = session.get(Library.class, id);
			if(lib != null) {
				session.delete(lib);
				tx.commit();
				System.out.println("Data Deleted Successfully: ");
			} else {
				System.out.println("Data with Id Not Found in Database: ");
			}
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl deleteLib: " + e);
		}
	}

	@Override
	public void updateLib(Library library) {
		
		try(SessionFactory factory = HibernateUtility.getSessionFactory(); Session session = factory.openSession()) {
			 Transaction tx = session.beginTransaction();
			 Library lib = session.get(Library.class, library.getId());
			 
			 if(lib != null) {
				 lib.setName(library.getName());
				 lib.setPrice(library.getPrice());
				 
				 session.update(lib);
				 tx.commit();
				 System.out.println("Data Updated Successfully: ");
			 } else {
				 System.out.println("Failed to Update Data: ");
			 }
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl updateLibrary: " + e);
		}
	}

	@Override
	public Library getLibrary(int id) {
		
		try(SessionFactory factory = HibernateUtility.getSessionFactory(); Session session = factory.openSession()) {
			
			Library lib = (Library) session.load(Library.class, id);
			if(lib != null) {
				return lib;
			}
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl Get Library: " + e);
		}
		return null;
	}
}
