<%@ page import="java.util.*,pagina.*,foglio.*" %>  
<%  
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total = (request.getParameter("pag") != null) ? Integer.parseInt(request.getParameter("pag")) : 10; 

if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
List<Emp> list=EmpDao.getRecords(pageid,total);  
  
out.print("<h1>Page No: "+spageid+"</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
for(Emp e:list){  
  out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");  
}  
out.print("</table>");  
%>  
<a href="view.jsp?page=1&pag=<%= total %>">1</a>  
<a href="view.jsp?page=2&pag=<%= total %>">2</a>  
<a href="view.jsp?page=3&pag=<%= total %>">3</a>  
<form action="view.jsp?page=<%= spageid %>" method="post">
<select name="pag">
	<option value=10>10</option>
	<option value=15>15</option> 	
</select>
	<input type="submit" value="invia">
</form>

