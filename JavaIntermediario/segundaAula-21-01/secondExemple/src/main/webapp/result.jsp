<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exit</title>
</head>
<body>
	<%
		String varName = (String)request.getAttribute("name");
	%>
	Seja bem-vindo(a) <% out.println(varName); %>! 
</body>
</html>