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

<body>

<section class="Form my-3 mx-7" style="background: url(Imagen/image.jpg)">


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
				<button class="listaVentas btn btn-success"
					 id="mensaje2"> Listar Ventas </button>

			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
				<h1 style="color: white" class="font-weight-bold py-3 text-center">Listado
					de usuarios</h1>
					<table id="tabla1" style="color: white"
				class="table-responsive table-bordered my-3 mx-7 font-weight-bold py-3 text-center">

			</table>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<h1 style="color: white" class="font-weight-bold py-3 text-center">Listado
				de clientes</h1>  
			<table id="tabla2" style="color: white"
				class="table-responsive table-bordered my-3 mx-7 font-weight-bold py-3 text-center">
			
			</table>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h1 style="color: white" class="font-weight-bold py-3 text-center">Tabla Ventas </h1>
			<table id="tabla3" style="color: white"
				class="table-responsive table-bordered my-3 mx-7 font-weight-bold py-3 text-center">
			</table>
		</div>
	</div>
</section>
</body>