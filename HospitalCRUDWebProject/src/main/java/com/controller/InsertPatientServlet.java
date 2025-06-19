package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Hospital;
import com.service.HospitalService;
import com.service.HospitalServiceImpl;

@WebServlet("/InsertPatientServlet")
public class InsertPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertPatientServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dateParam = request.getParameter("date");
		String drname = request.getParameter("drname");
		String symptoms = request.getParameter("symptoms");

		Date date = Date.valueOf(dateParam);

		Hospital hospital = new Hospital(id, name, email, date, drname, symptoms);

		HospitalService service = new HospitalServiceImpl();

		int i = service.addPatient(hospital);

		if (i > 0) {
			out.print("<h1>" + "Data Inserted Successfully: " + "</h1>");
		} else {
			out.print("<h1>" + " Failed to Insert Data: " + "</h1>");
		}
	}
}
