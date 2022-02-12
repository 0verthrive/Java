<%@ page import="Model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta</title>
</head>
<script type="text/javascript">
	function pulaLinha(){
		document.write("<br>");
	}
</script>
<body>
	<% Student aluno = (Student) request.getAttribute("objStudent"); %>
	Matrícula: <%= aluno.getRegistration() %>
	<script>pulaLinha();</script>
	Nome: <%= aluno.getName() %>
	<script>pulaLinha();</script>
	Teste: <%= aluno.getTest() %>
	<script>pulaLinha();</script>
	Prova: <%= aluno.getExam() %>
	<script>pulaLinha();</script>
	Média: <%= aluno.getAverage() %>
</body>
</html>