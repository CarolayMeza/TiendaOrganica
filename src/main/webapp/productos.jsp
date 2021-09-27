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
	<section class="Form my-3 mx-7"
		style="background: url(Imagen/cafe1.jpg)">
		<div class="container ">
			<div class="row no-gutters">
				<div class="col-lg-5"></div>
				<div class="col-lg-7 px-5 pt-5">
					<h1 style="color: white" class="font-weight-bold py-3">Carga
						de archivo</h1>
					<form>
						<div class="from-row"></div>
						<div class="col-lg-7" type="text" placeholder="name"
							aria-label="name"></div>
						<input type="text" placeholder="nombre archivo"
							class="form-control my-3 p-4">
						<div class="from-row">
							<div class="col-lg-7 my-3" type="text" placeholder="name"
								aria-label="name">
								<label><input class="btn btn-success" type="file"
									value="Examinar" name="archivo"> </label>
							</div>
						</div>
						<div class="container my-3"></div>
						<div class="row my-3">
							<div class="col-sm my-3">
								<div action="productos" method="post"
									enctype="multipart/form-data"></div>
								<div>
									<input class="btn btn-success my-3" type="submit" name="cargar"
										value="Cargar Archivo">
								</div>

								<div class="col-sm my-3">
									<a href="tablaproductos.jsp" type="submit"
										class="btn btn-success" name="borrar" value="borrar">Actualización
										de productos</a>
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