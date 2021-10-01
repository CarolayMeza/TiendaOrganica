<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<%--Este es nuestra carpeta con solo link ahorrar lineas de codigo no generar sobrecarga--%>
<jsp:include page="link/link.jsp" />
</head>


<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>
<body
	style='background: url(Imagen/cafe1.jpg)&gt;
        &lt;section class="Form my-3 mx-7"'>
	<table class="table table-responsive table-bordered my-3 mx-7">
		<thead>
			<h1 style="color: green" class="font-weight-bold py-3 text-center">Listado
				de clientes</h1>
			<tr>
				<th>cedula</th>
				<th>nombre</th>
				<th>correo electronico</th>
				<th>direccion</th>
				<th>telefono</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1070924481</td>
				<td>Carolay Meza</td>
				<td>carolaymeza@example.com</td>
				<td>carrera #231-222</td>
				<td>3104300153</td>

			</tr>
			<tr>
				<td>1070929099</td>
				<td>Yordis Colina</td>
				<td>yordiscolina@example.com</td>
				<td>carrera #231-222</td>
				<td>3104300153</td>
			</tr>
			<tr>
				<td>107092909432</td>
				<td>Rossy</td>
				<td>rossy@example.com</td>
				<td>carrera #231-222</td>
				<td>3104300153</td>
			</tr>
			<tr>
				<td>10709244000</td>
				<td>carol</td>
				<td>carol@example.com</td>
				<td>carrera #231-222</td>
				<td>3104300153</td>
			</tr>
			<tr>
				<td>1070234581</td>
				<td>Julian</td>
				<td>julianflorez@example.com</td>
				<td>carrera #231-222</td>
				<td>3104300153</td>
			</tr>
		</tbody>
	</table>