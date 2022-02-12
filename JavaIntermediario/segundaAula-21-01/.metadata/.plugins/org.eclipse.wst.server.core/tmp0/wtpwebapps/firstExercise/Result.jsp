<%@ page import="Model.Employee" %>
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
		Employee func = (Employee) request.getAttribute("ObjEmployee");
	%>
	
	Nome: <%= func.getName()%><br>
	Matrícula: <%= func.getRegistration()%><br>
	Salário Bruto: <%= func.getGrossSalary()%><br>
	Salário líquido: <%= func.getNetSalary()%><br>
	
</body>
</html>