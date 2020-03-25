<%@ page import="theclasses.Anijsp"%>
<%@ page import="theclasses.Dog"%>
<%@ page import="theclasses.Cat"%>
<%@ page import="theclasses.Lion"%>
<%@ page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Anics.css" />
</head>
<body>

	<%
			String dname = request.getParameter( "dogname" );
			String dage = request.getParameter( "dogage" );
			String dtype = request.getParameter( "dogtype" );
			int aniage = 0;
	  		
	  		if( dname == null ) dname = "unknown";
	  		if( dage != null ) {
	  			try {
	  				aniage = Integer.parseInt(dage);
	  			} catch(Exception exc) {
	  				
	  			}
	  		}
	  	
	  		String cname = request.getParameter( "catname" );
			String cage = request.getParameter( "catage" );
			String ctype = request.getParameter( "cattype" );
			int ctage = 0;
	  		
	  		if( cname == null ) cname = "unknown";
	  		if( cage != null ) {
	  			try {
	  				aniage = Integer.parseInt(cage);
	  			} catch(Exception exc) {
	  				
	  			}
	  		}
			
	  		String lname = request.getParameter( "lionname" );
			String lage = request.getParameter( "lionage" );
			String ltype = request.getParameter( "liontype" );
			int liage = 0;
	  		
	  		if( lname == null ) lname = "unknown";
	  		if( cage != null ) {
	  			try {
	  				liage = Integer.parseInt(lage);
	  			} catch(Exception exc) {
	  				
	  			}
	  		}
			
	
	%>



 	<form  method="get" action="">
 		
  		<label for="dog-name">Name:</label>
  		<input id="dog-name" type="text" name="dogname">
  		
  		<label for="typed">Type:</label>
  		<select id="type" name="dogtype">
  			<option disabled selected value></option>
  			<option value="dog">Dog</option>
  			<option value="cat">Cat</option>
  			<option value="lion">Lion</option>
  		</select>
  		
  		<label for="dog-age">Age:</label>
  		<input id="dog-age" type="text" name="dogage">
  		
  		<p></p>
  		<label for="cat-name">Name:</label>
  		<input id="cat-name" type="text" name="catname">
  		
  		<label for="type">Type:</label>
  		<select id="type1" name="cattype">
  			<option disabled selected value></option>
  			<option value="dog">Dog</option>
  			<option value="cat">Cat</option>
  			<option value="lion">Lion</option>
  		</select>
  		
  		<label for="cat-age">Age:</label>
  		<input id="cat-age" type="text" name="catage">
  		
  		<p></p>
  		<label for="lion-name">Name:</label>
  		<input id="lion-name" type="text" name="lionname">
  		
  		<label for="type">Type:</label>
  		<select id="type1" name="liontype">
  			<option disabled selected value></option>
  			<option value="dog">Dog</option>
  			<option value="cat">Cat</option>
  			<option value="lion">Lion</option>
  		</select>
  		
  		<label for="lion-age">Age:</label>
  		<input id="lion-age" type="text" name="lionage">
  		
  		<input type="submit" value="send">
  		
  	</form>
  	<p></p>
  	
 	<%
  		Dog ani = new Dog( dname ,aniage ,dtype );
 		Cat ca = new Cat( cname ,ctage ,ctype );
 		Lion leo = new Lion( lname ,liage ,ltype );
  	%>
 	
 	
 	
 	<p></p>
	
	<table style="width:100%">
	 <tr>
	 	<th>Name</th>
	 	<th>Type</th>
	 	<th>Age</th>
	 	<th>Messagge</th>
	 </tr>
	 	<td><%=dname %></td>
	 	<td><%=dtype%></td>
	 	<td><%=dage %></td>
	 	<td><%=ani.roar() %></td>
	</tr>
	 </tr>
	 	<td><%=cname %></td>
	 	<td><%=ctype%></td>
	 	<td><%=cage %></td>
	 	<td></td>
	</tr>
	 </tr>
	 	<td><%=lname %></td>
	 	<td><%=ltype%></td>
	 	<td><%=lage %></td>
	 	<td></td>
	</tr>
	
	</table>

<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
</c:forEach> 


</body>
</html>