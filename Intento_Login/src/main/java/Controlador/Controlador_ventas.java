package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Modelo.VentasDAO;
import Modelo.VentasDTO;
import Modelo.clientesDTO;
import Modelo.productosDTO;
import Modelo.usuariosDTO;

/**
 * Servlet implementation class Controlador_ventas
 */
@WebServlet("/Controlador_ventas")
public class Controlador_ventas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_ventas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("consultarC")!=null) {
			VentasDAO clie= new VentasDAO();
			String cedula;
			cedula=request.getParameter("cedula_C");
			clientesDTO cli=clie.Buscar_Cliente(cedula);
			if(cli!=null) {
			cedula=cli.getCedula();
			response.sendRedirect("ventas.jsp?cedula_C="+cedula);
			}else
			{
				response.sendRedirect("ventas.jsp?men=El Cliente no existe");
			}
	}
		if(request.getParameter("consultarE")!=null) {
			VentasDAO emple= new VentasDAO();
			String cedula;
			cedula=request.getParameter("cedula_E");
			usuariosDTO emp=emple.Buscar_Usuario(cedula);
			if(emp!=null) {
			cedula=emp.getCedula();
			response.sendRedirect("ventas.jsp?cedula_E="+cedula);
			}else
			{
				response.sendRedirect("ventas.jsp?men=El Empleado no existe");
			}
	}
		if(request.getParameter("ConsultarP")!=null) {
			VentasDAO produ= new VentasDAO();
			String CodigoP;
			CodigoP=request.getParameter("codigoP");
			productosDTO pro=produ.Buscar_Producto(CodigoP);
			if(pro!=null) {
			CodigoP=pro.getCodigo_producto();
			response.sendRedirect("ventas.jsp?codigoP="+CodigoP);
			}else
			{
				response.sendRedirect("ventas.jsp?men=El Empleado no existe");
			}
	}
		if (request.getParameter("calcular")!=null){
			
			int cantidad;
			cantidad = Integer.parseInt(request.getParameter("cant"));
		
	}

}
}
