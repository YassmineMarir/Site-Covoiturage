package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Beans.Compte;


@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		

		try {
			String email = request.getParameter("emailH");
			String psw = request.getParameter("pswH");
			String action = request.getParameter("op");
			
			Compte h = new Compte();
			System.out.println("avant test action bloqué");
			if (action.equals("connexion")) {
				System.out.println("test action validé");
				ArrayList<Compte> a;
				a = h.login(email, psw);
				

				for(int i=0 ;i<a.size();i++) {

					if (email.equals(a.get(i).getBdemail()) && psw.equals(a.get(i).getBdpsw())) {
						System.out.println("a.size men login servlet"+a.size());
						HttpSession session = request.getSession();
						session.setAttribute("email", email);
						session.setAttribute("id",a.get(i).getBdid());
						session.setAttribute("nom",a.get(i).getBdNom());
						System.out.println("type te3 li connecta: "+a.get(1).getBdType());
						session.setAttribute("type", a.get(1).getBdType());
						
						System.out.println("id te3 liconnecta: " +session.getAttribute("id"));
						System.out.println("nom te3 liconnecta: " +session.getAttribute("nom"));
						
						if(a.get(1).getBdType()=="Voyageur") {
							request.getRequestDispatcher("/AccueilVoyageur.jsp").forward(request, response);
						}					
						if(a.get(1).getBdType()=="Conducteur") {
						request.getRequestDispatcher("/AccueilConducteur.jsp").forward(request, response);
						}
					}
				}
//				endfor
			}
					
						if (email.isEmpty() || psw.isEmpty()) {
							request.setAttribute("message", "sorry, youll need to fill the box");
							request.getRequestDispatcher("Connection.jsp").forward(request, response);
							System.out.println("problem f les champs wahed fihoum faregh");

						} 
					
//						if(i==a.size()){
//
//							request.setAttribute("message", "invalid account, please try again");
//							request.getRequestDispatcher("Connection.jsp").forward(request, response);
//							System.out.println("nom connecté");
//						}
					
						System.out.println("avant test action deconnecte bloqué");
		if (action.equals("deconnecte")) {
				System.out.println("eni f button deconecter");
				HttpSession session = request.getSession(false);
				session.invalidate();
				request.getRequestDispatcher("Accueil.jsp").forward(request, response);
		}
			
			
			}catch(Exception e) {
				System.out.println(e.getStackTrace());
			}

		
}
	}