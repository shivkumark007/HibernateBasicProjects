package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Hospital;
import com.service.HospitalService;
import com.service.HospitalServiceImpl;

@WebServlet("/ReadPatientServlet")
public class ReadPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReadPatientServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		HospitalService service = new HospitalServiceImpl();
		
		Hospital hos = service.getPatientById(id);
		
		if(hos != null) {
			out.print("<h1>" + "Patient Details: " + "</h1>");
			out.print("<h1> Patient Id: " + hos.getId() + "</h1> <br>");
			out.print("<h1>       Name: " + hos.getId() + "</h1> <br>");
			out.print("<h1>      Email: " + hos.getId() + "</h1> <br>");
			out.print("<h1>       Date: " + hos.getId() + "</h1> <br>");
			out.print("<h1>Doctor Name: " + hos.getId() + "</h1> <br>");
			out.print("<h1>   Symptoms: " + hos.getId() + "</h1> <br>");
		} else {
			out.print("<h1>" + "Patient With Id " + id + " is Not Found in Database: ");
		}
	}
}
