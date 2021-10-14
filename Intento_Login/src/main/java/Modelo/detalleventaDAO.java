package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class detalleventaDAO {
	
	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;

	
public boolean Insertar_detalleventa(detalleventaDTO d) {
		
		boolean resul=false;
		try {
		String sql="insert into Detalle_ventas values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, d.getCod_detalleventa());
		ps.setDouble(2, d.getCantidadPro());
		ps.setInt(3, d.getCodigo_producto());
		ps.setInt(4, d.getCodigo_venta());
		ps.setDouble(5, d.getValor_ventaD());
		ps.setDouble(6, d.getValor_total());
		ps.setDouble(7, d.getValor_iva());
		
		
		resul=ps.executeUpdate()>0;	//Inserto datos basicos
		
			
		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar prestamo: "+ex);
		}
		return resul;
	}
	
	
	
	
	
	
	
	
	
}
