package com.dao;

import com.entity.Library;

public interface LibraryDAO {
	
	Library insertLib(Library library);
	
	void deleteLib(int id);
	
	void updateLib(Library library);
	
	Library getLibrary(int id);

}
