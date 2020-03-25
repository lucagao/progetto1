<%@ page import="java.util.ArrayList"%>
<%@ page import="theclasses.DSTStudent"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>View 3</title>
    <link rel="stylesheet" href="css/style-view2.css" />
  </head>
  <body>
  
  	<%
  		String name = request.getParameter( "name" );
  		String lastname = request.getParameter( "lastname" );
  		String age = request.getParameter( "age" );
  		int _age = 0;
  		
  		if( name == null ) name = "unknown";
  		if( lastname == null ) lastname = "unknown";
  		if( age != null ) {
  			try {
  				_age = Integer.parseInt(age);
  			} catch(Exception exc) {
  				
  			}
  		}
  	%>
  
  	<form method="get" action="">
  	
  		<label for="student-name">Name:</label>
  		<input id="student-name" type="text" name="name">
  		
  		<label for="student-lastname">Lastname:</label>
  		<input id="student-lastname" type="text" name="lastname">
  		
  		<label for="student-age">Age:</label>
  		<input id="student-age" type="text" name="age">
  		
  		<input type="submit" value="send">
  	
  	</form>
  	
  	<%
  		DSTStudent s1 = new DSTStudent(name, lastname, _age); 
  		out.println( s1 );
  	%>
  
  </body>
  </html>