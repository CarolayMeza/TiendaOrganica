<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="Modelo.ventasDAO"%>
<%
	ventasDAO dao = new ventasDAO();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="js/ventas.js"></script>

<!-- Bootstrap CSS -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Overlock:ital@1&family=Yeseva+One&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="Css/styles.css">
<title>Website</title>




<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link href="Css/style.css" rel="stylesheet" type="text/css" />
<%--Este es nuestra carpeta con solo link ahorrar lineas de codigo no generar sobrecarga--%>
<jsp:include page="link/link.jsp" />
</head>

<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>
<%--Aqui inicia nuestro codigo para los datos que necesitamos pedir --%>

<body>


	<%!String ced = "", cliente = "", cedU = "", usuario = "", producto = "", producto2 = "", producto3 = "", codP = "",
			codP2 = "", codP3 = "";
	double precioP, precioP2, precioP3, ivaP, ivaP2, ivaP3;%>

	<!--  JAVA PARA CLIENTE -->
	<%
		if (request.getParameter("ced") != null) {
		cliente = request.getParameter("nombre");
		ced = request.getParameter("ced");
	}
	%>
	<!--  JAVA PARA USUARIO/EMPLEADO -->

	<%
		if (request.getParameter("cedU") != null) {
		usuario = request.getParameter("nombreU");
		cedU = request.getParameter("cedU");

	}
	%>

	<!--  JAVA PARA PRODUCTO 1 -->
	<%
		if (request.getParameter("codP") != null) {
		producto = request.getParameter("nombreP");
		codP = request.getParameter("codP");
		precioP = Double.parseDouble(request.getParameter("precioP"));
		ivaP = Double.parseDouble(request.getParameter("ivaP"));
	}
	%>

	<!--  JAVA PARA PRODUCTO 2 -->
	<%
		if (request.getParameter("codP2") != null) {
		producto2 = request.getParameter("nombreP2");
		codP2 = request.getParameter("codP2");
		precioP2 = Double.parseDouble(request.getParameter("precioP2"));
		ivaP2 = Double.parseDouble(request.getParameter("ivaP2"));

	}
	%>

	<!--  JAVA PARA PRODUCTO 3 -->
	<%
		if (request.getParameter("codP3") != null) {
		producto3 = request.getParameter("nombreP3");
		codP3 = request.getParameter("codP3");
		precioP3 = Double.parseDouble(request.getParameter("precioP3"));
		ivaP3 = Double.parseDouble(request.getParameter("ivaP3"));
	}
	%>



	<%
		if (request.getParameter("men") != null) {
		cliente = "";
		ced = "";
		String mensaje = request.getParameter("men");
		out.print("<script>alert('" + mensaje + "');</script>");//Mensaje con alert js
	}
	%>



	<section class="Form my-3 mx-7"
		style="background: url(Imagen/cafe1.jpg)">



		<div class="container ">
			<form action="Controlador_ventas" method="post">

				<div class="row">
					<div class="col-lg-4">
						<div class="input-group my-5">

							<h2>cc. cliente</h2>
							<input type="number" class="form-control" placeholder="cedula"
								name="cedula_C"> <span class="input-group-btn ">
								<button class="btn btn-success col-sm" type="submit"
									name="consultarC">Consultar</button>
							</span>
						</div>
					</div>
					<div class="col-lg-5">
						<div class="input-group my-5">
							<h2>nombre cliente</h2>
							<input type="text" class="form-control"
								placeholder="nombre cliente" name="nombreC" value="<%=cliente%>">
							<input type="hidden" name="ceduC" value="<%=ced%>">
						</div>
					</div>
					<div class="col-lg-3">
						<div class="input-group my-5">
							<h2>consec.</h2>
							<span id="codigoVenta"><%=dao.consecutivoVenta() %></span> <input
								type="text" class="form-control" placeholder="consec."
								name="consecu">
						</div>
					</div>
				</div>
			</form>
		</div>

		<div class="container ">
			<form action="Controlador_ventas" method="post">
				<div class="row">
					<div class="col-lg-4">
						<div class="input-group ">
							<h2>cc. empleado</h2>
							<input type="number" class="form-control" placeholder="cedula"
								name="cedula_E"> <span class="input-group-btn ">
								<button class="btn btn-success col-sm" type="submit"
									name="consultarE">Consultar</button>
							</span>
						</div>
					</div>
					<div class="col-lg-5">
						<div class="input-group">
							<h2>nombre empleado</h2>
							<input type="text" class="form-control"
								placeholder="nombre empleado" name="nombreU"
								value="<%=usuario%>"> <input type="hidden" name="ceduUS"
								value="<%=cedU%>">
						</div>
					</div>
				</div>
			</form>
		</div>

		<div class="container ">
			<form action="Controlador_ventas" method="post">
				<div class="row">
					<div class="col-lg-4">
						<div class="input-group my-5">
							<p>Cod. Producto</p>
						</div>
						<div class="col-lg ">
							<div class="input-group my-3">
								<input type="number" class="form-control"
									placeholder="ingrese codigo..." name="codigoP"> <span
									class="input-group-btn">
									<button class="btn btn-success col-sm" type="submit"
										name="ConsultarP1">
										<!--  AQUI HAY UN ERRORRRRRRRRRR CORREGIRRRRRRR -->
										Consultar
									</button>
								</span>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control"
									placeholder="ingrese codigo..." name="codigoP2"> <span
									class="input-group-btn">
									<button class="btn btn-success col-sm" type="submit"
										name="ConsultarP2">Consultar</button>
								</span>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control"
									placeholder="ingrese codigo..." name="codigoP3"> <span
									class="input-group-btn">
									<button class="btn btn-success col-sm" type="submit"
										name="ConsultarP3">Consultar</button>
								</span>
							</div>
						</div>
					</div>

					<div class="col-lg">
						<div class="input-group my-5 ">
							<p>producto</p>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="text" class="form-control"
									placeholder="nombre del producto" name="nombreP"
									value="<%=producto%>" readonly> <input type="hidden"
									name="codiP" value="<%=codP%>"> <input type="number"
									name="precio1" value="<%=precioP%>" id="precio1"> <input
									type="number" value="<%=ivaP%>" id="iva1" hidden=""> <input
									type="number" name="totalIva1" id="totalIva1"
									placeholder="totalIva1" value="0"> <input
									type="number" name="ValorVP1" id="ValorVP1"
									placeholder="ValorVP1" value="0">

							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="text" class="form-control"
									placeholder="nombre del producto" name="nombreP2"
									value="<%=producto2%>" readonly> <input type="hidden"
									name="codiP" value="<%=codP2%>"> <input type="number"
									name="precio2" value="<%=precioP2%>" id="precio2"> <input
									type="number" value="<%=ivaP2%>" id="iva2" hidden=""> <input
									type="number" name="totalIva2" id="totalIva2"
									placeholder="totalIva2" value="0"> <input
									type="number" name="ValorVP2" id="ValorVP2"
									placeholder="ValorVP2" value="0">
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="text" class="form-control"
									placeholder="nombre del producto" name="nombreP3"
									value="<%=producto3%>" readonly> <input type="hidden"
									name="codiP" value="<%=codP3%>"> <input type="number"
									name="precio3" value="<%=precioP3%>" id="precio3"> <input
									type="number" value="<%=ivaP3%>" id="iva3"> <input
									type="number" name="totalIva3" id="totalIva3"
									placeholder="totalIva3" value="0"> <input
									type="number" name="ValorVP3" id="ValorVP3"
									placeholder="ValorVP3" value="0">
							</div>
						</div>

					</div>
					<div class="col-lg-2">
						<div class="input-group my-5">
							<p>cant.</p>
						</div>
						<div class="col-lg ">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="Cantidad"
									name="cantP" id="cantidad1" oninput="Calculos()" value="0">
								<span class="input-group-btn "> </span>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="Cantidad"
									name="cantP2" id="cantidad2" oninput="Calculos()" value="0">
								<span class="input-group-btn "> </span>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="Cantidad"
									name="cantP3" id="cantidad3" oninput="Calculos()" value="0">
								<span class="input-group-btn "> </span>
							</div>
						</div>
					</div>
					<div class="col-lg-2">
						<div class="input-group my-5">
							<p>valor total</p>
						</div>
						<div class="col-lg ">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="$ 0.000"
									name="valorT1" id="valorT1" value="0" readonly>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="$ 0.000"
									name="valorT2" id="valorT2" value="0" readonly>
							</div>
						</div>
						<div class="col-lg">
							<div class="input-group my-3">
								<input type="number" class="form-control" placeholder="$ 0.000"
									name="valorT3" id="valorT3" value="0" readonly>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
		<div class="container" ALIGN="right">
			<form action="Controlador_ventas" method="post">

				<div class="col-lg-4">
					<div class="input-group my-3">
						<p>Total venta</p>
						<input type="number" class="form-control" placeholder="$ 0.000"
							name="totalV" id="totalV" value="0">
					</div>
				</div>
				<div class="col-lg-4">
					<div class="input-group my-3">
						<p>total IVA</p>
						<input type="number" class="form-control" placeholder="$ 0.000"
							name="totalIva" id="totalIva" value="0">
					</div>
				</div>
				<div class="col-lg-4">
					<div class="input-group my-3">
						<p>total con IVA</p>
						<input type="number" class="form-control" placeholder="$ 0.000"
							name="totalConIva" id="totalConIva" value="0">
					</div>
					<div class="col-lg my-3 ">
						<span class="input-group-btn ">
							<button type="submit" class="btn btn-success btn-lg"
								name="calcularT">Calcular</button>
						</span>
						<div class="col-lg my-3 ">
							<span class="input-group-btn my-5">
								<button type="submit" class="btn btn-success btn-lg"
									name="Confirmar">Confirmar</button>
							</span> <br></br>
						</div>
					</div>
				</div>

			</form>
		</div>

		<button onclick="myFunction()">Click me</button>
	</section>

	<!-- Script precio x cantidad -->
	<Script type="text/javascript">

		function Calculos() {
			var precio = parseFloat(document.getElementById("precio1").value);
			var cantidad = parseFloat(document.getElementById("cantidad1").value);
			document.getElementById("valorT1").value = precio * cantidad;
			
			var precio = parseFloat(document.getElementById("precio2").value);
			var cantidad = parseFloat(document.getElementById("cantidad2").value);
			document.getElementById("valorT2").value = precio * cantidad;
			
			var precio = parseFloat(document.getElementById("precio3").value);
			var cantidad = parseFloat(document.getElementById("cantidad3").value);
			document.getElementById("valorT3").value = precio * cantidad;
			
			var valorT1 = parseFloat(document.getElementById("valorT1").value);
			var valorT2 = parseFloat(document.getElementById("valorT2").value);
			var valorT3 = parseFloat(document.getElementById("valorT3").value);
			if (valorT1 == "") {
				valorT1 = 0;
			}
			if (valorT2 == "") {
				valorT2 = 0;
			}
			if (valorT3 == "") {
				valorT3 = 0;
			}
			document.getElementById("totalConIva").value = valorT1 + valorT2 + valorT3;
				
			var iva1 = parseFloat(document.getElementById("iva1").value);
			iva1 = (iva1 / 100) + 1
			document.getElementById("totalIva1").value = valorT1 - (valorT1 / iva1);
			var iva2 = parseFloat(document.getElementById("iva2").value);
			iva2 = (iva2 / 100) + 1
			document.getElementById("totalIva2").value = valorT2 - (valorT2 / iva2);
			var iva3 = parseFloat(document.getElementById("iva3").value);
			iva3 = (iva3 / 100) + 1
			document.getElementById("totalIva3").value = valorT3 - (valorT3 / iva3);
	
			
			var totalIva1 = parseFloat(document.getElementById("totalIva1").value);
			var totalIva2 = parseFloat(document.getElementById("totalIva2").value);
			var totalIva3 = parseFloat(document.getElementById("totalIva3").value);
			totalIva1=Math.round(totalIva1);
			totalIva2=Math.round(totalIva2);
			totalIva3=Math.round(totalIva3);
			document.getElementById("totalIva").value = totalIva1+totalIva2+totalIva3;
			
			document.getElementById("ValorVP1").value = valorT1 - totalIva1;
			document.getElementById("ValorVP2").value = valorT2 - totalIva3;
			document.getElementById("ValorVP3").value = valorT3 - totalIva3;
			
			
			var totalConIva = parseFloat(document.getElementById("totalConIva").value);
			var totalIva = parseFloat(document.getElementById("totalIva").value);
			document.getElementById("totalV").value = totalConIva - totalIva;
		}
	</Script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
		crossorigin="anonymous"></script>

</body>
</html>