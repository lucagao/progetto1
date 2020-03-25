<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dstech view</title>
</head>
<body>

		<p>Ciao vengo dal Server</p>
		
		<%
			String [] student = (String[])request.getAttribute("students");

		%>
		<ul>
			<c:forEach var="student" items="${students}">
			<li>${student}</li>
			</c:forEach>
		</ul>

</body>
</html>