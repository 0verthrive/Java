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
	Matr�cula: <%= func.getRegistration()%><br>
	Sal�rio Bruto: <%= func.getGrossSalary()%><br>
	Sal�rio l�quido: <%= func.getNetSalary()%><br>
	
</body>
</html>