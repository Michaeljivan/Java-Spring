<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars List - Spring Boot Web Application Example</title>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>
<body>
	<%= new java.util.Date() %>
	<a href="/">Go home</a>
	<h1>Cars list 1</h1>
	<table>
		<tr>
			<th>Model</th>
			<th>Year</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${cars}" var="car">
			<tr>
				<td>${car.model}</td>
				<td>${car.year}</td>
				<td>${car.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>