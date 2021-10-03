<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
   <!-- Bootstrap CSS -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Overlock:ital@1&family=Yeseva+One&display=swap" rel="stylesheet"> 
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet"> 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="./style.css">
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>tabla productos</title>
<%--Este es nuestra carpeta con solo link ahorrar lineas de codigo no generar sobrecarga--%>
<jsp:include page="link/link.jsp" /> 
 <!--  NO ME ESTA FUNCIONANDO LINK -->

  
</head>

<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>


<body>

<%!String mensaje="";
  String codigo="",iva="",nit="",nombre="",Pcompra="", Pventa="", estado="";
%>
<%
if(request.getParameter("codigo")!=null){
codigo= request.getParameter("codigo");
iva= request.getParameter("iva");
nit=request.getParameter("nit");
nombre=request.getParameter("nombre");
Pcompra=request.getParameter("Pcompra");
Pventa=request.getParameter("Pventa");
estado="disabled";
}
%>
<%
if(request.getParameter("nitpro")!=null){
codigo= request.getParameter("codigo");
iva= request.getParameter("iva");
nit=request.getParameter("nit");
nombre=request.getParameter("nombre");
Pcompra=request.getParameter("Pcompra");
Pventa=request.getParameter("Pventa");
estado="disabled";
}
%>
<%
if(request.getParameter("men")!=null){
codigo="";
iva="";
nombre="";
nit="";
nombre="";
Pcompra="";
Pventa="";
estado="";
mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");//Mensaje con alert js
}
%>
<section class="Form my-3 mx-7"
	style="background: url(Imagen/cafe1.jpg)">
	<div class="container">
	<div class="row no-gutters">
		<div class="col-lg-5"></div>
		<div class="col-lg-7 px-5 pt-5">			
			<h1 style="color: white" class="font-weight-bold py-3">Ingrese datos del producto
			</h1>        
            <form action= "controlador_productos" method="post">
			<div class="from-row">
				<div class="col-lg-7" type="text" placeholder="name"
					aria-label="name"> <!--  cosa extraña -->
					<input type="number" placeholder="codigo del producto"
					class="form-control my-3 p-4" name="codigo" value="<%=codigo%>" required <%=estado%>>
					<input type="hidden" name="cod" value="<%=codigo%>">
				</div>
			</div>
			
			<div class="from-row">
				<div class="col-lg-7">
					<input type="number" placeholder="iva de la compra"
						class="form-control my-3 p-4" name="iva" value="<%=iva%>">
				</div>
			</div>
			
			<div class="from-row">
				<div class="col-lg-7">
					<input type="number" placeholder="nitproveedor"
						class="form-control my-3 p-4" name="nit" value="<%=nit%>"  <%=estado%> >
						<input type="hidden" name="nitpro" value="<%=nit%>">
				</div>
			</div>
			<div class="from-row">
				<div class="col-lg-7">
					<input type="text" placeholder="nombre_producto"
						class="form-control my-3 p-4" name="nombre" value="<%=nombre%>" >
				</div>
			</div>
			<div class="from-row">
				<div class="col-lg-7">
					<input type="number" placeholder="precio_compra"
						class="form-control my-3 p-4" name="Pcompra" value="<%=Pcompra%>">
				</div>
			</div>
			<div class="from-row">
				<div class="col-lg-7">
					<input type="number" placeholder="precio_venta"
						class="form-control my-3 p-4" name="Pventa" value="<%=Pventa%>">
				</div>
			</div>
			<div class="container">
				<div class="row">
				
					<div class="col-sm my-3">
						<button type="submit" class="btn btn-success" name="buscar"
							>consultar</button>
					</div>
					<!--  
					<div class="col-sm my-3">
						<button type="submit" class="btn btn-success" name="crear"
							>crear</button>
					</div>
					 -->
					<div class="col-sm my-3">
						<button type="submit" class="btn btn-success" name="actualizar"
							>actualizar</button>
					</div>
					
						<!--  
					<div class="col-sm my-3">
						<button type="submit" class="btn btn-success" name="borrar"
							>borrar</button>
					</div>
					-->
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