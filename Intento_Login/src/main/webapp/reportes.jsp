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


	<div class="container my-3 mx-7">
		<div class="row my-3 mx-7">

			<div class="col-sm my-3 text-center my-3 mx-7">
				<button class="listaUsuarios btn btn-success"
					class="btn btn-success col-sm" id="mensaje">Listar
					usuarios</button>
			</div>

			<div class="col-sm my-3 text-center my-3 mx-7">
				<button class="listaClientes  btn btn-success" id="mensaje1">Listar
					clientes</button>

			</div>

			<div class="col-sm my-3 text-center my-3 mx-7">
				<a class="btn btn-success col-sm" type="button"
					href="venclientes.jsp"> Venta por cliente</a>

			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
				<h1 style="color: white" class="font-weight-bold py-3 text-center">Listado
					de usuarios</h1>
					<table id="tabla1" style="color: white"
				class="font-weight-bold py-3 text-center">

			</table>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<h1 style="color: White" class="font-weight-bold py-3 text-center">Listado
				de clientes</h1>
			<table id="tabla2" style="color: white"
				class="font-weight-bold py-3 text-center">
			</table>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h1 style="color: White" class="font-weight-bold py-3 text-center">Venta
				por cliente</h1>
			<table id="#" style="color: white"
				class="font-weight-bold py-3 text-center">
			</table>
		</div>
	</div>

</body>