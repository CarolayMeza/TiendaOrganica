package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class clientesDAO {
	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
	public boolean Crear_Cliente(clientesDTO user) {
	    boolean resul=false;
		try {
		String sql="insert into Clientes values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getCedula());
		ps.setString(2, user.getDireccion());
		ps.setString(3, user.getCorreo());
		ps.setString(4, user.getNombre());
		ps.setString(5, user.getTelefono());
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null," insertado ");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar: "+ex);
		}
		return resul;
	}
	
	public clientesDTO Buscar_Cliente(String cedula) {
		
		clientesDTO user= null;
		try {
		String sql="select * from Clientes where Cedula=?";	
		ps=con.prepareStatement(sql);
		ps.setString(1, cedula);
		res=ps.executeQuery();
		while(res.next()) {
			user = new clientesDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
		}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al consultar" +e);
		}
	
		return user;
	}
	
	public boolean Actualizar_Cliente(clientesDTO user) {
	    boolean resul=false;
		try {
		String sql="update Clientes set direccion_cliente=?, email_cliente=?,nombre_cliente=?,telefono_cliente=? where cedula=?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, user.getDireccion());
		ps.setString(2, user.getCorreo());
		ps.setString(3, user.getNombre());
		ps.setString(4, user.getTelefono());
		ps.setString(5,user.getCedula());
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null, "Cliente Actualizado");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al actualizar: "+ex);
		}
		return resul;
	}
	
	public boolean Eliminar_Cliente(String auxcedula) {
	    boolean resul=false;
		try {
		String sql="delete from Clientes where cedula=?";
		ps = con.prepareStatement(sql);

		ps.setString(1,auxcedula);
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null, "Se elimino el Cliente");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al eliminar: "+ex);
		}
		return resul;
	}

	
}
