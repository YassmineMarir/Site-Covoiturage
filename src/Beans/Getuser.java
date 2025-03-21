package Beans;

import java.sql.SQLException;
import java.util.ArrayList;

import Database.Connexion;

public class Getuser {
public ArrayList<Conducteur> getconducteur() {
	Connexion cnx=new Connexion();
	ArrayList<Conducteur> user=new ArrayList<>();
	try {
		cnx.rs=cnx.stmnt.executeQuery("select * from conducteur;");
		int id_conducteur;
		String nom = "";
		String prenom ="";
		String date_nais = "";
		String mail ="";
		String type = "";  
		String psw ="";
		String inter = null;
		
		while(cnx.rs.next()){
			 psw=cnx.rs.getString("psw");
				 mail =cnx.rs.getString("email");
				 nom =cnx.rs.getString("nom");
				 prenom =cnx.rs.getString("prenom");
				 date_nais =cnx.rs.getString("date_nais");
				 type =cnx.rs.getString("type");
				 inter =cnx.rs.getString("photo");

				 id_conducteur=cnx.rs.getInt("id_conducteur");		
			user.add(new Conducteur(id_conducteur,nom, prenom, date_nais, mail, type, psw,  inter));
			
		
		}	} catch (SQLException e) {
		e.printStackTrace();
	}
	return  user;
	}
public Conducteur getconducteur1(int id_conducteur ) {
	Connexion cnx=new Connexion();
	Conducteur user=null;
	try {
		cnx.rs=cnx.stmnt.executeQuery("select * from conducteur where id_conducteur="+id_conducteur+";");
	
		String nom = "";
		String prenom ="";
		String date_nais = "";
		String mail ="";
		String type = "";  
		String psw ="";
		String inter = null;
		
		while(cnx.rs.next()){
			 psw=cnx.rs.getString("psw");
				 mail =cnx.rs.getString("email");
				 nom =cnx.rs.getString("nom");
				 prenom =cnx.rs.getString("prenom");
				 date_nais =cnx.rs.getString("date_nais");
				 type =cnx.rs.getString("type");
				 inter =cnx.rs.getString("photo");

				 id_conducteur=cnx.rs.getInt("id_conducteur");		
			user=new Conducteur(id_conducteur,nom, prenom, date_nais, mail, type, psw,  inter);
			
		
		}	} catch (SQLException e) {
		e.printStackTrace();
	}
	return  user;
	}
public ArrayList<Voyageur> getVoyageur() {
	Connexion cnx=new Connexion();
	ArrayList<Voyageur> user=new ArrayList<>();
	try {
		cnx.rs=cnx.stmnt.executeQuery("select * from voyageur;");
		int id_voyageur;
		String nom = "";
		String prenom ="";
		String date_nais = "";
		String mail ="";
		String type = "";  
		String psw ="";
		String iner =null;
		
		
		while(cnx.rs.next()){
			 psw=cnx.rs.getString("psw");
				 mail =cnx.rs.getString("email");
				 nom =cnx.rs.getString("nom");
				 prenom =cnx.rs.getString("prenom");
				 date_nais =cnx.rs.getString("date_nais");
				 type =cnx.rs.getString("type");
				 String inter = cnx.rs.getString("photo");
				 

				 id_voyageur=cnx.rs.getInt("id_voyageur");		
			user.add(new Voyageur(id_voyageur,nom, prenom, date_nais, mail, type, psw,inter));
			
		
		}	} catch (SQLException e) {
		e.printStackTrace();
	}
	return  user;
	}
}
