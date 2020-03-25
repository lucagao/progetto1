<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="java.util.ArrayList, java.util.HashMap, theclasses.ShowAnimals"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Show Animals</title>
<link rel="stylesheet" href="Showanimals.css" />
</head>
<body>
	<%
		int size =3; //Integer.parseInt(request.getParameter("size"));
		//pageContext.setAttribute("sizelimit", size);
		
		ArrayList<HashMap<String, String>> animals = new ArrayList<HashMap<String, String>>();
		
		for(int i = 0; i < size; i++) {
			
			animals.add( 
				ShowAnimals.createAnimal(
					ShowAnimals.checkParameterNull(request.getParameter( "animal-"+(i+1)+"-name" )),
					ShowAnimals.checkParameterNull(request.getParameter( "animal-"+(i+1)+"-type" )),
					ShowAnimals.checkParameterNull(request.getParameter( "animal-"+(i+1)+"-age" ))
				)
			);
		}
		
		ShowAnimals sa = new ShowAnimals(animals);
	%>
	
	<form method="get" action="">
  		
  		<c:set var="_size" scope="application" value="3"/>
  		
  		<c:forEach var="counter" begin="1" end="${_size}">
  
	  		<fieldset>
	  		<legend>Animal <c:out value="${counter}"/></legend>
	  		<label for="animal-${counter}-name">Name:</label>
	  		<input id="animal-${counter}-name" type="text" name="animal-${counter}-name">
	  		
	  		<div id="type">
		  		<label for="animal-${counter}-type">Type:</label>
		  		<span>
		  		* Dog
		  		<input id="" type="radio" name="animal-${counter}-type" value="dog">
		  		</span> 
		  		<span>
		  		* Cat
		  		<input id="" type="radio" name="animal-${counter}-type" value="cat">
		  		</span> 
		  		<span>
		  		* Lion
		  		<input id="" type="radio" name="animal-${counter}-type" value="lion"> 
		  		</span>
	  		</div>
	  		
	  		<label for="animal-${counter}-age">Age:</label>
	  		<input id="animal-${counter}-age" type="text" name="animal-${counter}-age">
  			</fieldset>
  		
		</c:forEach>
  		
  		<div class="clear"></div>
  		
  		<input type="submit" value="send">
  	
  	</form>
  	
  	<table>
  		<tr>
  			<th>Name</th>
  			<th>Type</th>
  			<th>Age</th>
  			<th>Roar</th>
  		</tr>
  		<%
  			for(int i = 0; i < sa.getAnimals().size(); i++) {
  		%>
  			<tr>
				<td><%= sa.getAnimal(i).get("name") %></td>
				<td><%= sa.getAnimal(i).get("type") %> <span class="icon icon<%= sa.getAnimal(i).get("type") %>"></span></td>
				<td><%= sa.getAnimal(i).get("age") %></td>
				<td><%= sa.getAnimal(i).get("roar") %></td>
			</tr>
  		<%		
  			}
  		%>
  		
  	</table>

</body>
</html>