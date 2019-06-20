<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.io.*"%>
 <!DOCTYPE html>
<html>
<head>
</head>
<body>

	<h1>welcome</h1>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Code</th>
			<th>Designation</th>
		</tr>
		<tr>
			<c:forEach var="obj" items="${objects1}">
				<td>${obj.name}</td>
				<td>${obj.code}</td>
				<td>${obj.desg}</td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>