package com.app;

import com.entity.Library;
import com.service.LibraryService;
import com.service.LibraryServiceImpl;

public class InsertData {
	public static void main(String args[]) {
		
		Library lib = new Library(2, "V.D.Savarkar", 2300);
		LibraryService service = new LibraryServiceImpl();
		
		Library libr = service.addLib(lib);
		if(lib != null) {
			System.out.println("Data Inserted Successfully: ");
		} else {
			System.out.println("Failed to Insert Data: ");
		}
	}
}
