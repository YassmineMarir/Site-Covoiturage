package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Trajet;

@WebServlet("/ConducteurToutTrajets")
public class ConducteurToutTrajets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		Trajet trj = new Trajet();
		
		ArrayList<Trajet> a;
		
		a= trj.ToutLesTrajet();
		request.setAttribute("ToutLesTrajets", a);
		request.getRequestDispatcher("/ToutLesTrajets.jsp").forward(request, response);
		
	}

}
