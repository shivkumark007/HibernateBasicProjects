package com.service;

import com.dao.LibraryDAO;
import com.dao.LibraryDAOImpl;
import com.entity.Library;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public Library addLib(Library library) {

		LibraryDAO dao = new LibraryDAOImpl();
		Library lib = dao.insertLib(library);
		return lib;
	}

	@Override
	public void removeLib(int id) {

		LibraryDAO dao = new LibraryDAOImpl();
		dao.deleteLib(id);
	}

	@Override
	public void modifyLib(Library library) {

		LibraryDAO dao = new LibraryDAOImpl();
		dao.updateLib(library);

	}

	@Override
	public Library getLibrary(int id) {

		LibraryDAO dao = new LibraryDAOImpl();
		Library lib = dao.getLibrary(id);
		return lib;
	}

}
