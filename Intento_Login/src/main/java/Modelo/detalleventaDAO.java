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
		String sql="insert into Detalle_ventas(cantidad_producto,codigo_producto,codigo_venta,valor_total,valor_venta,valor_iva) values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
	
		ps.setDouble(1, d.getCantidadPro());
		ps.setInt(2, d.getCodigo_producto());
		ps.setDouble(3, d.getCodigo_venta());
		ps.setDouble(4, d.getValor_total());
		ps.setDouble(5, d.getValor_ventaD());
		ps.setDouble(6, d.getValor_iva());
		
		
		resul=ps.executeUpdate()>0;	//Inserto datos basicos
		
			
		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar prestamo: "+ex);
		}
		return resul;
	}
	
	// PARA TODO UN DETALLE VENTA ESTA FUNCION DE ABAJO
	
public detalleventaDTO Buscar_detalleVenta(int codigo_detalle) {

	detalleventaDTO user = null;
	try {
		String sql = "select * from Detalle_ventas where codigo_detalle_venta=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, codigo_detalle);
		res = ps.executeQuery();
		while (res.next()) {
			user = new detalleventaDTO(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4),
					res.getDouble(5),res.getDouble(6),res.getDouble(7));
		}
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
		System.out.println("Error al Consultar = " + e.getMessage());
	}

	return user;
}
	

// PARA BUSCAR EL CODIGO DETALLE VENTA 
public detalleventaDTO Buscar_Codigo_detalle(int codigo_producto) {

	detalleventaDTO user = null;
	try {
		String sql = "select * from Detalle_ventas where codigo_producto=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, codigo_producto);
		res = ps.executeQuery();
		while (res.next()) {
			user = new detalleventaDTO(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4),
					res.getDouble(5),res.getDouble(6),res.getDouble(7));
	
		}
	}catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
		System.out.println("Error al Consultar = " + e.getMessage());
	}

	return user;
}
	

	
}

