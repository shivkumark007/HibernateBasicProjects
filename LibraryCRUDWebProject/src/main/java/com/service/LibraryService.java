package com.service;

import java.util.List;

import com.entity.Library;

public interface LibraryService {
	int addBook(Library library);
	
	int deleteBook(int id);
	
	int updateBook(Library library);
	
	Library getBookById(int id);
	
	List<Library> getAllBooks();
}
