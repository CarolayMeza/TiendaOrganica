package Modelo;

public class usuariosDTO {
   private String nombre;
   private String cedula;
   private String correo;
   private String contrasenia;
   private String confirm_contrasenia;
public usuariosDTO(String nombre,String Cedula, String correo, String contrasenia, String confirm_contrasenia) {
	super();
	this.nombre = nombre;
	this.correo = correo;
	this.contrasenia = contrasenia;
	this.confirm_contrasenia = confirm_contrasenia;
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
public String getConfirm_contrasenia() {
	return confirm_contrasenia;
}
public void setConfirm_contrasenia(String confirm_contrasenia) {
	this.confirm_contrasenia = confirm_contrasenia;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
   
   
}
