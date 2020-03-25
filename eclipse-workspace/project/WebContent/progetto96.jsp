<!DOCTYPE html>
<html lang="it" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="formato.css">
    <title>Progetto96</title>
  </head>
  <body>
  <% String [] x = {"mario","luigi","giovanni"}; %>
  <ul>
  <%  for(String persone : x) { %>
  
  
     <li><%= persone %></li>
  
  
  <%} %>
  </ul>
  ciao
  </body>
  </html>