package Controlador;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.swing.JOptionPane;

import Modelo.clientesDAO;
import Modelo.clientesDTO;
import Modelo.detalleventaDAO;
import Modelo.detalleventaDTO;
import Modelo.productosDAO;
import Modelo.productosDTO;
import Modelo.usuariosDAO;
import Modelo.usuariosDTO;
import Modelo.ventasDAO;
import Modelo.ventasDTO;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//PrintWriter salida= response.getWriter();
		
		//CONSULTA DE CLIENTE
		if (request.getParameter("consultarC") != null) {
			clientesDAO clie = new clientesDAO();

			String cedula_C, nombre;
			cedula_C = request.getParameter("cedula_C");

			clientesDTO cli = clie.Buscar_Cliente(cedula_C);

			if (cli != null) {
				cedula_C = cli.getCedula();
				nombre = cli.getNombre();
				response.sendRedirect("ventas.jsp?ced=" + cedula_C + "&&nombre=" + nombre);
			} else {
				response.sendRedirect("ventas.jsp?men=El Cliente no existe");
			}
		}

		
		///CONSULTA DE USUARIO
		if (request.getParameter("consultarE") != null) {
			usuariosDAO usu = new usuariosDAO();

			String cedula_E, nombreU;
			cedula_E = request.getParameter("cedula_E");

			usuariosDTO us = usu.Buscar_Usuario(cedula_E);

			if (us != null) {
				cedula_E = us.getCedula();
				nombreU = us.getNombre();
				response.sendRedirect("ventas.jsp?cedU=" + cedula_E + "&&nombreU=" + nombreU);
			} else {
				response.sendRedirect("ventas.jsp?men=El empleado no existe");
			}
		}

		//CONSULTA DE PRODUCTO 1
		if (request.getParameter("ConsultarP1") != null) {

			productosDAO prod = new productosDAO();

			int codigoP;
			String  nombreP;
			Double precioP, ivaP;
			codigoP = Integer.parseInt(request.getParameter("codigoP"));


			productosDTO produc = prod.Buscar_Producto(codigoP);

			if (produc != null) {
				codigoP = produc.getCodigo_producto();
				nombreP = produc.getNombre_producto();
				precioP = produc.getPrecio_venta();
				ivaP=produc.getIvacompra();
			
				response.sendRedirect("ventas.jsp?codP=" + codigoP + "&&nombreP=" + nombreP + "&&precioP=" + precioP + "&&ivaP=" + ivaP);
			} else {
				response.sendRedirect("ventas.jsp?men=El PRODUCTO 1 no existe");
			}
		}
		
		//CONSULTA DE PRODUCTO 2
		if (request.getParameter("ConsultarP2") != null) {
			productosDAO prod = new productosDAO();

			int codigoP2;
			String nombreP2;
			Double precioP2, ivaP2;
			codigoP2 =  Integer.parseInt(request.getParameter("codigoP2"));


			productosDTO produc = prod.Buscar_Producto(codigoP2);

			if (produc != null) {
				codigoP2 = produc.getCodigo_producto();
				nombreP2 = produc.getNombre_producto();
				precioP2 = produc.getPrecio_venta();
				ivaP2=produc.getIvacompra();
			
				response.sendRedirect("ventas.jsp?codP2=" + codigoP2 + "&&nombreP2=" + nombreP2 + "&&precioP2=" + precioP2 + "&&ivaP2=" + ivaP2);
			} else {
				response.sendRedirect("ventas.jsp?men=El PRODUCTO 2 no existe");
			}
		}
		
		//CONSULTA DE PRODUCTO 3
		if (request.getParameter("ConsultarP3") != null) {
			productosDAO prod = new productosDAO();

			int codigoP3;
			String  nombreP3;
			Double precioP3, ivaP3;
			codigoP3 = Integer.parseInt(request.getParameter("codigoP3"));

			productosDTO produc = prod.Buscar_Producto(codigoP3);

			if (produc != null) {
				codigoP3 = produc.getCodigo_producto();
				nombreP3 = produc.getNombre_producto();
				precioP3 = produc.getPrecio_venta();
				ivaP3=produc.getIvacompra();
				
				response.sendRedirect("ventas.jsp?codP3=" + codigoP3 + "&&nombreP3=" + nombreP3 + "&&precioP3=" + precioP3 + "&&ivaP3=" + ivaP3);
			} else {
				response.sendRedirect("ventas.jsp?men=El PRODUCTO 3 no existe");
			}
		}

		if (request.getParameter("Confirmar") != null) {
			
			
			
		
			String cedulaCliente, cedulaUsuario ;
			double ivaVenta, totalVenta, valorVenta;
		
			cedulaCliente = request.getParameter("prueba1"); //OBTENGO LA CEDULA DEL CLIENTE DE LA VISTA CON ESTE NOMBRE
			cedulaUsuario = request.getParameter("prueba2");	//OBTENGO LA CEDULA DEL USUARIO DE LA VISTA CON ESTE NOMBRE
			ivaVenta = Double.parseDouble(request.getParameter("totalIva"));//OBTENGO LA SUMA DE TODOS LOS IVA  DE LA VISTA CON ESTE NOMBRE
			totalVenta = Double.parseDouble(request.getParameter("totalV"));//OBTENGO LA SUMA DE TODAS LAS VENTAS SIN SUMAR EL IVA MEDIANTE UN CALCULO EN VENTAS.JSP
			valorVenta = Double.parseDouble(request.getParameter("totalConIva"));//OBTENGO LA SUMA DE TODOS LOS TOTALES CON IVA INCLUIDO  DE LA VISTA CON ESTE NOMBRE
			
			ventasDTO ven = new ventasDTO(cedulaCliente, cedulaUsuario,ivaVenta,totalVenta,valorVenta);// CREO UN OBJETO TIPO VENTAS DTO Y LE PASO LOS VALORES QUE NECESITA
			ventasDAO vDao = new ventasDAO();//CREO UN OBJETO DE TIPO VENTASDAO PARA ACCEDER A FUNCIONES COMO AGREGAR O BUSCAR
			boolean aux2=false;//VARIABLE PARA GUARDAR RETORNO DE FUNCION INSERTAR QUE ES BOOLEAN
			aux2=vDao.Insertar_Venta(ven); //INVOCO EL OBJETO DAO Y LE PASO COMO PARAMETRO EL OBJETO DTO PARA INSERTAR LA VENTA
		
			ven=vDao.Buscar_Codigo(cedulaCliente);//INVOCO LA FUNCION BUSCAR CODIGO Y LE PASO LA CEDULA DEL CLIENTE PARA FILTRAR
			int codigoV=ven.getCodigo_venta(); // LA FUNCION ME RETORNA UN OBJETO VENTAS DTO COMPLETO PERO CON ESTO OBTENGO SOLO EL CODIGO VENTA
			
		
			response.sendRedirect("ventas.jsp?codigoV="+codigoV); // LO MANDO A LA VARIABLE QUE CONTROLA LOS VALUES DEL CONSECUTIVO
			
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				double ivaVenta1,ivaVenta2,ivaVenta3; // BASICAMENTE VARIABLES PARA DETALLE VENTAS
				double valorVenta1,valorVenta2,valorVenta3;
				double totalVenta1,totalVenta2,totalVenta3;
				int cant1,cant2,cant3,cod1,cod2,cod3;
				
			ivaVenta1 = Double.parseDouble(request.getParameter("IVA1"));// OBTENGO DE TODAS ESTAS VISTAS LOS VALORES SEÑALADOS POR EL NOMBRE DE LA VARIABLE 
			valorVenta1 = Double.parseDouble(request.getParameter("VENTA1"));
		    totalVenta1 = Double.parseDouble(request.getParameter("TOTAL1"));
			cant1=Integer.parseInt(request.getParameter("CANT1"));
			cod1=Integer.parseInt(request.getParameter("COD1"));
			
		    ivaVenta2 = Double.parseDouble(request.getParameter("IVA2"));
			valorVenta2 = Double.parseDouble(request.getParameter("VENTA2"));
		    totalVenta2 = Double.parseDouble(request.getParameter("TOTAL2"));
		    cant2=Integer.parseInt(request.getParameter("CANT2"));
		    cod2=Integer.parseInt(request.getParameter("COD2"));
		    
		    ivaVenta3 = Double.parseDouble(request.getParameter("IVA3"));
			valorVenta3 = Double.parseDouble(request.getParameter("VENTA3"));
		    totalVenta3 = Double.parseDouble(request.getParameter("TOTAL3"));
		    cant3=Integer.parseInt(request.getParameter("CANT3"));
		    cod3=Integer.parseInt(request.getParameter("COD3"));
		    
		// CREO BOOLEANOS QUE RECIBIRAN LOS RETURN DE CADA FUNCION INSERTAR DETALLE VENTA
		   boolean detalle1=false;
		   boolean detalle2=false;
		   boolean detalle3=false; 
		   int cod_detalle1,  cod_detalle2,  cod_detalle3;// VARIABLES PARA RECIBIR LOS CODIGO DE DETALLE VENTA DE LA BASE DE DATOS
		    
		   
		   // CREO PRIMERO EL OBJETO DETALLEVENTA DTO Y LE MANDO LOS VALORES QUE NECESITA SEGUN SU CONSTRUCTOR
		   // LUEGO CREO UN OBJETO DETALLE VENTAS DAO PARA ACCEDER A LAS FUNCIONES COMO CREAR O BUSCAR
		    detalleventaDTO detalledto=new detalleventaDTO(cant1,cod1,codigoV,totalVenta1,valorVenta1,ivaVenta1);
		    detalleventaDAO detalledao=new detalleventaDAO();
		    
		    // INVOCO LA FUNCION INSERTAR Y LE MANDO UN OBJETO DTO PARA QUE PROCEDA CON LA INSERCION
		    detalle1=detalledao.Insertar_detalleventa(detalledto);
			
			//UNA VEZ AGREGADO TODO ME ASEGURO DE GUARDAR SU CODIGO DETALLE VENTA
		    // USO BUSCAR CODIGO DETALLE Y LE MANDO EL COD DE PRODUCTO REPRESENTADO X LA VARIABLE PARAMETRO
		    //PARA QUE CON CADA PRODUCTO UN CODIGO DETALLE VENTA
		    //MISMO PROCEDIMIENTO EN LAS SIGUIENTES DOS OPERACIONES DE INSERCION Y BUSQUEDA
			detalledto=detalledao.Buscar_Codigo_detalle(cod1);
			cod_detalle1=detalledto.getCod_detalleventa();
		
		   
		   detalleventaDTO detalledto2=new detalleventaDTO(cant2,cod2,codigoV,totalVenta2,valorVenta2,ivaVenta2);
		   
		   
		   detalle2=detalledao.Insertar_detalleventa(detalledto2);
		   

			detalledto=detalledao.Buscar_Codigo_detalle(cod2);
			cod_detalle2=detalledto.getCod_detalleventa();
			
		   
		   detalleventaDTO detalledto3=new detalleventaDTO(cant3,cod3,codigoV,totalVenta3,valorVenta3,ivaVenta3);
		   
		   detalle3=detalledao.Insertar_detalleventa(detalledto3);
		   

			detalledto=detalledao.Buscar_Codigo_detalle(cod3);
			cod_detalle3=detalledto.getCod_detalleventa();
	
		    
		   
		   
		    // LISTO
		}
	}
}
			
			
			
			

