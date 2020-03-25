<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Tech</title>
<link rel="stylesheet" href="css/progetto.css" />			<!-- richiamo al css -->
</head>
<body>

<%
	/*String size =request.getParameter("size");
	session.setAttribute("size",size);
	*/

%>


		
<form action="progettodiriserva.jsp" method="get"> <!-- percoso a cui viene inviato il form -->

		<h1>
			<span id="d">D</span>
			<span id="s">S</span>
			<span id="t">T</span>
			<span id="punto">.</span>
		</h1>
	
	<label for="size">Quante persone vuoi inserire?</label>
	<p></p>
	<input type="number" id="persone" name="size" min="1" max="5" required>
	<p></p>
	<input type="submit" value="invia">
</form>

</body>
</html>