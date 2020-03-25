<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benvenuti in New Tech</title>
<link rel="stylesheet" href="css/progetto1.css" />
</head>
<body>



	<%
		
		int persone = Integer.parseInt(request.getParameter("size"));
		String per = persone+"";
		session.setAttribute("persone",per);
		pageContext.setAttribute("np",persone);

	%>
	
		<form method="get" action="tabella.jsp">
  		
  		<c:set var="_size" />
  		
  		<c:forEach var="counter" begin="1" end="${np}">
  
	  		<fieldset>
	  		<legend>Lavoratore <c:out value="${counter}"/></legend>
	  		<label for="lavoratore-${counter}-nome">Nome:</label>
	  		<input id="lavoratore-${counter}-nome" type="text" name="lavoratore-${counter}-nome">
	  		<label for="lavoratore-${counter}-cognome">Cognome:</label>
	  		<input id="lavoratore-${counter}-cognome" type="text" name="lavoratore-${counter}-cognome">
	  		<label for="lavoratore-${counter}-eta">Età:</label>
	  		<input id="lavoratore-${counter}-eta" type="text" name="lavoratore-${counter}-eta">
	  		
	  		<div id="gender">
		  		<label for="lavoratore-${counter}-sesso">Sesso:</label>
		  		<select name="lavoratore-${counter}-sesso">
					<option selected disabled></option>
					<option value="maschio">Maschio</option>
					<option value="femmina">Femmina</option>
				</select>
	  		</div>
	  		
	  		<label for="lavoratore-${counter}-nazione">Nazione:</label>
	  		<input id="lavoratore-${counter}-nazione" type="text" name="lavoratore-${counter}-nazione">
	  		<label for="lavoratore-${counter}-assenze">Assenze:</label>
	  		<input id="lavoratore-${counter}-assenze" type="text" name="lavoratore-${counter}-assenze">
	  		<label for="lavoratore-${counter}-presenze">Presenze:</label>
	  		<input id="lavoratore-${counter}-presenze" type="text" name="lavoratore-${counter}-presenze">
	  		
	  		<div id="work">
			 <label for="lavoratore-${counter}-attivita">Attività: </label>
				<select class="lavoro" name="lavoratore-${counter}-attivita">
					<option selected disabled></option>
					<option value="subordinato">Subordinato</option>
					<option value="autonomo">Autonomo</option>
					<option value="collaboratore">Collaboratore</option>
					<option value="stagista">Stagista</option>
				</select>
			</div>	
  			</fieldset>
  		
		</c:forEach>
  		
  		<div class="clear"></div>
  		
  		<input type="submit" value="send">
  	
  	</form>
	
</body>
</html>