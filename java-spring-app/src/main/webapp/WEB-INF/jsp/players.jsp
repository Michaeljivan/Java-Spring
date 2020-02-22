<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Players List - Spring Boot Web Application Example</title>
</head>
<body>
	<a href="/">Go home</a>
	<h1>Team 1</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>Position</th>
			<th>Country</th>
		</tr>
		<c:forEach items="${players}" var="player">
			<tr>
				<td>${player.name}</td>
				<td>${player.position}</td>
				<td>${player.country}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>