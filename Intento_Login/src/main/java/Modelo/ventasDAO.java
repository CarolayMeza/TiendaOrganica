package Modelo;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class ventasDAO {

	
	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
	
	public long consecutivoVenta(){
		long id=1;
		try {
			String sql = "SELECT MAX(codigo_venta) FROM Ventas";
			ps = con.prepareStatement(sql);
			res = ps.executeQuery();
	 
			if (res.next()) {
				id = res.getLong(1)+1;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return id;
	}
	
	
public boolean Insertar_Venta(ventasDTO ven) {
	
	
		
		boolean resul=false;
		try {
		String sql="insert into Ventas(cedula_cliente,cedula_usuario,iva_venta,total_venta,valor_venta) values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, ven.getCedula_cliente());
		ps.setString(2, ven.getCedula_usuario());
		ps.setDouble(3, ven.getIva_venta());
		ps.setDouble(4, ven.getTotal_venta());
		ps.setDouble(5, ven.getValor_ventaV());
		
		resul=ps.executeUpdate()>0;	//Inserto datos basicos
		

		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar venta: "+ex);
		}
		return resul;
	}
// PARA BUSCAR SOLO EL CODIGO DE VENTA
	
public ventasDTO Buscar_Codigo(String cedula) {

	ventasDTO user = null;
	try {
		String sql = "select * from Ventas where cedula_cliente=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, cedula);
		res = ps.executeQuery();
		while (res.next()) {
			user = new ventasDTO(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4),
					res.getDouble(5),res.getDouble(6));
			
		}
	}catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
		System.out.println("Error al Consultar = " + e.getMessage());
	}

	return user;
}
	

// PARA BUSCAR UNA VENTA EN GENERAL
public ventasDTO Buscar_venta(int codigo_venta) {

	ventasDTO user = null;
	try {
		String sql = "select * from Ventas where codigo_venta=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, codigo_venta);
		res = ps.executeQuery();
		while (res.next()) {
			user = new ventasDTO(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4),
					res.getDouble(5),res.getDouble(6));
		}
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
		System.out.println("Error al Consultar = " + e.getMessage());
	}

	return user;
}
}

	
	

