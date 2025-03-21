package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Statistique;


@WebServlet("/GetStatistiques")
public class GetStatistiques extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetStatistiques() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1: appel a la méthode qui calcule le nbr de conducteur
		Statistique.nbrConducteur();
		Statistique.nbrVoyageur();
		Statistique.nbrReservation();
		
		// 2: passage de la variable statique nbrConduct comme parametre pour pouvoir l'appeler dans la jsp 
		request.setAttribute("nbrConduct", Statistique.nbrConduct);
		request.setAttribute("nbrVoy", Statistique.nbrVoy);
		request.setAttribute("nbrReservation", Statistique.nbrReservation);
		
		//  appel a la page jsp qui affiche les statistiques
		request.getRequestDispatcher("Accueil.jsp").forward(request, response);
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

