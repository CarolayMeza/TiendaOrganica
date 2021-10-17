package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Controlador.Conexion;


 public class reporteventaDAO {
	 	
	 	Conexion cnn= new Conexion();
		Connection con= cnn.Conectar();
		PreparedStatement ps= null;
		ResultSet res= null;
		
public ArrayList<reporteventaDTO> cargar_select(){
			
			reporteventaDTO venta=null;
			ArrayList<reporteventaDTO> lista3= new ArrayList<>();
			try {
			String sql="select c.cedula_cliente, c.nombre_cliente, sum(v.total_venta) from Clientes as c inner join Ventas as v on c.cedula_cliente=v.cedula_cliente group by v.cedula_cliente;";
			ps= con.prepareStatement(sql);
			res=ps.executeQuery();
			while(res.next()) {
				venta= new reporteventaDTO(res.getString(1),res.getString(2),res.getDouble(3));
			    lista3.add(venta);
			}
			}catch(SQLException ex) {}
			
			return lista3;
		}

}
