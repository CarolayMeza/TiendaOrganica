<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
<jsp:include page="./link/link.jsp" />
</head>
<body>
	<nav class="navbar navbar-expand-lg">
		<div class="container">
			<a class="tiendavirtual" href="index.jsp"><img
				style="border-radius: 20px;" src="Imagen/LogoPrinci.jpg"
				class="img-luid" alt=""></a>
			<div class="collapse navbar-collapse" id="navbarScroll">
				<ul class="navbar-nav m-auto my-2 my-lg-0">
					<li class="nav-item"><a class="propiedades"
						href="usuarios.jsp">Usuarios</a></li>
					<li class="nav-item"><a class="propiedades"
						href="clientes.jsp">Clientes</a></li>
					<li class="nav-item"><a class="propiedades"
						href="proveedores.jsp">Proveedores</a></li>
					<li class="nav-item"><a class="propiedades"
						href="productos.jsp">productos</a></li>
					<li class="nav-item"><a class="propiedades" href="ventas.jsp">Ventas</a>
					</li>
					<li class="nav-item"><a class="propiedades"
						href="reportes.jsp">Reportes</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>
</body>
</html>
