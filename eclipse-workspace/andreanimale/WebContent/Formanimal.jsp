<%@ page import="java.util.ArrayList" %>
<%@ page import="animal.Animal" %>
<%@ page import="animal.Dog" %>
<%@ page import="animal.Cat" %>
<%@ page import="animal.Lion" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form animal</title>
<link rel="stylesheet" href="css/animal.css">
</head>
<body>
	<%
		String a1_name = request.getParameter("a1_name");
		String a1_type = request.getParameter("a1_type");
		String a1_age = request.getParameter("a1_age");
		if( a1_name == null ) a1_name = "unknown";
		if( a1_type == null ) a1_type = "unknown";		
		int _a1age = 0;
		if( a1_age != null ) {
			try {
				_a1age = Integer.parseInt(a1_age);
			} catch(Exception exc){
				
			}
		}
		
		String a2_name = request.getParameter("a2_name");
		String a2_type = request.getParameter("a2_type");
		String a2_age = request.getParameter("a2_age");
		if( a2_name == null ) a2_name = "unknown";
		if( a2_type == null ) a2_type = "unknown";			
		int _a2age = 0;
		if( a2_age != null ) {
			try {
				_a2age = Integer.parseInt(a2_age);
			} catch(Exception exc){
				
			}
		}		
		
		String a3_name = request.getParameter("a3_name");
		String a3_type = request.getParameter("a3_type");
		String a3_age = request.getParameter("a3_age");
		if( a3_name == null ) a3_name = "unknown";
		if( a3_type == null ) a3_type = "unknown";			
		int _a3age = 0;
		if( a2_age != null ) {
			try {
				_a3age = Integer.parseInt(a3_age);
			} catch(Exception exc){
				
			}
		}			
		//String[] types = new String[] {a1_type, a2_type, a3_type };
		ArrayList<Animal> animals = new ArrayList<Animal>();		
		
		
		
		
		switch(a1_type){
			case "cat":
				Cat c = new Cat(a1_name, a1_type, _a1age);
				animals.add(c);
			break;
			case "dog":
				Dog d = new Dog(a1_name, a1_type, _a1age);
				animals.add(d);
			break;
			case "lion":
				Lion l = new Lion(a1_name, a1_type, _a1age);
				animals.add(l);				
			break;
		}
	
		switch(a2_type){
			case "cat":
				Cat c = new Cat(a2_name, a2_type, _a2age);
				animals.add(c);
			break;
			case "dog":
				Dog d = new Dog(a2_name, a2_type, _a2age);
				animals.add(d);
			break;
			case "lion":
				Lion l = new Lion(a2_name, a2_type, _a2age);
				animals.add(l);				
			break;
		}
		
		switch(a3_type){
		case "cat":
			Cat c = new Cat(a3_name, a3_type, _a3age);
			animals.add(c);
		break;
		case "dog":
			Dog d = new Dog(a3_name, a3_type, _a3age);
			animals.add(d);
		break;
		case "lion":
			Lion l = new Lion(a3_name, a3_type, _a3age);
			animals.add(l);				
		break;
		}
		
	%>		
	<div id="container-form">
		<form method="get" action="">
			
					<fieldset>
						<legend>Animal 1</legend>
						<div class="item">
							<label for="animal1-name">Name: </label>
							<input id="animal-name" type="text" name="a1_name">				
						</div>
						
						<div class="item">
						<label for="animal1-name">Type: </label>
							<select class="animal-type" name="a1_type">
								<option value="dog">Dog</option>
								<option value="cat">Cat</option>
								<option value="lion">Lion</option>
							</select>				
						</div>
						
						<div class="item">
							<label for="animal1-age">Age</label>
							<input id="animal-age" type="text" name="a1_age">
						</div>			
					</fieldset>
					
					<fieldset>
						<legend>Animal 2</legend>
						<div class="item">
							<label for="animal2-name">Name: </label>
							<input id="animal-name" type="text" name="a2_name">
						</div>
						<div class="item">
							<label for="animal2-name">Type: </label>
							<select class="animal-type" name="a2_type">
								<option value="dog">Dog</option>
								<option value="cat">Cat</option>
								<option value="lion">Lion</option>
							</select>
						</div>
						<div class="item">
							<label for="animal2-age">Age</label>
							<input id="animal-age" type="text" name="a2_age">
						</div>			
					</fieldset>
		
			
					<fieldset>
						<legend>Animal 3</legend>
					
						<div class="item">
							<label for="animal3-name">Name: </label>
							<input id="animal-name" type="text" name="a3_name">
						</div>
						<div class="item">
							<label for="animal3-type">Type: </label>
							<select class="animal-type" name="a3_type">
								<option value="dog">Dog</option>
								<option value="cat">Cat</option>
								<option value="lion">Lion</option>
							</select>
						</div>							
						<div class="item">
							<label for="animal3-age">Age</label>
							<input id="animal-age" type="text" name="a3_age">
						</div>			
					</fieldset>			
					<input type="submit" class="submit" value="send">								
			</form>
	
	</div>	
		
	<h1 class="section-title">Tabella risultati</h1>
	<table id="table">
		<tr>
			<th>Name</th>
			<th>Type</th>
			<th>Age</th>
			<th>Msg</th>
		</tr>
		<% 
			for(int i = 0; i < animals.size(); i++){
				%>
					<tr>
						<%
							out.println("<td>" + animals.get(i).getName() + "</td>");
							out.println("<td>" + animals.get(i).getType() + "</td>");
							out.println("<td>" + animals.get(i).getAge() + "</td>");
							out.println("<td>" + animals.get(i).roar() + "</td>");
						%>
					</tr>
				<%
				
			}
		%>

	</table>
</body>
</html>