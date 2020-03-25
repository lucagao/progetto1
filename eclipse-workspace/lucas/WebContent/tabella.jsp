<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList, java.io.FileWriter, java.io.IOException , java.util.HashMap, dst.Dipendenti"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabella Dipendenti</title>
<link rel="stylesheet" href="css/tabella.css" />
</head>
<body>
	
	<%
		String perso =(String)(session.getAttribute("persone"));
		int persone = Integer.parseInt(perso);
	
	
		ArrayList<HashMap<String, String>> lavoratori = new ArrayList<HashMap<String, String>>();
	

	
		for(int i = 0; i < persone; i++) {
   		lavoratori.add( 
		Dipendenti.createLavoratori(
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-nome" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-cognome" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-eta" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-sesso" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-nazione" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+i)+"-assenze" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-presenze" )),
			Dipendenti.verifica(request.getParameter( "lavoratore-"+(i+1)+"-attivita" ))
									)
					);
		}

			Dipendenti employe = new Dipendenti(lavoratori);

	
	
	%>
	

	<table>
  		<tr>
  			<th>Nome</th>
  			<th>Cognome</th>
  			<th>Età</th>
  			<th>Sesso</th>
  			<th>Nazione</th>
  			<th>Assenze</th>
  			<th>Presenze</th>
  			<th>Attività</th>
  		</tr>
  		<%
  			for(int i = 0; i < employe.getLavoratori().size(); i++) {
  		%>
  			<tr>
				<td><%= employe.getLavoro(i).get("nome") %></td>
				<td><%= employe.getLavoro(i).get("cognome") %></td>
				<td><%= employe.getLavoro(i).get("eta") %></td>
				<td><%= employe.getLavoro(i).get("sesso") %></td>
				<td><%= employe.getLavoro(i).get("nazione") %></td>
				<td><%= employe.getLavoro(i).get("assenze") %></td>
				<td><%= employe.getLavoro(i).get("presenze") %></td>
				<td><%= employe.getLavoro(i).get("attivita") %></td>
			</tr>
  		<%		
  			}
  		%>
  		
  	</table>
	
		<%
		   try {
				FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\lucas\\WebContent\\txt\\dstfile.txt");
				for(int i = 0; i < employe.getLavoratori().size(); i++) {
					String spattern = "Nome:%s - Cognome:%s - Età:%s - Sesso:%s - Nazione:%s - Assenze:%s - Presenze:%s - Attività:%s\n";
						writer.write(String.format(spattern, employe.getLavoro(i).get("nome"),
										employe.getLavoro(i).get("cognome"), employe.getLavoro(i).get("eta"),
										employe.getLavoro(i).get("sesso"), employe.getLavoro(i).get("nazione"),
										employe.getLavoro(i).get("assenze"), employe.getLavoro(i).get("presenze"),employe.getLavoro(i).get("attivita")));				
				}
				writer.close();
			} catch (IOException e) {
				System.out.println("Errore scrittura.");
				e.printStackTrace(); 
			}		 
	
		
		
		%>


</body>
</html>