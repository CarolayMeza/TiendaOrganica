<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

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
</head>

<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>

<body>




	<%!String mensaje = "";
	String cedula = "", nombre = "", correo = "", password = "", estado = "", users = "";%>

	<%
		if (request.getParameter("cedula") != null) {
		nombre = request.getParameter("nombre");
		cedula = request.getParameter("cedula");
		correo = request.getParameter("correo");
		password = request.getParameter("password");
		users = request.getParameter("users");
		estado = "disabled";
	}
	%>
	<%
		if (request.getParameter("men") != null) {
		cedula = "";
		correo = "";
		nombre = "";
		password = "";
		users = "";
		estado = "";
		mensaje = request.getParameter("men");
		out.print("<script>alert('" + mensaje + "');</script>");//Mensaje con alert js

	}
	%>





	<section class="Form my-3 mx-7"
		style="background: url(Imagen/cafe1.jpg)">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-5"></div>


				<div class="col-lg-7 px-5 pt-5">
					<h1 style="color: #FFFFFF" class="font-weight-bold py-3">Ingrese
						los datos del usuario</h1>
					<form action="controlador_users" method="post">
						<div class="from-row">
							<div class="col-lg-7">
								<input type="number" placeholder="cedula"
									class="form-control my-3 p-4" name="cedula" value="<%=cedula%>"
									required> <input type="hidden" name="cedulaU"
									value="<%=cedula%>">
							</div>
						</div>
						<div class="from-row">
							<div class="col-lg-7">
								<input type="email" placeholder="correo electronico"
									class="form-control my-3 p-4" name="correo" value="<%=correo%>">
							</div>
						</div>
						<div class="from-row">

							<div class="col-lg-7" type="text" placeholder="name"
								aria-label="name">
								<input type="text" placeholder="nombre completo"
									class="form-control my-3 p-4" name="nombre" value="<%=nombre%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="password" placeholder="contraseña"
									class="form-control my-3 p-4" name="password"
									value="<%=password%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="ingresar usuario"
									class="form-control my-3 p-4" name="users" value="<%=users%>">
							</div>
						</div>

						<div class="container">
							<div class="row">


								<div class="col-sm my-3">
									<button type="submit" class="btn1 mt-3px mb-5" name="buscar"
										value="buscar">consultar</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn1 mt-3px mb-5" name="crear"
										value="Crear">crear</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn1 mt-3px mb-5"
										name="actualizar" value="Actualizar">actualizar</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn1 mt-3px mb-5" name="borrar"
										value="borrar">borrar</button>
								</div>
							</div>
						</div>

					</form>
				</div>
			</div>

		</div>
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
		crossorigin="anonymous"></script>


</body>
</html>