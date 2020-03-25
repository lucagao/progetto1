<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Tech</title>
<link rel="stylesheet" href="css/progetto.css" />
</head>
<body>

<%
	/*String size =request.getParameter("size");
	session.setAttribute("size",size);
	*/

%>

<form action="progetto1dst.jsp" method="get">
	<label for="size">Quante persone vuoi inserire?</label>
	<p></p>
	<input type="number" id="persone" name="size" min="1" max="10" required>
	<p></p>
	<input type="submit" value="invia">
</form>

</body>
</html>