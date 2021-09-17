package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Control_login
 */
@WebServlet("/Control_login")
public class Control_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control_login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario,password;
		String Rnombre,Rcorreo,Rcontrasenia;
		String Usuarios[]= new String[3];
		
		// este es controlador!! NO pon este in vista!
		if (request.getParameter("Registro")!=null) {
			usuario=request.getParameter("Correo");
			password=request.getParameter("Contrasenia");
			if(usuario.equals(process.env.REACT_APP_ADMIN_USERNAME) && password.equals(process.env.REACT_APP_ADMIN_USERNAME)) { // NO PON PASSWORDS EN CODIGO!!!!!
				JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
				response.sendRedirect("Principal.jsp?nom"+usuario);
			}else if(usuario==Usuarios[0] && password==Usuarios[2]) {
				JOptionPane.showMessageDialog(null, "Bienvenido");
				response.sendRedirect("Principal.jsp?nom="+usuario);
			} else{
				JOptionPane.showMessageDialog(null, "Datos Incorrectos");
				response.sendRedirect("Login.jsp");
			}
				
		}

		// CONTROLLADORRRRRRR!!!!
		if (request.getParameter("CrearUsuario")!=null) {
			Rnombre=request.getParameter("Rnombre");
			Rcorreo=request.getParameter("Rcorreo");
			Rcontrase�a=request.getParameter("Rcontrasenia");
			Usuarios[0]=Rnombre;
			Usuarios[1]=Rcorreo;
			Usuarios[2]=Rcontrasenia;
			if(Rnombre==Usuarios[0] && Rcorreo==Usuarios[1] && Rcontrasenia==Usuarios[2]){
				JOptionPane.showMessageDialog(null,"Usuario Creado Correctamente");
				response.sendRedirect("Login.jsp");
			}else {
				JOptionPane.showMessageDialog(null,"No Se Pudo Crear El Usuario");
				response.sendRedirect("Registro.jsp");
			}
		}
		

}
}