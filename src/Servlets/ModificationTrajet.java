package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Trajet;



@WebServlet("/ModificationTrajet")
public class ModificationTrajet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ModificationTrajet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post de modification trajet called");
		String id_c= request.getSession(false).getAttribute("id").toString();
		int id_conducteur = Integer.parseInt(id_c);
		
		doGet(request, response);
		String lieu_d�part= request.getParameter("lieu_d�part");
		String lieu_arriv�e= request.getParameter("lieu_arriv�e");
		String heure_d�part= request.getParameter("heure_d�part");
		String date_d�part= request.getParameter("date_d�part");
		float prix = Float.parseFloat( request.getParameter("prix"));
		int place =Integer.parseInt(request.getParameter("place")) ;
		
		int id = Integer.parseInt(request.getParameter("mod"));
		
		Trajet trajet = new Trajet();
		
		trajet.modifierTrajet(id, lieu_d�part, lieu_arriv�e, heure_d�part, date_d�part, prix, place);

		request.setAttribute("message", "Votre Trajet � �t� Modifier.  modifier un autre ...");

		request.getRequestDispatcher("/modifier_trajet.jsp").forward(request, response);
	}

}

