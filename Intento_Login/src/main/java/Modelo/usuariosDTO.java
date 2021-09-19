package Modelo;

public class usuariosDTO {
   private String cedula;
   private String correo;
   private String nombre;
   private String contrasenia;
   private String users;

public usuariosDTO(String cedula,String correo, String nombre, String contrasenia, String users) {
	
	this.cedula=cedula;
	this.correo = correo;
	this.nombre = nombre;
	this.contrasenia = contrasenia;	
	this.users=users;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getContrasenia() {
	return contrasenia;
}
public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}

public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getUsers() {
	return users;
}
public void setUsers(String users) {
	this.users = users;
}
  
   
}
