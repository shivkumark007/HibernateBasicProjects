<%@page import="com.service.HospitalServiceImpl"%>
<%@page import="com.service.HospitalService"%>
<%@page import="com.entity.Hospital"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String email = request.getParameter("email");

	String dateParam = request.getParameter("date");
	Date date = Date.valueOf(dateParam);

	String drname = request.getParameter("drname");
	String symptoms = request.getParameter("symptoms");

	Hospital hos = new Hospital(id, name, email, date, drname, symptoms);

	HospitalService service = new HospitalServiceImpl();
	int i = service.modifyPatient(hos);
	if (i > 0) {
		out.print("<h1>" + "Data Updated Successfully: " + "</h1>");
	} else {
		out.print("<h1>" + "Failed to Update Data: " + "</h1>");
	}
	%>

	<jsp:include page="Read.jsp"></jsp:include>
</body>
</html>