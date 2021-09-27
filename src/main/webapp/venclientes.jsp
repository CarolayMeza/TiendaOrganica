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
			<h1 style="color: green" class="font-weight-bold py-3 text-center">Total
				de ventas por cliente</h1>
			<tr>
				<th>cedula</th>
				<th>nombre</th>
				<th>Valor total ventas</th>
			</tr>
		</thead>

		</tbody>
	</table>