package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Commentaire;
import Beans.Trajet;


@WebServlet("/PublierCommentaire")
public class PublierCommentaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PublierCommentaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		System.out.println("mafatch 0");
		String nomcom = request.getParameter("name");
		String texte = request.getParameter("message");
		
		
		String id_c= request.getSession(false).getAttribute("id").toString();
		int id_conducteur = Integer.parseInt(id_c);
		String id_v= request.getSession(false).getAttribute("id").toString();
		int id_voyageur = Integer.parseInt(id_c);
		 System.out.println("fat");
		
		 Commentaire c= new Commentaire();
c.publierCommentaire(nomcom,texte,id_conducteur,id_voyageur);
request.getRequestDispatcher("ListeComment.jsp").forward(request, response);

		
		
		
		
	}

}

