package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Library;
import com.service.LibraryService;
import com.service.LibraryServiceImpl;

@WebServlet("/InsertBookServlet")
public class InsertBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertBookServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));

		Library lib = new Library(id, name, price);
		LibraryService service = new LibraryServiceImpl();

		int i = service.addBook(lib);
		if (i > 0) {
			out.print("<h1>" + "Data Inserted Successfully: " + "</h1>");
		} else {
			out.print("<h1>" + "Failed to Insert Data: " + "</h1>");
		}
	}
}
