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
<body style="background: url(Imagen/cafe1.jpg)">
	<section class="Form my-3 mx-7 ">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-5"></div>
				<div class="col-lg-7 px-5 pt-5">
					<h1 style="" class="font-weight-bold py-3">¿cuál es mi
						contraseña?</h1>

					<form>
						<div class="from-row">
							<div class="col-lg-7">
								<input type="email" placeholder="email@email.com"
									class="form-control my-3 p-4">
							</div>
						</div>
						<div class="from-row">
							<div class="col-lg-7">
								<button type="button" class="btn btn-success">Recuperar
									Contraseña</button>
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