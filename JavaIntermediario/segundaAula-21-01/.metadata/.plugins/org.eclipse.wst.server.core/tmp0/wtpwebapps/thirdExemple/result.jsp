<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>exemplo3</title>
</head>
<body>
	<%
		String nameState = (String)request.getAttribute("state");
	%>
	<h1>Uauuu, <% out.println(nameState); %>!!<br>Deve ser muito divertido viver por a?</h1> 
</body>
</html>