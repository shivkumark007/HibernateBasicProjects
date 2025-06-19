<%@page import="java.util.List"%>
<%@page import="com.entity.Library"%>
<%@page import="com.service.LibraryService"%>
<%@page import="com.service.LibraryServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Book List</title>
</head>
<body>

	<h2>Library Books</h2>

	<%  
        LibraryService service = new LibraryServiceImpl();
        List<Library> libList = service.getAllBooks();
        request.setAttribute("list", libList);
    %>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>

		<c:forEach var="library" items="${list}">
			<tr>
				<!-- Each book entry should be wrapped in a <tr> -->
				<td>${library.id}</td>
				<td>${library.name}</td>
				<td>${library.price}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
