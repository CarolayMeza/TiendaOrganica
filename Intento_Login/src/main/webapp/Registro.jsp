<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="Css/estilos.css">
<meta charset="ISO-8859-1">
<title>Usuarios</title>
</head>
<body>


    <div id="container">
        <header>
            <h1 class="e_h1">Usuarios </h1>
        </header>

        <div>
                   
            <form class="formulario">
                  <input type="submit" name="ConsultaUsuario" value="Consultar Usuario" class="button">
                  <input type="submit" name="CrearUsuario" value="Crear Usuario" class="button">
                  <input type="submit" name="ActualizaUsuario" value="Actualizar Usuario" class="button">
                  <input type="submit" name="EliminaUsuario" value="Eliminar Usuario" class="button">
            </form>
         </div>  





        <form class="formulario" action="Control_login" method="post">
        <h1>Registrate</h1>
       
         <!--  CAPTURA NOMBRE COMPLETO -->
        <div class="input-contenedor">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-person icon" viewBox="0 0 16 16">
                <path d="M12 1a1 1 0 0 1 1 1v10.755S12 11 8 11s-5 1.755-5 1.755V2a1 1 0 0 1 1-1h8zM4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H4z"/>
                <path d="M8 10a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
              </svg>
            <input type="text" name="RNombre" placeholder="Ingresa Nombre Completo">
        </div>


        <!--  CAPTURA CEDULA COMPLETO -->     
        <div class="input-contenedor">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-person icon" viewBox="0 0 16 16">
                <path d="M12 1a1 1 0 0 1 1 1v10.755S12 11 8 11s-5 1.755-5 1.755V2a1 1 0 0 1 1-1h8zM4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H4z"/>
                <path d="M8 10a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
              </svg>
                <input type="text" name="RCedula" placeholder="Ingresa cedula">
    
        </div>

        <!--  CAPTURA CORREO ELECTRONICO -->
        <div class="input-contenedor">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope icon" viewBox="0 0 16 16">
                <path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2zm13 2.383-4.758 2.855L15 11.114v-5.73zm-.034 6.878L9.271 8.82 8 9.583 6.728 8.82l-5.694 3.44A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.739zM1 11.114l4.758-2.876L1 5.383v5.73z"/>
              </svg>
            <input type="text" name=RCorreo placeholder="Ingresa Correo Electronico">
            
        </div>

        <!--  CAPTURA USUARIO -->
        <div class="input-contenedor">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-person icon" viewBox="0 0 16 16">
                <path d="M12 1a1 1 0 0 1 1 1v10.755S12 11 8 11s-5 1.755-5 1.755V2a1 1 0 0 1 1-1h8zM4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H4z"/>
                <path d="M8 10a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
              </svg>
            <input type="text" name=RUsuario placeholder="Ingresa Usuario">
            
        </div> 

          <!--  CAPTURA CONTRASEÑA -->
        <div class="input-contenedor">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-key-fill icon" viewBox="0 0 16 16">
                <path d="M3.5 11.5a3.5 3.5 0 1 1 3.163-5H14L15.5 8 14 9.5l-1-1-1 1-1-1-1 1-1-1-1 1H6.663a3.5 3.5 0 0 1-3.163 2zM2.5 9a1 1 0 1 0 0-2 1 1 0 0 0 0 2z"/>
              </svg>
            <input type="password" name="RContrasenia" placeholder="Contraseña">
            
        </div>
       
        <footer>
            Tienda organica la mejor WEB &copy; 2020  
        </footer>  
        
        </form>


    </div>
    
</body>
</html>