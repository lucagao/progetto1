<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JspExample Demo Date</title>
</head>
<% SimpleDateFormat sdf= new SimpleDateFormat(" MM/dd/yyyy/  hh:mm:ss"); %>
<body>
<h1> Welcome to Tomcat!  Today is <%= sdf.format(new Date()) %></h1>
</body>
</html>