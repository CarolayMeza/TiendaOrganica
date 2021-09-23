package Modelo;

public class proveedoresDTO {

	private String nit_pro;
	private String nombre_pro;
	private String direccion_pro;
	private String telefono_pro;
	private String ciudad_pro;
	public proveedoresDTO(String nit_pro, String ciudad_pro, String direccion_pro, String nombre_pro,
			String telefono_pro) {
	
		this.nit_pro = nit_pro;
		this.nombre_pro = nombre_pro;
		this.direccion_pro = direccion_pro;
		this.telefono_pro = telefono_pro;
		this.ciudad_pro = ciudad_pro;
	}
	public String getNit_pro() {
		return nit_pro;
	}
	public void setNit_pro(String nit_pro) {
		this.nit_pro = nit_pro;
	}
	public String getNombre_pro() {
		return nombre_pro;
	}
	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}
	public String getDireccion_pro() {
		return direccion_pro;
	}
	public void setDireccion_pro(String direccion_pro) {
		this.direccion_pro = direccion_pro;
	}
	public String getTelefono_pro() {
		return telefono_pro;
	}
	public void setTelefono_pro(String telefono_pro) {
		this.telefono_pro = telefono_pro;
	}
	public String getCiudad_pro() {
		return ciudad_pro;
	}
	public void setCiudad_pro(String ciudad_pro) {
		this.ciudad_pro = ciudad_pro;
	}
	
	
}
