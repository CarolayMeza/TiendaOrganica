<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="js/reportes.js"></script>
<title>JSP Page</title>
<%--Este es nuestra carpeta con solo link ahorrar lineas de codigo no generar sobrecarga--%>
<jsp:include page="link/link.jsp" />
</head>

<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>
<%--Aqui inicia nuestro codigo para los datos que necesitamos pedir --%>

<body class="Form my-3 mx-7" style="background: url(Imagen/cafe1.jpg)">

	<div class="container"></div>
	<div class="row my-3">
		<div class="col-sm my-3 text-center">
			<button   class="listaUsuarios"  class="btn btn-success col-sm">Listar usuarios</button>
			<label>Mensaje:</label><input type="text" id="mensaje"> 
				<!-- <a class="btn btn-success col-sm" type="button" href="lisusuarios.jsp"> -->
				

		</div>
	</div>
	<div class="col-sm my-3 text-center">
	<button   class="listaClientes"  class="btn btn-success col-sm">Listar clientes</button>
	<label>Mensaje:</label><input type="text" id="mensaje1"> 
						<!-- <a class="btn btn-success col-sm" type="button" href="lisclientes.jsp"> -->
	
	</div>

	<div class="col-sm my-3 text-center">
		<a class="btn btn-success col-sm" type="button" href="venclientes.jsp">
			Venta por cliente</a>

	</div>

<table id="tabla1" >

 </table>

<table id="tabla2">

 </table>


</body>