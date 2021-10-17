package Modelo;

public class detalleventaDTO {

	//Variables detalle venta
		//1 por producto insertado
		private int cod_detalleventa;  
		private int cantidadPro;
		private int codigo_producto;
		private int codigo_venta;
		private double valor_total;
		private double valor_ventaD;  //valor de ese producto
	    private double valor_iva;
		
		public detalleventaDTO( int cantidadPro, int codigo_producto, int codigo_venta,
			double valor_total,	double valor_ventaD , double valor_iva) {
		
			
			this.cantidadPro = cantidadPro;
			this.codigo_producto = codigo_producto;
			this.codigo_venta = codigo_venta;
			this.valor_total = valor_total;
			this.valor_ventaD = valor_ventaD;
			this.valor_iva = valor_iva;
		}
		
		
		
		

		public detalleventaDTO(int cod_detalleventa, int cantidadPro, int codigo_producto, int codigo_venta,
				double valor_total, double valor_ventaD, double valor_iva) {
			super();
			this.cod_detalleventa = cod_detalleventa;
			this.cantidadPro = cantidadPro;
			this.codigo_producto = codigo_producto;
			this.codigo_venta = codigo_venta;
			this.valor_total = valor_total;
			this.valor_ventaD = valor_ventaD;
			this.valor_iva = valor_iva;
		}

		public int getCod_detalleventa() {
			return cod_detalleventa;
		}

		public void setCod_detalleventa(int cod_detalleventa) {
			this.cod_detalleventa = cod_detalleventa;
		}

		public int getCantidadPro() {
			return cantidadPro;
		}

		public void setCantidadPro(int cantidadPro) {
			this.cantidadPro = cantidadPro;
		}

		public int getCodigo_producto() {
			return codigo_producto;
		}

		public void setCodigo_producto(int codigo_producto) {
			this.codigo_producto = codigo_producto;
		}

		public double getCodigo_venta() {
			return codigo_venta;
		}

		public void setCodigo_venta(int codigo_venta) {
			this.codigo_venta = codigo_venta;
		}

		public double getValor_ventaD() {
			return valor_ventaD;
		}

		public void setValor_ventaD(double valor_ventaD) {
			this.valor_ventaD = valor_ventaD;
		}

		public double getValor_total() {
			return valor_total;
		}

		public void setValor_total(double valor_total) {
			this.valor_total = valor_total;
		}

		public double getValor_iva() {
			return valor_iva;
		}

		public void setValor_iva(double valor_iva) {
			this.valor_iva = valor_iva;
		}
		
		

	
	
}
