<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Menu Principal</h1>
<%
String nombre=request.getParameter("nom");
%>
<h2>Bienvenido: <%=nombre %> </h2>
<ul>
<li>Usuario</li>
<li>Clientes</li>
<li>Productos</li>
<li>Proveedores</li>
</ul>
</body>
</html>