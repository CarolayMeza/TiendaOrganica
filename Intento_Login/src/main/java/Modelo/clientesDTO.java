package Modelo;

public class clientesDTO {
   private String cedula;
   private String direccion;
   private String correo;
   private String nombre;
   private String telefono;



public clientesDTO(String cedula, String direccion, String correo, String nombre, String telefono) {
	
	this.cedula = cedula;
	this.direccion = direccion;
	this.correo = correo;
	this.nombre = nombre;
	this.telefono = telefono;
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

  
   
}
