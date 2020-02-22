<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Houses List - Spring Boot Web Application Example</title>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>
<body>
	<%= new java.util.Date() %>
	<a href="/">Go home</a>
	<h1>House list 1</h1>
	<table>
		<tr>
			<th>Square Feet</th>
			<th>Price</th>
			<th>State</th>
		</tr>
		<!-- For each to display data -->
		<c:forEach items="${houses}" var="house">
			<tr>
				<td>${house.squareft}</td>
				<td>${house.price}</td>
				<td>${house.state}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>