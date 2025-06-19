package com.service;

import java.util.List;

import com.dao.LibraryDAO;
import com.dao.LibraryDAOImpl;
import com.entity.Library;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public int addBook(Library library) {

		LibraryDAO dao = new LibraryDAOImpl();
		int i = dao.insertBook(library);
		return i;
	}

	@Override
	public int deleteBook(int id) {

		LibraryDAO dao = new LibraryDAOImpl();
		int i = dao.deleteBook(id);
		return i;
	}

	@Override
	public int updateBook(Library library) {

		LibraryDAO dao = new LibraryDAOImpl();
		int i = dao.updateBook(library);
		return i;
	}

	@Override
	public Library getBookById(int id) {

		LibraryDAO dao = new LibraryDAOImpl();
		Library lib = dao.getBookById(id);
		return lib;
	}

	@Override
	public List<Library> getAllBooks() {

		LibraryDAO dao = new LibraryDAOImpl();
		List<Library> libList = dao.getAllBooks();
		return libList;
	}
}
