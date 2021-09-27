package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.clientesDAO;
import Modelo.clientesDTO;


/**
 * Servlet implementation class controlador_users
 */
@WebServlet("/controlador_clientes")
public class controlador_clientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_clientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clientesDAO clientDao= new clientesDAO(); 
		if(request.getParameter("crear")!=null) {
		String cedula,nombre,direccion,telefono,correo;
		
	
		cedula = request.getParameter("cedula");
		nombre=request.getParameter("nombre");
		direccion = request.getParameter("direccion");
		telefono=request.getParameter("telefono");
		correo = request.getParameter("correo");
		
		
		
		clientesDTO clientDto = new clientesDTO(cedula,nombre,direccion,telefono,correo);
		if(clientDao.Crear_Cliente(clientDto)) {
			JOptionPane.showMessageDialog(null, "Clientes Registrado Exitosamente.");
			response.sendRedirect("clientes.jsp?men= Cliente Registrado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Cliente no se Registro.");
			response.sendRedirect("clientes.jsp?men=El Cliente no se Registro.");
		}
		}
		
		if(request.getParameter("buscar")!=null) {
			 
			String nombre,cedula_u,correo,direccion,telefono;
			
			cedula_u=request.getParameter("cedula");
			clientesDTO Auxdto=clientDao.Buscar_Cliente(cedula_u);
			cedula_u=Auxdto.getCedula();
			direccion= Auxdto.getDireccion();
		    correo = Auxdto.getCorreo();
			nombre= Auxdto.getNombre();
			telefono=Auxdto.getTelefono();
			
			response.sendRedirect("clientes.jsp?cedula="+cedula_u+"&&direccion="+direccion+"&&correo="
			+correo+"&&nombre="+nombre+"&&telefono="+telefono);
	}
		
		if(request.getParameter("actualizar")!=null) {
		String cedula,nombre,direccion,telefono,correo;
		
		cedula = request.getParameter("cedula");
		nombre=request.getParameter("nombre");
		direccion = request.getParameter("direccion");
		telefono=request.getParameter("telefono");
		correo = request.getParameter("correo");
		
		clientesDTO clientDto_Act = new clientesDTO(cedula,nombre,direccion,telefono,correo);
		if(clientDao.Actualizar_Cliente(clientDto_Act)) {
			JOptionPane.showMessageDialog(null, "Cliente se Actualizo Exitosamente.");
			response.sendRedirect("clientes.jsp?men=Cliente Actualizado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Cliente no se Modifico.");
			response.sendRedirect("clientes.jsp?men=El Cliente no se Modifico.");
		}
		}
		
		
	if (request.getParameter("borrar")!=null) {
			
			String auxcedula;
			auxcedula=request.getParameter("cedula");
			
			int op=JOptionPane.showConfirmDialog(null, "Desea eliminar el Cliente de la :"+auxcedula);
			if(op==0) {
			if(clientDao.Eliminar_Cliente(auxcedula)) {
				response.sendRedirect("clientes.jsp?men=Usuario Eliminado");
				
			}else {
				response.sendRedirect("clientes.jsp?men=Usuario no se Elimin�");

			}
			
			
		}else {
			response.sendRedirect("clientes.jsp");

		}
		
		
		
	}
		
	}
		
	

}
