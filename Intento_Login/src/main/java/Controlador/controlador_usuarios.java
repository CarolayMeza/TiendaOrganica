package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


import Modelo.usuariosDAO;
import Modelo.usuariosDTO;

/**
 * Servlet implementation class Libro
 */
@WebServlet("/Libro")
public class controlador_usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		usuariosDAO userDao= new usuariosDAO(); 
		if(request.getParameter("crear")!=null) {
		String nombre,cedula,correo,confirmacion;
		String contrasenia;
		nombre = request.getParameter("nombre");
		cedula = request.getParameter("cedula");
		correo = request.getParameter("correo");
		contrasenia = request.getParameter("password");
		confirmacion = request.getParameter("confirm_password");
		usuariosDTO userDto = new usuariosDTO(nombre,cedula,correo,contrasenia,confirmacion);
		if(userDao.Crear_Usuario(userDto)) {
			JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente.");
			response.sendRedirect("usuarios.html?men= Usuario Registrado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Usuario no se Registro.");
			response.sendRedirect("usuarios.html?men=El Usuario no se Registro.");
		}
		}
		
		if(request.getParameter("buscar")!=null) {
			 
			String nombre,cedula,correo,contrasenia,confirmacion;
			
			cedula=request.getParameter("cedula");
			usuariosDTO Auxdto=userDao.Buscar_Usuario(cedula);
			cedula=Auxdto.getCedula();
			nombre= Auxdto.getNombre();
		    correo = Auxdto.getCorreo();
			contrasenia = Auxdto.getContrasenia();
			confirmacion = Auxdto.getConfirm_contrasenia();
			response.sendRedirect("usuarios.html?cedula="+cedula+"&&nombre="+nombre+"&&correo="
			+correo+"&&password="+contrasenia+"&&confirm_password="+confirmacion);
	}
		
		if(request.getParameter("actualizar")!=null) {
		String cedula,nombre,correo,contrasenia,confirmacion;
		
		cedula = request.getParameter("cedula");
	    nombre = request.getParameter("nombre");
		correo = request.getParameter("correo");
		contrasenia = request.getParameter("password");
		confirmacion =request.getParameter("confirm_password");
		usuariosDTO userDto_Act = new usuariosDTO(nombre,cedula,correo,contrasenia,confirmacion);
		if(userDao.Actualizar_Usuario(userDto_Act)) {
			JOptionPane.showMessageDialog(null, "Usuario se Actualizo Exitosamente.");
			response.sendRedirect("usuarios.html?men=Usuario Actualizado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Usuario no se Modifico.");
			response.sendRedirect("Usuarios.html?men=El Usuario no se Modifico.");
		}
		}
		
	}

}