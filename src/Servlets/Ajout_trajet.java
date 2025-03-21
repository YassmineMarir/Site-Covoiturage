package Servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Trajet;


@WebServlet("/Ajout_trajet")
public class Ajout_trajet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("mafatch 0");
		String lieu_départ = request.getParameter("lieu_départ");
		String lieu_arrivée = request.getParameter("lieu_arrivée");
		String heure_départ = request.getParameter("heure_départ");
		String date_départ = request.getParameter("date_départ");
		float prix = Float.parseFloat( request.getParameter("prix"));
		int place =Integer.parseInt(request.getParameter("place")) ;
		
		String id_c= request.getSession(false).getAttribute("id").toString();
		int id_conducteur = Integer.parseInt(id_c);
		 System.out.println("fat");
		
	Trajet t = new Trajet();
t.AjouterTrajet(lieu_départ,lieu_arrivée,heure_départ,date_départ,prix,place,id_conducteur);
request.getRequestDispatcher("ajouter_trajet.jsp").forward(request, response);

	}

}

