$(document).ready(function() {

	function listarVentas() {

		var men = document.getElementById("mensaje2").value
		$.ajax({
			type: "post",
			url: "Controlador_reportes",
			dataType: "json",
			data: { opcion: "ventas", mensaje2: men },
			success: function(result2) {
				console.log(result2)
					console.log(result2)
				
				var tabla3 = document.querySelector("#tabla3")
				tabla3.innerHTML=''
				tabla3.innerHTML+=`<tr>
					<th>Cedula</th>
					<th>Nombre </th>
					<th>Valor Total Ventas</th>
					</tr>`
					for (let venta of result2) {
					totalventa+=venta.valor_venta;

					tabla3.innerHTML+=`<tr>
					<td>${venta.cedula_cliente}</td>
					<td>${venta.nombre_cliente}</td>
					<td>${venta.valor_venta}</td>
					</tr>`

						}
		}
	
	})
}
				$('.listaVentas').on('click',function(){
				listarVentas();
		});
	
	});