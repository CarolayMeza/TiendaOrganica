package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.proveedoresDAO;
import Modelo.proveedoresDTO;



/**
 * Servlet implementation class controlador_proveedores
 */
@WebServlet("/controlador_proveedores")
public class controlador_proveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_proveedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proveedoresDAO proveDao= new proveedoresDAO(); 
		if(request.getParameter("crear")!=null) {
		String nitpro,ciudad,direccion,nombre,telefono;
		
	
		nitpro = request.getParameter("nit");
		ciudad = request.getParameter("ciudadp");
		direccion = request.getParameter("direccionp");
		nombre=request.getParameter("nombrep");
		telefono=request.getParameter("telefonop");
		
		proveedoresDTO proveDto = new proveedoresDTO(nitpro,ciudad,direccion,nombre,telefono);
		if(proveDao.Crear_Proveedor(proveDto)) {
			JOptionPane.showMessageDialog(null, "Clientes Registrado Exitosamente.");
			response.sendRedirect("proveedores.jsp?men= proveedor Registrado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Cliente no se Registro.");
			response.sendRedirect("proveedores.jsp?men=El proveedor no se Registro.");
		}
		}
		
		if(request.getParameter("consultar")!=null) {
			 
			String nitpro,ciudad,direccion,nombre,telefono;
			
			nitpro=request.getParameter("nit");
			proveedoresDTO Auxdto=proveDao.Buscar_Proveedor(nitpro);
			nitpro=Auxdto.getNit_pro();
			ciudad= Auxdto.getCiudad_pro();
		    direccion = Auxdto.getDireccion_pro();
			nombre= Auxdto.getNombre_pro();
			telefono=Auxdto.getTelefono_pro();
			
			response.sendRedirect("proveedores.jsp?nit="+nitpro+"&&ciudadp="+ciudad+"&&direccionp="
			+direccion+"&&nombrep="+nombre+"&&telefonop="+telefono);
	}
		
		if(request.getParameter("actualizar")!=null) {
			String nitpro,ciudad,direccion,nombre,telefono;
		
			nitpro = request.getParameter("nitP");
			ciudad= request.getParameter("ciudadp");
			direccion= request.getParameter("direccionp");
			nombre = request.getParameter("nombrep");	
		    telefono=request.getParameter("telefonop");
		
		proveedoresDTO proveDto_Act = new proveedoresDTO(nitpro,ciudad,direccion,nombre,telefono);
		if(proveDao.Actualizar_Proveedor(proveDto_Act)) {
			JOptionPane.showMessageDialog(null, "Proveedor se Actualizo Exitosamente.");
			response.sendRedirect("proveedores.jsp?men=proveedor Actualizado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Cliente no se Modifico.");
			response.sendRedirect("proveedores.jsp?men=El proveedor no se Modifico.");
		}
		}
		
		
	if (request.getParameter("borrar")!=null) {
			
			String nitpro;
			nitpro=request.getParameter("nit");
			
			int op=JOptionPane.showConfirmDialog(null, "Desea eliminar el Cliente de la :"+nitpro);
			if(op==0) {
			if(proveDao.Eliminar_Proveedor(nitpro)) {
				response.sendRedirect("proveedores.jsp?men=proveedor Eliminado");
				
			}else {
				response.sendRedirect("proveedores.jsp?men=Proveedor no se Eliminó");

			}
			
			
		}else {
			response.sendRedirect("proveedores.jsp");

	}
		
	}
	}

}
