 package Controlador;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

import Modelo.productosDAO;
import Modelo.productosDTO;


/**
 * Servlet implementation class controlador_productos
 */
@WebServlet("/controlador_productos")
@MultipartConfig
public class controlador_productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_productos() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		productosDAO prodDao= new productosDAO(); 
		
		
		
	
		
		// CONSULTAR PRODUCTO 
		
		if(request.getParameter("buscar")!=null) {
			int codigo;
			String  nombre, nit;
			double iva, Pcompra, Pventa;
			
			
			
			codigo=Integer.parseInt(request.getParameter("codigo"));
			productosDTO auxDto=prodDao.Buscar_Producto(codigo);
			codigo=auxDto.getCodigo_producto();
			iva= auxDto.getIvacompra(); 
		    nit = (auxDto.getNitproveedor());
			nombre = auxDto.getNombre_producto();
			Pcompra= auxDto.getPrecio_compra(); 
			Pventa= auxDto.getPrecio_venta(); 

			
			response.sendRedirect("tablaproductos.jsp?codigo="+codigo+"&&iva="+iva+"&&nit="
			+nit+"&&nombre="+nombre+"&&Pcompra="+Pcompra+"&&Pventa="+Pventa);
	}
		
		
		// ACTUALIZAR PRODUCTO 
		
		
		if(request.getParameter("actualizar")!=null) {
			String  nombreP, nitProv;
			double ivaP, Precompra, Preventa;
			int codigoP;
			
			codigoP = Integer.parseInt(request.getParameter("cod"));
			ivaP = Double.parseDouble(request.getParameter("iva"));
			nitProv = (request.getParameter("nitpro"));
			nombreP = request.getParameter("nombre");
			Precompra = Double.parseDouble(request.getParameter("Pcompra"));
			Preventa = Double.parseDouble(request.getParameter("Pventa"));
			
	
			productosDTO prodDto_Act = new productosDTO(codigoP,nitProv,ivaP,nombreP,Precompra,Preventa);
		if(prodDao.Actualizar_Producto(prodDto_Act)) {
		JOptionPane.showMessageDialog(null, "Producto se Actualizo Exitosamente.");
			response.sendRedirect("tablaproductos.jsp?men=Producto Actualizado Exitosamente.");
		}else {
		JOptionPane.showMessageDialog(null, "El producto no se Modificó.");
			response.sendRedirect("tablaproductos.jsp?men=El producto no se Modificó.");
		}
		}
		
		
		
	
		
	//CARGAR ARCHIVOS

		
		if (request.getParameter("cargar")!=null) {
			Part archivo=request.getPart("archivo");
			String nombre=request.getParameter("nombreArch");
			String url="C://Users/CarolayMeza.LAPTOP-NI0KE0H2//eclipse-workspace//Intento_login//src//main//webapp//Doc//";
			
			
			
		JOptionPane.showMessageDialog(null, archivo.getContentType());
			if(archivo.getContentType().equals("text/plain")) {
			try {
				InputStream file=archivo.getInputStream();
				File copia= new File(url+nombre+".csv");
				FileOutputStream escribir=new FileOutputStream(copia);
				int num=file.read();
				while(num!=-1) {
					escribir.write(num);
					num=file.read();
					
				}
				escribir.close();
				file.close();
				
			JOptionPane.showMessageDialog(null, "cargado correctamente..");
				response.sendRedirect("productos.jsp?men=producto se cargó");
				
				if (prodDao.Cargar_Productos(url+nombre+".csv")) {
				JOptionPane.showMessageDialog(null,"Registrado correctamente");
					response.sendRedirect("productos.jsp?men=producto no se cargó");
					
				}else {
				JOptionPane.showMessageDialog(null,"productos no se registraron");
					response.sendRedirect("productos.jsp?men=producto no se registro");
				}
			} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"error al cargar el archivo"+e);
			}
			
			}else {JOptionPane.showMessageDialog (null, "Formato de Archivo no permitido");
				
			}
		}
		
		
		
		
	}

}
