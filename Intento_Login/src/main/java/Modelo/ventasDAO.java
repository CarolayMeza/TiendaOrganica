package Modelo;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		String sql="insert into Ventas values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, ven.getCodigo_venta());
		ps.setString(2, ven.getCedula_cliente());
		ps.setString(3, ven.getCedula_usuario());
		ps.setDouble(4, ven.getIva_venta());
		ps.setDouble(5, ven.getTotal_venta());
		ps.setDouble(6, ven.getValor_ventaV());
		
		resul=ps.executeUpdate()>0;	//Inserto datos basicos
		

		
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar prestamo: "+ex);
		}
		return resul;
	}
	
	
	


	
	
	
}
