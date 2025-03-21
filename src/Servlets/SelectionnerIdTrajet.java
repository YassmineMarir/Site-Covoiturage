package Servlets;

import Beans.Trajet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SelectionnerIdTrajet")
public class SelectionnerIdTrajet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		int id = Integer.parseInt(request.getParameter("reserver"));
		
		Trajet res = new Trajet();

		ArrayList<Trajet> a;
		a = Trajet.SelectionIDTrajet(id);
		request.setAttribute("SelectionnerIdTrajet", a);
		request.getRequestDispatcher("/ModificationTrajet.jsp").forward(request, response);
//		request.getRequestDispatcher("/infoannoncefreelancer.jsp").forward(request, response);

	}

}
