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
	
	});