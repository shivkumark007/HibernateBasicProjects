package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.HospitalService;
import com.service.HospitalServiceImpl;

@WebServlet("/DeletePatientServlet")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DeletePatientServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		HospitalService service = new HospitalServiceImpl();
		int i = service.removePatient(id);
		
		if(i > 0) {
			out.print("<h1>" + "Data Deleted Successfully: " + "</h1>");
		} else {
			out.print("<h1>" + "Failed to Delete Data: ");
		}
	}
}
