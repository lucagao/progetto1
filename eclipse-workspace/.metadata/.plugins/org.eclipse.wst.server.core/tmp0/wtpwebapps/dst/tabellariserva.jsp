<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList,java.util.Collections,java.util.Comparator, java.io.FileWriter, java.io.IOException , java.util.HashMap,dst.Comparazione, dst.Reparto"%>
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
		String perso =(String)(session.getAttribute("persone"));     // richiamo numero di valori
		int persone = Integer.parseInt(perso);					     // lo trasformo in int per usarlo nel ciclo

	
		ArrayList<HashMap<String, String>> lavoratori = new ArrayList<HashMap<String, String>>(); // richiamo arraylist
	
		
	
		for(int i = 0; i < persone; i++) {     // inserisco i valori della fielset nell'arraylist
		String[] x = request.getParameterValues("lavoratore-"+(i+1)+"-attivita") == null ? new String[]{"sconosciuto"} : (String[]) request.getParameterValues("lavoratore-"+(i+1)+"-attivita" );
   		lavoratori.add( 
		Reparto.createReparto(
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-nome" )),   // uso metodo verifica nel caso ci siano valori null
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-cognome" )),
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-eta" )),
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-sesso" )),
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-nazione" )),
			Reparto.ritorno(request.getParameter( "lavoratore-"+(i+i)+"-presenze" )),
			Reparto.verifica(request.getParameter( "lavoratore-"+(i+1)+"-assenze" )),
			Reparto.controllo(x)
				)
			);
		}
			
			Reparto employe = new Reparto(lavoratori); // instanzio la classe per usare le proprieta della classe che si aspetta un arraylist di hashmap
			Collections.sort(lavoratori,new Comparazione());
	
	%>
	
	<div class="context">
	<h1>Tabella Dipendenti</h1>
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
  			for(int i = 0; i < employe.getLavoratori().size(); i++) {   // ciclo l'arraylist
  		%>
  			<tr>
				<td><%= employe.getLavoro(i).get("nome") %></td>        <!-- prendo i vari valori che hanno appartengono alla chiave hashmap -->
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
	</div>	
		<%
		   try {
				FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\lucas\\WebContent\\txt\\dstfile.txt");  // percorso file
				for(int i = 0; i < employe.getLavoratori().size(); i++) {     // ciclo arraylist
					String composizione = " Nome:%s \n Cognome:%s \n Età:%s \n Sesso:%s \n Nazione:%s \n Assenze:%s \n Presenze:%s \n Attività:%s\n ---------------------------------------- \n";
						writer.write(String.format(composizione, employe.getLavoro(i).get("nome"),
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

         <div class="area" >
            <ul class="circles">
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
            </ul>
          </div >
		

</body>
</html>