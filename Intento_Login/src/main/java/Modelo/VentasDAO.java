package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class VentasDAO {

	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
public clientesDTO Buscar_Cliente(String cedula) {
		
		clientesDTO clie= null;
		try {
			String sql="select * from clientes where Cedula=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, cedula);
			res=ps.executeQuery();
			while(res.next()) {
				clie = new clientesDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
			}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"El Cliente no existe" +e);
			}
		return clie;
}	
public usuariosDTO Buscar_Usuario(String cedula) {
	
	usuariosDTO user= null;
	try {
		String sql="select * from Usuarios where Cedula=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, cedula);
		res=ps.executeQuery();
		while(res.next()) {
			user = new usuariosDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
		}
	}catch(SQLException e) {
		JOptionPane.showMessageDialog(null,"El Empleado no existe" +e);
		}
	return user;
}
public productosDTO Buscar_Producto(String codigoP) {
	productosDTO pro = null;
	try {
		String sql="select * from productos where codigo_producto=? ";
		ps=con.prepareStatement(sql);
		ps.setString(1, codigoP);
		res=ps.executeQuery();
		while(res.next()) {
			pro= new productosDTO(res.getString(1));
		}
	}catch(SQLException e) {
		JOptionPane.showMessageDialog(null,"Producto no existe" +e);
	}
	return  pro;
}
public boolean Total_Venta(VentasDTO t) {
	boolean resul = false;
	try {
		String sql="select precio_compra from ventas where codigo_producto=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, t.getCod_producto());
		res = ps.executeQuery();
		int precio=0;
		while(res.next()) {
			precio = res.getInt(1);
			}
		sql="select count(codigo_producto) from ventas group by codigo_producto having codigo_producto=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, t.getCod_producto());
		res = ps.executeQuery();
		int cantidad=0;
		while(res.next()) {
			cantidad = res.getInt(1);
		}
		sql="update detalle_ventas set valor_venta=?*? where codigo_detalle_venta=?";
		ps= con.prepareStatement(sql);
		ps.setInt(1, precio);
		ps.setInt(2, cantidad);
		ps.setInt(3,t.getCod_producto());
		resul = ps.executeUpdate()>0;
	}catch(SQLException ex) {
	JOptionPane.showMessageDialog(null,"error: "+ex);
	}
	return resul;
}
}
