package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Conducteur;
import Beans.Trajet;




@WebServlet("/SuppressionCompte")
public class SuppressionCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
    public SuppressionCompte() {
        super();
       
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
		
		String id_c= request.getSession(false).getAttribute("id").toString();
		int id_conducteur = Integer.parseInt(id_c);
		
		int id = Integer.parseInt(request.getParameter("sup"));
		
		
		 Conducteur con= new Conducteur();
		
		con.SupprimerConducteur(id);
		request.setAttribute("message", "Votre operation a été bien effectué. ...");
		
		request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
		
		
		
	}

}
