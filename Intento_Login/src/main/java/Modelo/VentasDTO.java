package Modelo;

public class VentasDTO {
private int cod_venta;
private String Cedula;
private String Cedula_Cli;
private double Iva_venta;
private double Total_venta;
private double Valor_venta;
private int cod_detalleventa;
private int Cantidad;
private int cod_producto;
private double valor_iva;
private double valor_total;



public VentasDTO(String cedula, String cedula_Cli, double iva_venta, double total_venta, double valor_venta,
		int cantidad, double valor_iva, double valor_total) {
	Cedula = cedula;
	Cedula_Cli = cedula_Cli;
	Iva_venta = iva_venta;
	Total_venta = total_venta;
	Valor_venta = valor_venta;
	Cantidad = cantidad;
	this.valor_iva = valor_iva;
	this.valor_total = valor_total;
}
public int getCod_venta() {
	return cod_venta;
}
public void setCod_venta(int cod_venta) {
	this.cod_venta = cod_venta;
}
public String getCedula() {
	return Cedula;
}
public void setCedula(String cedula) {
	Cedula = cedula;
}
public String getCedula_Cli() {
	return Cedula_Cli;
}
public void setCedula_Cli(String cedula_Cli) {
	Cedula_Cli = cedula_Cli;
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
public double getValor_venta() {
	return Valor_venta;
}
public void setValor_venta(double valor_venta) {
	Valor_venta = valor_venta;
}
public int getCod_detalleventa() {
	return cod_detalleventa;
}
public void setCod_detalleventa(int cod_detalleventa) {
	this.cod_detalleventa = cod_detalleventa;
}
public int getCantidad() {
	return Cantidad;
}
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
public int getCod_producto() {
	return cod_producto;
}
public void setCod_producto(int cod_producto) {
	this.cod_producto = cod_producto;
}
public double getValor_iva() {
	return valor_iva;
}
public void setValor_iva(double valor_iva) {
	this.valor_iva = valor_iva;
}
public double getValor_total() {
	return valor_total;
}
public void setValor_total(double valor_total) {
	this.valor_total = valor_total;
}


}
