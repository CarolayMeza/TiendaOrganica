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
 * Servlet implementation class controlador_users
 */
@WebServlet("/controlador_users")
public class controlador_users extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public controlador_users() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		usuariosDAO userDao = new usuariosDAO();
		if (request.getParameter("crear") != null) {
			String nombre, cedulaAux, correo, auxUsuarios;
			String contrasenia;

			cedulaAux = request.getParameter("cedula");
			correo = request.getParameter("correo");
			nombre = request.getParameter("nombre");
			contrasenia = request.getParameter("password");
			auxUsuarios = request.getParameter("users");

			usuariosDTO userDto = new usuariosDTO(cedulaAux, correo, nombre, contrasenia, auxUsuarios);
			if (userDao.Crear_Usuario(userDto)) {
				JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente.");
				response.sendRedirect("usuarios.jsp?men= Usuario Registrado Exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "El Usuario no se Registro.");
				response.sendRedirect("usuarios.jsp?men=El Usuario no se Registro.");
			}
		}

		if (request.getParameter("buscar") != null) {

			String nombre, cedula_u, correo, contrasenia, userAux;

			cedula_u = request.getParameter("cedula");
			usuariosDTO Auxdto = userDao.Buscar_Usuario(cedula_u);
			if (Auxdto != null) {
				cedula_u = Auxdto.getCedula();
				nombre = Auxdto.getNombre();
				correo = Auxdto.getCorreo();
				contrasenia = Auxdto.getContrasenia();
				userAux = Auxdto.getUsers();

				response.sendRedirect("usuarios.jsp?cedula=" + cedula_u + "&&correo=" + correo + "&&nombre=" + nombre
						+ "&&password=" + contrasenia + "&&users=" + userAux);
			} else {
				response.sendRedirect("usuarios.jsp?men=El Usuario no existe");
			}
		}

		if (request.getParameter("actualizar") != null) {
			String cedula, nombre, correo, contrasenia, usuarios;

			cedula = request.getParameter("cedulaU");
			correo = request.getParameter("correo");
			nombre = request.getParameter("nombre");
			contrasenia = request.getParameter("password");
			usuarios = request.getParameter("users");

			usuariosDTO userDto_Act = new usuariosDTO(cedula, correo, nombre, contrasenia, usuarios);
			if (userDao.Actualizar_Usuario(userDto_Act)) {
				JOptionPane.showMessageDialog(null, "Usuario se Actualizo Exitosamente.");
				response.sendRedirect("usuarios.jsp?men=Usuario Actualizado Exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "El Usuario no se Modifico.");
				response.sendRedirect("Usuarios.jsp?men=El Usuario no se Modifico.");
			}
		}

		if (request.getParameter("borrar") != null) {

			String auxcedula;
			auxcedula = request.getParameter("cedula");

			int op = JOptionPane.showConfirmDialog(null, "Desea eliminar el Usuario de la :" + auxcedula);
			if (op == 0) {
				if (userDao.Eliminar_Usuario(auxcedula)) {
					response.sendRedirect("usuarios.jsp?men=Usuario Eliminado");

				} else {
					response.sendRedirect("usuarios.jsp?men=Usuario no se Eliminó");

				}

			} else {
				response.sendRedirect("usuarios.jsp");

			}

		}

	}

}
