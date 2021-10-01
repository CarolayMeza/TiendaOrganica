/**
let=es una variable global como ventna emergente 
const=establecer una constante el cual su valor no cambia
el don=es todo lo que tengo en mi pagina html
el signo $ es para llamar una funcion de una libreria, 
Todod lo que este dentro de las {} es lo que voy a programar para mi pagina 
alert= ventana emergente para imprimir mensaje 
 */
$(document).ready(function(){
	
	let mensaje="Hola Mundo...."
	alert(mensaje);
	/**Imprimir mensaje por consola */
	console.log(mensaje)
	
	/**Imprimir mensaje por consola para concatenar se usa el + */
	function Sumar(){
		
		/**desde la pagina web traigame el id */
	var n1=ParseInt(document.getElementById("n1").value)
	var n2=ParseInt(document.getElementById("n2").value)
	var suma=n1+n2
	console.log("la suma es "+suma)
	
	/** Para llamar este metodo a el jsp */
	
	var h2=document.getElementById("h2")
	h2.innerHTML="La suma es "+suma;
	}
	
	/** cuando se haga clicken ese boton se llama la funcion sumar  se ejecuta */
	$('.suma').on('click', function(){
		Sumar()
		
	});
	
	
});
