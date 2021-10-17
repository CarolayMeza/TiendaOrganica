package Modelo;



public class reporteventaDTO {
	
        private String cedula_cliente;
        private String nombre_cliente;
        private double valor_total_ventas;
        
        public reporteventaDTO(String cedula_cliente, String nombre_cliente, double valor_total_ventas) {
        
        	this.cedula_cliente = cedula_cliente;
        	this.nombre_cliente = nombre_cliente;
        	this.valor_total_ventas = valor_total_ventas;
        	      
}
        public String getCedula_cliente() {
        	return cedula_cliente;
        }
        
        public void setCedula_cliente(String cedula_cliente) {
        	this.cedula_cliente = cedula_cliente;
        }
        public String getNombre_cliente() {
        	return nombre_cliente;
        }
        public void setNombre_cliente(String nombre_cliente) {
        	this.nombre_cliente = nombre_cliente;
        }
        public double getValor_total_ventas() {
        	return valor_total_ventas;
        }
        public void setValor_total_ventas(double valor_total_ventas) {
        	this.valor_total_ventas = valor_total_ventas;
        }
        
        
}
    

	
 