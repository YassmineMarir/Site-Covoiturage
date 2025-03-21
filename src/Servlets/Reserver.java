package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Reservation;
import Beans.Trajet;

@WebServlet("/Reserver")
public class Reserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
		int place =Integer.parseInt(request.getParameter("places")) ;
		
		
		int id_trajet = Integer.parseInt(request.getParameter("reserver"));
		
		System.out.println("id trajet a reserver"+id_trajet);
		
		String id_v= request.getSession(false).getAttribute("id").toString();
		int id_voyageur = Integer.parseInt(id_v);
		System.out.println("id voyageur qui resrve"+id_voyageur);
		
		Reservation rsv=new Reservation();
		Trajet trj=new Trajet();
		
		int nbr_total=trj.NbrPlace(id_trajet);
		System.out.println("nbr total"+nbr_total);
		
		rsv.DemandeReserver(id_trajet, place, id_voyageur);
		int nbr_res=rsv.NbrPlaceRestant(id_trajet);
		System.out.println("id nbr places resrve"+ nbr_res);
		
		if(nbr_res<=nbr_total){
			rsv.Reservation(id_trajet, place, id_voyageur);
			
			request.setAttribute("message", "Votre réservation a été bien effectuée. ...");
			request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
		}
		else{
		
		request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
		}
		
		
		
		
		
		
	
}
}

