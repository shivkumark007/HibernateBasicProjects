package com.app;

import java.util.Scanner;

import com.service.LibraryService;
import com.service.LibraryServiceImpl;

public class DeleteData {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book Id to Delete: ");
		int id = sc.nextInt();

		LibraryService service = new LibraryServiceImpl();
		service.removeLib(id);

		sc.close();
	}

}
