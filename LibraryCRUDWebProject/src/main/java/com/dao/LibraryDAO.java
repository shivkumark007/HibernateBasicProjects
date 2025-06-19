package com.dao;

import java.util.List;

import com.entity.Library;

public interface LibraryDAO {
	int insertBook(Library library);
	
	int deleteBook(int id);
	
	int updateBook(Library library);
	
	Library getBookById(int id);
	
	List<Library> getAllBooks();

}
