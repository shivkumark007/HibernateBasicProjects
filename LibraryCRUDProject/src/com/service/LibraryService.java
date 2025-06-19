package com.service;

import com.entity.Library;

public interface LibraryService {

	Library addLib(Library library);

	void removeLib(int id);

	void modifyLib(Library library);

	Library getLibrary(int id);
}
