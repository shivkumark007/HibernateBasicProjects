<%@page import="com.service.LibraryService"%>
<%@page import="com.service.LibraryServiceImpl"%>
<%@page import="com.entity.Library"%>
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
	double price = Double.parseDouble(request.getParameter("price"));

	Library lib = new Library(id, name, price);
	LibraryService service = new LibraryServiceImpl();
	int i = service.updateBook(lib);

	if (i > 0) {
		out.print("<h1>" + "Data Updated Successfully: " + "</h1>");
	} else {
		out.print("<h1>" + "Failed to Update Data: " + "</h1>");
	}
	%>


	<jsp:include page="read.jsp"></jsp:include>
</body>
</html>