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
		String lieu_départ= request.getParameter("lieu_départ");
		String lieu_arrivée= request.getParameter("lieu_arrivée");
		String heure_départ= request.getParameter("heure_départ");
		String date_départ= request.getParameter("date_départ");
		float prix = Float.parseFloat( request.getParameter("prix"));
		int place =Integer.parseInt(request.getParameter("place")) ;
		
		int id = Integer.parseInt(request.getParameter("mod"));
		
		Trajet trajet = new Trajet();
		
		trajet.modifierTrajet(id, lieu_départ, lieu_arrivée, heure_départ, date_départ, prix, place);

		request.setAttribute("message", "Votre Trajet à été Modifier.  modifier un autre ...");

		request.getRequestDispatcher("/modifier_trajet.jsp").forward(request, response);
	}

}

