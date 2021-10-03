<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
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
    <title>Website</title>
  </head>
  <body style="background: url(Imagen/cafe1.jpg)">
  
  
  
  
  
    <div class="container text-center my-5">
		<a class="tiendavirtual" href="index.jsp"><img style="border-radius: 20px;" src="Imagen/LogoPrinci.jpg"
			class="img-luid" alt=""></a>
	</div>

  
   <section>
   
   <div class="container">
   
   
        <div class="row justify-content-center">
		<div class="col-lg-7  text-center">
			<h1 style="color: white">BIENVENIDO ADMINISTRADOR</h1>
			<div class="col my-3 text-center">
				
                
                <form action="Control_login" method="post">
                
                <!--  Ingresando admininicial -->
                    <div class="from-row">
                        <div class="col-lg-7">
                            <input type="text" placeholder="Usuario o Correo Electronico" name="Correo" class="form-control my-3 p-4">
                        </div>
                    </div>
                    
                     <!--  Ingresando contraseña admin123456 -->
                    <div class="from-row">
                        <div class="col-lg-7">
                            <input type="password" name="Contraseña" placeholder="********" class="form-control my-3 p-4">
                        </div>
                    </div>
                    
                    
                    <div class="from-row">
                        <div class="col-lg-7">
                        
                          <input type="submit" name="Ingreso" value="Ingresar"  class="btn1 mt-3px mb-5" >
       					 <a href="Login.jsp">
        				<input type="submit" class="button" value="Cancelar"  class="btn1 mt-3px mb-5" ></a>  
        
                        </div>
                    </div>
                
                </form>
                 </div>
			 </div>
            </div>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    </div>
</section>
</body>
</html>