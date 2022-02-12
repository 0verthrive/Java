<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ex4</title>
</head>
<body style="background: black; text-align: center; color: white;">

<%
	String varName = (String) request.getAttribute("Titulo");
%>
<h2><%out.println(varName); %></h2>

</body>
</html>