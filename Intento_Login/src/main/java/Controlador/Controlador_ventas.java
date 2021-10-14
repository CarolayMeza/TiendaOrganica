package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		PrintWriter salida= response.getWriter();
		
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
			
			
			
			int codigoVenta;
			String cedulaCliente, cedulaUsuario ;
			double ivaVenta, totalVenta, valorVenta;
			String respuesta="";
			
			codigoVenta = Integer.parseInt(request.getParameter("codigoVenta"));
			cedulaCliente = request.getParameter("ceduC");
			cedulaUsuario = request.getParameter("ceduUS");
			ivaVenta = Double.parseDouble(request.getParameter("totalIva"));
			totalVenta = Double.parseDouble(request.getParameter("totalV"));
			valorVenta = Double.parseDouble(request.getParameter("totalConIva"));
			
			ventasDTO ven = new ventasDTO(codigoVenta,cedulaCliente, cedulaUsuario,ivaVenta,totalVenta,valorVenta);
			ventasDAO vDao = new ventasDAO();
			
			if(vDao.Insertar_Venta(ven)){	
				
				
				
				if (request.getParameter("ConsultarP1") != null) {

					productosDAO prod = new productosDAO();

					int  cant1;
					String  nombreP;
					int codigoP;
					Double precioP, ivaP,valorTotal1,valorIva1,valorVenta1;
					cant1=Integer.parseInt(request.getParameter("cantP"));
					codigoP = Integer.parseInt(request.getParameter("codigoP"));

					productosDTO produc = prod.Buscar_Producto(codigoP);

					if (produc != null) {
						codigoP = produc.getCodigo_producto();
						nombreP = produc.getNombre_producto();
						precioP = produc.getPrecio_venta();
						ivaP=produc.getIvacompra();
						valorTotal1 = Double.parseDouble(request.getParameter("valorT1"));
						valorIva1 = Double.parseDouble(request.getParameter("totalIva1"));
						valorVenta1 = Double.parseDouble(request.getParameter("ValorVP1"));;
						
						detalleventaDTO dvDTO = new detalleventaDTO(0, cant1, codigoP, codigoVenta, valorTotal1, valorVenta1, valorIva1);
						detalleventaDAO d= new detalleventaDAO();
						if(d.Insertar_detalleventa(dvDTO)) {
							respuesta = "[{\"estado\":\"Ok\"}]";
							response.sendRedirect("ventas.jsp?codP=" + codigoP + "&&nombreP=" + nombreP + "&&precioP=" + precioP + "&&ivaP=" + ivaP);
						}
					
					} else {
						respuesta = "[{\"estado\":\"Error al insertar detalle de venta\"}]";
						response.sendRedirect("ventas.jsp?men=El PRODUCTO 1 no existe");
					}
				}
				
				if (request.getParameter("ConsultarP2") != null) {

					productosDAO prod = new productosDAO();

					int  cant2;
					int codigoP2;
					String  nombreP2;
					Double precioP2, ivaP2,valorTotal2,valorIva2,valorVenta2;
					
					
					cant2=Integer.parseInt(request.getParameter("cantP2"));
					codigoP2 = Integer.parseInt(request.getParameter("codigoP2"));

					productosDTO produc = prod.Buscar_Producto(codigoP2);

					if (produc != null) {
						codigoP2 = produc.getCodigo_producto();
						nombreP2 = produc.getNombre_producto();
						precioP2 = produc.getPrecio_venta();
						ivaP2=produc.getIvacompra();
						valorTotal2 = Double.parseDouble(request.getParameter("valorT2"));
						valorIva2 = Double.parseDouble(request.getParameter("totalIva2"));
						valorVenta2 = Double.parseDouble(request.getParameter("ValorVP2"));;
						
						detalleventaDTO dvDTO = new detalleventaDTO(0, cant2, codigoP2, codigoVenta, valorTotal2, valorVenta2, valorIva2);
						detalleventaDAO d= new detalleventaDAO();
						if(d.Insertar_detalleventa(dvDTO)) {
							respuesta = "[{\"estado\":\"Ok\"}]";
							response.sendRedirect("ventas.jsp?codP=" + codigoP2 + "&&nombreP=" + nombreP2 + "&&precioP=" + precioP2 + "&&ivaP=" + ivaP2);
						}
					
					} else {
						respuesta = "[{\"estado\":\"Error al insertar detalle de venta\"}]";
						response.sendRedirect("ventas.jsp?men=El PRODUCTO 1 no existe");
					}
				}
				if (request.getParameter("ConsultarP3") != null) {

					productosDAO prod = new productosDAO();

					
					
					int cant3;
					int codigoP3;
					String nombreP3;
					Double precioP3, ivaP3,valorTotal3,valorIva3,valorVenta3;
					
					
					cant3=Integer.parseInt(request.getParameter("cantP3"));
					codigoP3 = Integer.parseInt(request.getParameter("codigoP3"));

					productosDTO produc = prod.Buscar_Producto(codigoP3);

					if (produc != null) {
						codigoP3 = produc.getCodigo_producto();
						nombreP3 = produc.getNombre_producto();
						precioP3 = produc.getPrecio_venta();
						ivaP3=produc.getIvacompra();
						valorTotal3 = Double.parseDouble(request.getParameter("valorT2"));
						valorIva3 = Double.parseDouble(request.getParameter("totalIva2"));
						valorVenta3 = Double.parseDouble(request.getParameter("ValorVP2"));;
						
						detalleventaDTO dvDTO = new detalleventaDTO(0, cant3, codigoP3, codigoVenta, valorTotal3, valorVenta3, valorIva3);
						detalleventaDAO d= new detalleventaDAO();
						if(d.Insertar_detalleventa(dvDTO)) {
							respuesta = "[{\"estado\":\"Ok\"}]";
						response.sendRedirect("ventas.jsp?codP=" + codigoP3 + "&&nombreP=" + nombreP3 + "&&precioP=" + precioP3 + "&&ivaP=" + ivaP3);
						}
					
					} else {
						respuesta = "[{\"estado\":\"Error al insertar detalle de venta\"}]";
						response.sendRedirect("ventas.jsp?men=El PRODUCTO 1 no existe");
					}
				}
				
				
			}else {
				respuesta = "[{\"estado\":\"Error al insertar venta\"}]";
			}
			salida.println(respuesta);	
		}
	}}
			
			
			
			
			
			

