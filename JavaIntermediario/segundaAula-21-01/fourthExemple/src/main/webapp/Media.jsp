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
	<%
		Student aluno = (Student) request.getAttribute("ObjStudent");	%>
	Nome: <%= aluno.getName()%><br>
	Teste: <%= aluno.getTest()%><br>
	Prova: <%= aluno.getExam()%><br>
	Média: <%= aluno.getMedia() %>

</body>
</html>