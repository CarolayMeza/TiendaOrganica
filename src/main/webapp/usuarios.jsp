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
<body>

	<%!String mensaje = "";
                String cedula = "", nombre = "", correo = "", password = "", estado = "", users = "";
            %>

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
                }
            %>

	<section class="Form my-3 mx-7"
		style="background: url(Imagen/cafe1.jpg)">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-5"></div>
				<div class="col-lg-7 px-5 pt-5">
					<h1 style="color: white" class="font-weight-bold py-3">Ingrese
						datos usuario</h1>

					<div class="from-row">
						<div class="col-lg-7">
							<input type="text" placeholder="nombre completo"
								class="form-control my-3 p-4">
						</div>
					</div>
					<div class="from-row">
						<div class="col-lg-7">
							<input type="email" placeholder="correo electronico"
								class="form-control my-3 p-4">
						</div>
					</div>
					<div class="from-row">
						<div class="col-lg-7">
							<input type="password" placeholder="contraseña"
								class="form-control my-3 p-4">
						</div>
					</div>
					<div class="from-row">
						<div class="col-lg-7">
							<input type="password" placeholder="confirmar contraseña"
								class="form-control my-3 p-4">
						</div>
					</div>
					<div class="container">
						<div class="row">
							<div class="col-sm my-3">
								<button type="submit" class="btn btn-success" name="buscar"
									value="buscar">consultar</button>
							</div>
							<div class="col-sm my-3">
								<button type="submit" class="btn btn-success" name="crear"
									value="Crear">crear</button>
							</div>
							<div class="col-sm my-3">
								<button type="submit" class="btn btn-success" name="actualizar"
									value="Actualizar">actualizar</button>
							</div>
							<div class="col-sm my-3">
								<button type="submit" class="btn btn-success" name="borrar"
									value="borrar">borrar</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
		crossorigin="anonymous"></script>
</html>
</body>
</html>