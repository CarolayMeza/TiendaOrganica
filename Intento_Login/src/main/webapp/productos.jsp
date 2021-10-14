<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Overlock:ital@1&family=Yeseva+One&display=swap" rel="stylesheet"> 
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet"> 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="./style.css">
    
    
    <jsp:include page="link/link.jsp" />
    
    
    <title>Website</title>
  </head>
  
  
<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="header.jsp" />
<%-- fin de cabecero --%>
 
  <body>

  <section class="Form my-3 mx-7" style="background: url(Imagen/cafe1.jpg)">
    <div class="container">
        <div class="row no-gutters">
            <div class="col-lg-5"> </div>
            <div class="col-lg-7 px-5 pt-5">
                <h1 style="color:#FFFFFF" class="font-weight-bold py-3">Ingrese archivo a cargar</h1>
                
                <form action="controlador_productos" method="post" enctype="multipart/form-data">
                    <div class="from-row"> </div>
                        <div class="col-lg-7" type="text" placeholder="name" aria-label="name"> </div>
                            <input type="text" name="nombreArch" placeholder="nombre archivo" class="form-control my-3 p-4">
                            
                            <div class="from-row">
	                            <div class="col-lg-7 my-3" type="text" placeholder="name"
									aria-label="name">
	             
	                            <input class="btn btn-sucess" type="file" value="Examinar" name="archivo" >
	                            </div> 
                            </div> 
                        <div class="container my-3"></div>
                           <div class="row my-3">
                           	<div class="col-sm my-3">
                           	<div action="productos" method="post"
									enctype="multipart/form-data"></div>
								</div>
                           	
                            <div><input type="submit" name="cargar" value="Cargar Archivo" class="btn btn-success my-3" ></div> 
                            
                            
                            <div class="col-sm my-3">
								<a href="tablaproductos.jsp" type="submit" 	class="btn btn-success" >Actualización de productos</a>
							</div>
                            
                         </div>
                         </form> 
                         </div> 
                   
						</div>   
						</div> 
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>