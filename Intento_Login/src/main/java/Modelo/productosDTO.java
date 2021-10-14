package Modelo;

public class productosDTO {

	private int codigo_producto;
	private double ivacompra;
	private String nitproveedor;
	private String nombre_producto;
	private double precio_compra;
	private double precio_venta;
	
	
	
	public productosDTO() {
		
	}


	public productosDTO(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}


	public productosDTO(int codigo_producto, double ivacompra, String nitproveedor, String nombre_producto,
			double precio_compra, double precio_venta) {
		this.codigo_producto = codigo_producto;
		this.ivacompra = ivacompra;
		this.nitproveedor = nitproveedor;
		this.nombre_producto = nombre_producto;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}


	public int getCodigo_producto() {
		return codigo_producto;
	}


	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}


	public double getIvacompra() {
		return ivacompra;
	}


	public void setIvacompra(double ivacompra) {
		this.ivacompra = ivacompra;
	}


	public String getNitproveedor() {
		return nitproveedor;
	}


	public void setNitproveedor(String nitproveedor) {
		this.nitproveedor = nitproveedor;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public double getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
	
	
}
