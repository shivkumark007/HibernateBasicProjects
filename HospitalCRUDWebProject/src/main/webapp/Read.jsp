<%@page import="java.util.List"%>
<%@page import="com.entity.Hospital"%>
<%@page import="com.service.HospitalService"%>
<%@page import="com.service.HospitalServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%

HospitalService service = new HospitalServiceImpl();
List<Hospital> list = service.getAllPatients();
request.setAttribute("list", list);

%>

	<table border="1">
		<tr>

			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Date</th>
			<th>Drname</th>
			<th>Symptoms</th>
		</tr>

		<c:forEach var="hospital" items="${requestScope.list}">
			<!-- <tr style="background-color: ${task.status == 'Completed' ? '#d4edda' : '#f8d7da'}"> -->
			<td>${hospital.id}</td>
			<td>${hospital.name}</td>
			<td>${hospital.email}</td>
			<td>${hospital.date}</td>
			<td>${hospital.drname}</td>
			<td>${hospital.symptoms}</td>

			</tr>
		</c:forEach>





	</table>

</body>
</html>