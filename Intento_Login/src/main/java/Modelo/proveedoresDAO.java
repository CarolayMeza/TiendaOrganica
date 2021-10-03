package Modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class proveedoresDAO {

	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
	public boolean Crear_Proveedor(proveedoresDTO prove) {
	    boolean resul=false;
		try {
		String sql="insert into Proveedores values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, prove.getNit_pro());
		ps.setString(2, prove.getCiudad_pro() );
		ps.setString(3, prove.getDireccion_pro());
		ps.setString(4, prove.getNombre_pro() );
		ps.setString(5, prove.getTelefono_pro());
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null," Proveedor Agregado ");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al Agregar: "+ex);
		}
		return resul;
	}
	
	public proveedoresDTO Buscar_Proveedor(String nit) {
		
		proveedoresDTO pro= null;
		try {
		String sql="select * from Proveedores where nitproveedor=?";	
		ps=con.prepareStatement(sql);
		ps.setString(1, nit);
		res=ps.executeQuery();
		while(res.next()) {
			pro = new proveedoresDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
		}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al consultar" +e);
		}
	
		return pro;
	}
	
	public boolean Actualizar_Proveedor(proveedoresDTO nit) {
	    boolean resul=false;
		try {
		String sql="update Proveedores set ciudad_proveedor=?, direccion_proveedor=?,nombre_proveedor=?, telefono_proveedor=? where nitproveedor=?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, nit.getCiudad_pro());
		ps.setString(2, nit.getDireccion_pro());
		ps.setString(3, nit.getNombre_pro());
		ps.setString(4, nit.getTelefono_pro());
		ps.setString(5, nit.getNit_pro());
		resul = ps.executeUpdate()>0;
		JOptionPane.showMessageDialog(null, "Se actualizo");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al actualizar: "+ex);
		}
		return resul;
	}
	
	public boolean Eliminar_Proveedor(String nit) {
	    boolean resul=false;
		try {
		String sql="delete from Proveedores where nitproveedor=?";
		ps = con.prepareStatement(sql);

		ps.setString(1,nit);
		resul=ps.executeUpdate()>0;	
		JOptionPane.showMessageDialog(null, "Se elimino el Proveedor");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al eliminar: "+ex);
		}
		return resul;
	}

	
}
	

