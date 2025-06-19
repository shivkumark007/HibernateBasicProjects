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

@WebServlet("/ReadBookServlet")
public class ReadBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ReadBookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
	//	String name = request.getParameter("name");
	//	double price = Double.parseDouble(request.getParameter("price"));
		
		LibraryService service = new LibraryServiceImpl();
		
		Library lib = service.getBookById(id);
		
		if (lib != null) {
			out.print("<h1>" + "Book Details: " + "</h1> <br>");
			out.print("<h1>" + lib.getId() + "</h1> <br>");
			out.print("<h1>" + lib.getName() + "</h1> <br>");
			out.print("<h1>" + lib.getPrice() + "</h1> <br>");
			
		} else {
			out.print("<h1>" + "Data is not Found in Database: " + "</h1>");
		}
	}

}
