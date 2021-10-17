package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 Esta es nuestra conexion 
 */
public class Conexion {
	
	private String bd="Grupo_31_Equipo_1";  /** <---- Aqui debe ir nuestro nombre de la tabla  */
	private String url="jdbc:mariadb://prestamosvf.czo3ixoe3xoe.us-east-1.rds.amazonaws.com/"+bd; /** <---- Aqui debe ir direccion de el localhost  */
	private String user="admin";
	private String pass="Ciclo3_admi123";
	Connection conec=null;
	
	public Connection Conectar() {
		
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		conec= DriverManager.getConnection(url,user,pass);
		//JOptionPane.showMessageDialog(null, "Conexion ok.....");
		}catch(Exception e) {
			//JOptionPane.showMessageDialog(null, "Error en la Conexion....."+e);
		}
		return conec;
	}

}
