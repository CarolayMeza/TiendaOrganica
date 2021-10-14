$(document).ready(function(){

	function Calculos() {
			var precio = parseFloat(document.getElementById("precio1").value);
			var cantidad = parseFloat(document.getElementById("cantidad1").value);
			document.getElementById("valorT1").value = precio * cantidad;
			
			var precio = parseFloat(document.getElementById("precio2").value);
			var cantidad = parseFloat(document.getElementById("cantidad2").value);
			document.getElementById("valorT2").value = precio * cantidad;
			
			var precio = parseFloat(document.getElementById("precio3").value);
			var cantidad = parseFloat(document.getElementById("cantidad3").value);
			document.getElementById("valorT3").value = precio * cantidad;
			
			var valorT1 = parseFloat(document.getElementById("valorT1").value);
			var valorT2 = parseFloat(document.getElementById("valorT2").value);
			var valorT3 = parseFloat(document.getElementById("valorT3").value);
			if (valorT1 == "") {
				valorT1 = 0;
			}
			if (valorT2 == "") {
				valorT2 = 0;
			}
			if (valorT3 == "") {
				valorT3 = 0;
			}
			document.getElementById("totalConIva").value = valorT1 + valorT2 + valorT3;
				
			var iva1 = parseFloat(document.getElementById("iva1").value);
			iva1 = (iva1 / 100) + 1
			document.getElementById("totalIva1").value = valorT1 - (valorT1 / iva1);
			var iva2 = parseFloat(document.getElementById("iva2").value);
			iva2 = (iva2 / 100) + 1
			document.getElementById("totalIva2").value = valorT2 - (valorT2 / iva2);
			var iva3 = parseFloat(document.getElementById("iva3").value);
			iva3 = (iva3 / 100) + 1
			document.getElementById("totalIva3").value = valorT3 - (valorT3 / iva3);
	
			
			var totalIva1 = parseFloat(document.getElementById("totalIva1").value);
			var totalIva2 = parseFloat(document.getElementById("totalIva2").value);
			var totalIva3 = parseFloat(document.getElementById("totalIva3").value);
			totalIva1=Math.round(totalIva1);
			totalIva2=Math.round(totalIva2);
			totalIva3=Math.round(totalIva3);
			document.getElementById("totalIva").value = totalIva1+totalIva2+totalIva3;
			
			document.getElementById("ValorVP1").value = valorT1 - totalIva1;
			document.getElementById("ValorVP2").value = valorT2 - totalIva3;
			document.getElementById("ValorVP3").value = valorT3 - totalIva3;
			
			
			var totalConIva = parseFloat(document.getElementById("totalConIva").value);
			var totalIva = parseFloat(document.getElementById("totalIva").value);
			document.getElementById("totalV").value = totalConIva - totalIva;
		}


///AUN NO SIRVEEEEEEEEEE

});


	