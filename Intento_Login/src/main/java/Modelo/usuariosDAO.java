package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class usuariosDAO {
	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
	public boolean Crear_Usuario(usuariosDTO user) {
	    boolean resul=false;
		try {
			String sql="Insert into Usuarios values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getCedula());
			ps.setString(2, user.getCorreo());
			ps.setString(3, user.getNombre());
			ps.setString(4, user.getContrasenia());
			ps.setString(5, user.getUsers());
			resul = ps.executeUpdate()>0;
			JOptionPane.showMessageDialog(null, "Exito al insertar");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al insertar"+ ex);
		}
		return resul;
	}
	
	
	public usuariosDTO Buscar_Usuario(String cedula) {
		
		usuariosDTO user= null;
		try {
		String sql="select * from Usuarios where cedula_usuario=?";	
		ps=con.prepareStatement(sql);
		ps.setString(1, cedula);
		res=ps.executeQuery();
		while(res.next()) {
			user = new usuariosDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
		}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al consultar" +e);
		}
	
		return user;
	}
	
	public boolean Actualizar_Usuario(usuariosDTO user) {
	    boolean resul=false;
		try {
		String sql="update Usuarios set  email_usuario=?, nombre_usuario=?, password=?,usuario=? where cedula_usuario=?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, user.getCorreo());
		ps.setString(2, user.getNombre());
		ps.setString(3, user.getContrasenia());
		ps.setString(4, user.getUsers());
		ps.setString(5,user.getCedula());
		resul=ps.executeUpdate()>0;	
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al actualizar: "+ex);
		}
		return resul;
	}
	
	public boolean Eliminar_Usuario(String auxcedula) {
	    boolean resul=false;
		try {
		String sql="delete from Usuarios where cedula_usuario=?";
		ps = con.prepareStatement(sql);

		ps.setString(1,auxcedula);
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null, "Se elimino el usuario");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al eliminar: "+ex);
		}
		return resul;
	}

	
}
