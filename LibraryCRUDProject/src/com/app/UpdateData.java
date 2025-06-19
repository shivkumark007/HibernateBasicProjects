package com.app;

import java.util.Scanner;

import com.entity.Library;
import com.service.LibraryService;
import com.service.LibraryServiceImpl;

public class UpdateData {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LibraryService service = new LibraryServiceImpl();

		System.out.println("Enter Id for Update: ");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name For Update: ");
		String name = sc.nextLine();

		System.out.println("Enter Price to Update: ");
		double price = sc.nextDouble();

		Library lib = new Library(id, name, price);
		service.modifyLib(lib);

		sc.close();
	}
}
