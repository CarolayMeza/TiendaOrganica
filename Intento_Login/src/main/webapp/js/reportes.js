$(document).ready(function(){
	
	
	
	function listarUsuarios(){
	var men=document.getElementById("mensaje").value	
	$.ajax({
	type:"post",
	url:"Controlador_reportes",
	dataType:"json",
	data:{opcion:"usuarios",mensaje:men},
	success:function(result){
		console.log(result)
				console.log(result)
		var tabla=document.querySelector("#tabla1")
		tabla.innerHTML=''
		tabla.innerHTML+=`<tr>
		<th>cedula_usuarios</th>
		<th>email usuario</th>
		<th>nombre usuario</th>
		<th>contraseña</th>
		<th>usuario</th>
		</tr>`
		for(let user of result){
		tabla.innerHTML+=`<tr>
		<td>${user.cedula}</td>
		<td>${user.correo}</td>
		<td>${user.nombre}</td>
		<td>${user.contrasenia}</td>
		<td>${user.users}</td>
		</tr>`
			}
		}
	
	})
}
	
	$('.listaUsuarios').on('click',function(){
	listarUsuarios();
});

	
	
		
	function listarClientes(){
	var men=document.getElementById("mensaje1").value	
	$.ajax({
	type:"post",
	url:"Controlador_reportes",
	dataType:"json",
	data:{opcion:"clientes",mensaje1:men},
	success:function(result1){
		console.log(result1)
				console.log(result1)
		var tabla=document.querySelector("#tabla2")
		tabla2.innerHTML=''
		tabla2.innerHTML+=`<tr>
		<th>cedula_cliente</th>
		<th>dirección cliente</th>
		<th>email cliente</th>
		<th>nombre cliente</th>
		<th>telefono cliente</th>
		</tr>`
		for(let cliente of result1){
		tabla2.innerHTML+=`<tr>
		<td>${cliente.cedula}</td>
		<td>${cliente.direccion}</td>
		<td>${cliente.correo}</td>
		<td>${cliente.nombre}</td>
		<td>${cliente.telefono}</td>
		</tr>`
			}
		}
	
	})
}
	
	$('.listaClientes').on('click',function(){
	listarClientes();
});

	function listarVentas(){
	var men=document.getElementById("mensaje2").value	
	$.ajax({
	type:"post",
	url:"Controlador_reportes",
	dataType:"json",
	data:{opcion:"ventas",mensaje2:men},
	success:function(result2){
		console.log(result2)
				console.log(result2)
		var tabla3=document.querySelector("#tabla3")
		tabla3.innerHTML=''
		tabla3.innerHTML+=`<tr>
		<th>Cedula</th>
		<th>Nombre </th>
		<th>Valor Total Ventas</th>
		</tr>`
		for(let venta of result2){
		tabla3.innerHTML+=`<tr>
		<td>${venta.cedula_cliente}</td>
		<td>${venta.cedula_usuario}</td>
		<td>${venta.valor_ventaV}</td>
		</tr>`
			}
		}
	
	})
}
	
	$('.listaVentas').on('click',function(){
	listarVentas();
});



	
	});
	
	
	