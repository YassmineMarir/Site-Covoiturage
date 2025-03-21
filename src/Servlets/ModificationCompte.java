package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Conducteur;
import Beans.Trajet;
import Beans.Voyageur;



@WebServlet("/ModificationCompte")
public class ModificationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ModificationCompte() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post de modification compte called");
		
		
		doGet(request, response);
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date_nais = request.getParameter("date_nais");
		String mail = request.getParameter("email");
		String type = request.getParameter("utilisateur");
		String psw = request.getParameter("password");
		
		int id = Integer.parseInt(request.getParameter("mod"));
		if(type.equals("conducteur")){
		Conducteur cond = new Conducteur();
		
		cond.ModifierProfil(id, nom, prenom,date_nais,mail,type, psw);

		request.setAttribute("message", "Votre Annonce à été Modifier.  modifier une autre ...");

		request.getRequestDispatcher("/profil_conducteur.jsp").forward(request, response);}
		else{
			if(type.equals("voyageur")){
				Voyageur voy = new Voyageur();
				
				voy.ModifierProfil(id, nom, prenom,date_nais,mail,type, psw);

				request.setAttribute("message", "Votre Annonce à été Modifier.  modifier une autre ...");

				request.getRequestDispatcher("/profil_voyageur.jsp").forward(request, response);}
			
		}
	}

}

