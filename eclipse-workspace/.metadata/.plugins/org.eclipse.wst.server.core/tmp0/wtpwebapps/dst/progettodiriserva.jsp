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
		
		int persone = Integer.parseInt(request.getParameter("size"));  // richiamo valore della form
		String per = persone+"";										// conversione in stringa per inviare il valore alla tabella
		session.setAttribute("persone",per);
		pageContext.setAttribute("np",persone);							// permette di passare il valore alla fieldset
		

	%>
	
		<form method="get" action="tabellariserva.jsp">					<!-- percoso invio valori -->
  		
  		<c:forEach var="counter" begin="1" end="${np}">
  
	  		<fieldset>
	  		<legend>Lavoratore <c:out value="${counter}"/></legend>
	  		<label for="lavoratore-${counter}-nome">Nome:</label>															<!-- for con name(input) uguali per permettere l'aggancio -->
	  		<input id="lavoratore-${counter}-nome" type="text" name="lavoratore-${counter}-nome" required>
	  		<label for="lavoratore-${counter}-cognome">Cognome:</label>
	  		<input id="lavoratore-${counter}-cognome" type="text" name="lavoratore-${counter}-cognome" required>				<!-- required indica che è obbligatorio -->
	  		<label for="lavoratore-${counter}-eta">Età:</label>
	  		<input id="lavoratore-${counter}-eta" type="number" name="lavoratore-${counter}-eta" required>
	  		
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
	  		<input id="lavoratore-${counter}-assenze" type="number" name="lavoratore-${counter}-assenze">
	  		<label for="lavoratore-${counter}-presenze">Presenze:</label>
	  		<input id="lavoratore-${counter}-presenze" type="number" name="lavoratore-${counter}-presenze">
	  		
	  		<div id="work">
  				  <label for="lavoratore-${counter}-attivita">Front-end</label>
  				  <input type="checkbox"  name="lavoratore-${counter}-attivita"value="Front-end">
  				  <label for="lavoratore-${counter}-attivita">Back-end</label>
  				  <input type="checkbox"  name="lavoratore-${counter}-attivita" value="Back-end">
			</div>	
  			</fieldset>
  		
		</c:forEach>
  		
  		<div class="clear"></div>
  		
  		<input type="submit" value="invia">
  	
  	</form>
	
</body>
</html>