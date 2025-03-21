package Servlets;

import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Conducteur;
import Beans.Voyageur;

@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	String filepath1="C:/Users/nina1_000/workspace/new covoiturage/WebContent/photo/";
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String nom = "";
		String prenom ="";
		String date_nais = "";
		String mail ="";
		String type = "";  
		String psw ="";
		String inter = null;
		
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());	

		try {
				List<FileItem> multi=sf.parseRequest(request);
			for(FileItem item : multi){
				try {
					if(item.getFieldName().equals("photo")){
						FileItem l=item;	
						if(l.getSize()==0){
						}
						else {
Date d=new Date()	;	
 inter=d.getHours()+d.getMinutes()+".jpg";
String path=filepath1+"/"+inter;
item.write(new File(path));


						}
					}
					
					
					if(item.getFieldName().equals("nom")){
						nom=item.getString();
					}
					if(item.getFieldName().equals("prenom")){
						prenom=item.getString();
					}
					if(item.getFieldName().equals("date_nais")){
						date_nais=item.getString();
					}
					
					if(item.getFieldName().equals("mail")){
						mail=item.getString();
						System.out.println("jab le mail");
					}
					System.out.println("fat le test mail");
					if(item.getFieldName().equals("utilisateur")){
						type=item.getString();
					}
					if(item.getFieldName().equals("password")){
						psw=item.getString();
					}
			
				
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		
		
		
	
		
		if(type.equals("conducteur")){
			Conducteur c = new Conducteur();
			c.InscrireConducteur(nom, prenom, date_nais, mail, type, psw,inter);
			request.getRequestDispatcher("AccueilConducteur.jsp").forward(request, response);
			System.out.println("bien inscrit servlet");
		}else{
			if(type.equals("voyageur")){
				Voyageur v = new Voyageur();
				v.InscrireVoyageur(nom, prenom, date_nais, mail, type, psw,inter);
				request.getRequestDispatcher("AccueilVoyageur.jsp").forward(request, response);
				System.out.println("bien inscrit servlet");
			}
		}
		
//		request.getRequestDispatcher("gentl-assets/production/index33.html").forward(request, response);
//		System.out.println("bien inscrit servlet");

	}
}
