<%@ page import="Model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Student aluno = (Student) request.getAttribute("objStudent"); %>
	Matrícula: <%= aluno.getRegistration() %><br>
	Nome: <%= aluno.getName() %>

</body>
</html>