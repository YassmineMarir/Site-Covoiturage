package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Trajet;

@WebServlet("/ResultatRecherche")
public class ResultatRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String de =request.getParameter("lieu_départ");
		String A =request.getParameter("lieu_arrivée");
		String date =request.getParameter("date");
		
		Trajet t = new Trajet();
		ArrayList<Trajet> a = new ArrayList<Trajet>();
		a=t.RechercheTrajet(de,A,date);
		request.setAttribute("resultSearch", a);
		
		request.getRequestDispatcher("/ResultatRecherche.jsp").forward(request, response);
	}

}
