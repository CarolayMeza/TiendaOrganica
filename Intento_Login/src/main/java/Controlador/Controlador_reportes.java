package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.swing.JOptionPane;

import com.google.gson.Gson;

import Modelo.clientesDAO;
import Modelo.clientesDTO;
import Modelo.reporteventaDAO;
import Modelo.reporteventaDTO;
import Modelo.usuariosDAO;
import Modelo.usuariosDTO;


/**
 * Servlet implementation class Controlador_reportes
 */
@WebServlet("/Controlador_reportes")
public class Controlador_reportes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controlador_reportes() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("opcion");
	//	JOptionPane.showMessageDialog(null, op);

		PrintWriter salida = response.getWriter();
		Gson datos = new Gson();

		if (op.equals("usuarios")) {
			usuariosDAO userDao = new usuariosDAO();
			ArrayList<usuariosDTO> lista = new ArrayList<>();
			lista = userDao.cargar_select();
			salida.println(datos.toJson(lista));
		}

		if (op.equals("clientes")) {
			clientesDAO clie = new clientesDAO();
			ArrayList<clientesDTO> lista2 = new ArrayList<>();
			lista2 = clie.cargar_select();
			salida.println(datos.toJson(lista2));
		}
		if (op.equals("ventas")) {
			reporteventaDAO vent = new reporteventaDAO();
			ArrayList<reporteventaDTO> lista3 = new ArrayList<>();
			lista3 = vent.cargar_select();
			salida.println(datos.toJson(lista3));
		}
		
	}
}
