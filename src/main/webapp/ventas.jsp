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
<%--Aqui inicia nuestro codigo para los datos que necesitamos pedir --%>
<section class="Form my-3 mx-7"
	style="background: url(Imagen/cafe1.jpg)">
	<div class="container ">
		<div class="row">
			<div class="col-lg-6">
				<div class="input-group my-5">
					<h2>cedula</h2>
					<input type="text" class="form-control" placeholder="cedula">
					<span class="input-group-btn ">
						<button class="btn btn-success col-sm" type="button">
							Consultar</button>
					</span>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="input-group my-5">
					<h2>cliente</h2>
					<input type="text" class="form-control" placeholder="cliente">
				</div>
			</div>
			<div class="col-lg-3">
				<div class="input-group my-5">
					<h2>consec.</h2>
					<input type="text" class="form-control" placeholder="consec.">
				</div>
			</div>
		</div>
	</div>
	<div class="container ">
		<div class="row">
			<div class="col-lg-6">
				<div class="input-group my-5">
					<h2>Cod. Producto</h2>
				</div>
				<div class="col-lg ">
					<div class="input-group my-3">
						<input type="text" class="form-control"
							placeholder="ingrese codigo..."> <span
							class="input-group-btn">
							<button class="btn btn-success col-sm" type="button">
								Consultar</button>
						</span>
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control"
							placeholder="ingrese codigo..."> <span
							class="input-group-btn">
							<button class="btn btn-success col-sm" type="button">
								Consultar</button>
						</span>
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control"
							placeholder="ingrese codigo..."> <span
							class="input-group-btn">
							<button class="btn btn-success col-sm" type="button">
								Consultar</button>
						</span>
					</div>
				</div>
			</div>

			<div class="col-lg-3">
				<div class="input-group my-5 ">
					<h2>producto</h2>
				</div>
				<div class="col-lg ">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<span class="input-group-btn">
					<button class="btn btn-success col-sm" type="button">
						Confirmar</button>
				</span>
			</div>
			<div class="col-lg-1">
				<div class="input-group my-5">
					<h2>cant.</h2>
				</div>
				<div class="col-lg ">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
			</div>
			<div class="col-lg-2">
				<div class="input-group my-5">
					<h2>valor total</h2>
				</div>
				<div class="col-lg ">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg">
					<div class="input-group my-3">
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg-10">
					<div class="input-group my-3">
						<h2>Total venta</h2>
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg-10">
					<div class="input-group my-3">
						<h2>total IVA</h2>
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
				<div class="col-lg-10">
					<div class="input-group my-3">
						<h2>total con IVA</h2>
						<input type="text" class="form-control" placeholder="-----">
					</div>
				</div>
			</div>

		</div>
	</div>
</section>