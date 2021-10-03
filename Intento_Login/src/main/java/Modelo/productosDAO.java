package Modelo;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class productosDAO {

	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null;
	ResultSet res= null;
	
	//INSERTA LIBRO 
	public boolean Inserta_Producto(productosDTO product) {
	    boolean resul=false;
		try {
		String sql="insert into Productos values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, product.getCodigo_producto());
		ps.setDouble(2, product.getIvacompra());
		ps.setString(3, product.getNitproveedor());
		ps.setString(4, product.getNombre_producto());
		ps.setDouble(5, product.getPrecio_compra());
		ps.setDouble(6, product.getPrecio_venta());

		resul=ps.executeUpdate()>0;	
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null,"error al insertar producto: "+ex);
		}
		return resul;
	}
	//BUSCAR PRODUCTO
	
public productosDTO Buscar_Producto(String codigo) {
		
		productosDTO product= null;
		try {
		String sql="select * from Productos where codigo_producto=?";	
		ps=con.prepareStatement(sql);
		ps.setString(1, codigo);
		res=ps.executeQuery();
		while(res.next()) {
			product = new productosDTO(res.getString(1),res.getDouble(2),res.getString(3),res.getString(4),res.getDouble(5),res.getDouble(6));
		}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al consultar producto" +e);
		}
	
		return product;
	}
	
	//ACTUALIZAR PRODUCTO

public boolean Actualizar_Producto(productosDTO product) {
    boolean resul=false;
	try {
	String sql="update Productos set  ivacompra=?, nitproveedor=?, nombre_producto=?,precio_compra=?,precio_venta=? where codigo_producto=?";
	ps = con.prepareStatement(sql);
	
	ps.setDouble(1, product.getIvacompra());
	ps.setString(2, product.getNitproveedor());
	ps.setString(3, product.getNombre_producto());
	ps.setDouble(4, product.getPrecio_compra());
	ps.setDouble(5,product.getPrecio_venta());
	ps.setString(6,product.getCodigo_producto());
	resul=ps.executeUpdate()>0;	
	JOptionPane.showMessageDialog(null, "Se actualizo el producto");
	}catch(SQLException ex) {
		JOptionPane.showMessageDialog(null,"error al actualizar producto: "+ex);
	}
	return resul;
}

// ELIMINAR PRODUCTO

public boolean Eliminar_Producto(String auxcodigo) {
    boolean resul=false;
	try {
	String sql="delete from Productos where codigo_producto=?";
	ps = con.prepareStatement(sql);

	ps.setString(1,auxcodigo);
	resul=ps.executeUpdate()>0;	
	JOptionPane.showMessageDialog(null, "Se elimino el producto");
	}catch(SQLException ex) {
		JOptionPane.showMessageDialog(null,"error al eliminar el producto: "+ex);
	}
	return resul;
}

	//CARGAR ARCHIVO DE PRODUCTO	
	
	public boolean Cargar_Productos(String url) {
		boolean resul=false;
		try {
			String sql="load data infile '"+url+"' into table Productos fields terminated by ',' lines terminated by '\r\n' ";
			ps=con.prepareStatement(sql);
			//ps.setString(1, url);
			resul=ps.executeUpdate()>0;
			
			
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null,"error insertar productos"+ex);
		}
		return resul;
	}
}
