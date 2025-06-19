package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Library;
import com.utility.HibernateUtility;

public class LibraryDAOImpl implements LibraryDAO {

	@Override
	public int insertBook(Library library) {
		int i = 0;
		try (Session session = HibernateUtility.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();

			session.save(library);
			tx.commit();
			i = 1;
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl insertBook: " + e);
		}
		return i;
	}

	@Override
	public int deleteBook(int id) {
		int i = 0;
		try(Session session = HibernateUtility.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			Library lib = session.get(Library.class, id);
			if(lib != null) {
				session.delete(lib);
				tx.commit();
				i = 1;
			} 
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl deleteBook: " + e);
		}
		return i;
	}

	@Override
	public int updateBook(Library library) {
		int i = 0;
		try(Session session = HibernateUtility.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			Library lib = session.get(Library.class, library.getId());
		    if(lib != null) {
		    	lib.setName(library.getName());
		    	lib.setPrice(library.getPrice());
		    	
		    	session.update(lib);
		    	tx.commit();
		    	i = 1;
		    } 
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl updateBook: " + e);
		}
		return i;
	}

	@Override
	public Library getBookById(int id) {
		int i = 0;
		try(Session session = HibernateUtility.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			Library lib = session.get(Library.class, id);
			return lib;
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl Get Book By Id: " + e);
		}
		return null;
	}

	@Override
	public List<Library> getAllBooks() {
		List<Library> libList = new ArrayList<Library>();
		try(Session session = HibernateUtility.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			Query<Library> query = session.createQuery("from Library", Library.class);
			libList = query.list();
		} catch (Exception e) {
			System.out.println("LibraryDAOImpl Get ALl Books: " + e);
		}			
		return libList;
	}
}
