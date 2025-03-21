package Servlets;


import Beans.Conducteur;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SelectIDConducteur")
public class SelectIDConducteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		int id = Integer.parseInt(request.getParameter("mod"));
		
		Conducteur cond = new Conducteur();

		ArrayList<Conducteur> a;
		a = cond.selecetIDConducteur(id);
		request.setAttribute("SelectIDConducteur", a);
		request.getRequestDispatcher("/profil_conducteur.jsp").forward(request, response);
//		request.getRequestDispatcher("/infoannoncefreelancer.jsp").forward(request, response);

	}

}
