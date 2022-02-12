<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo3</title>
</head>
<body style="bg: black; text-align: center;">

<%
	String varName = (String) request.getAttribute("Estado");
%>
<h2>Estado escolhido foi: <br> <%out.println(varName); %></h2>

</body>
</html>