package Modelo;

public class ventasDTO {

	private int codigo_venta;
	private String cedula_cliente;
	private String cedula_usuario;

	private double Iva_venta;
	private double Total_venta;   //valor de venta sin iva
	private double Valor_ventaV;   //totaal_venta+iva_venta
	
	
	
	public ventasDTO(int codigo_venta, String cedula_cliente, String cedula_usuario, double iva_venta,
			double total_venta, double valor_ventaV) {
	
		this.codigo_venta=codigo_venta;
		this.cedula_cliente = cedula_cliente;
		this.cedula_usuario = cedula_usuario;
		Iva_venta = iva_venta;
		Total_venta = total_venta;
		Valor_ventaV = valor_ventaV;
	}



	public int getCodigo_venta() {
		return codigo_venta;
	}


	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}


	public String getCedula_cliente() {
		return cedula_cliente;
	}


	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}


	public String getCedula_usuario() {
		return cedula_usuario;
	}


	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}



	public double getIva_venta() {
		return Iva_venta;
	}



	public void setIva_venta(double iva_venta) {
		Iva_venta = iva_venta;
	}


	public double getTotal_venta() {
		return Total_venta;
	}


	public void setTotal_venta(double total_venta) {
		Total_venta = total_venta;
	}



	public double getValor_ventaV() {
		return Valor_ventaV;
	}



	public void setValor_ventaV(double valor_ventaV) {
		Valor_ventaV = valor_ventaV;
	}
	
	
	
	
	
	
	
	
	
}
