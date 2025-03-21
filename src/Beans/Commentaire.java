package Beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Database.Connexion;

public class Commentaire {

private String nomcom;
private int id_commentaire;
private String texte;
private int id_voyageur;
public Commentaire(int id_commentaire, String nomcom, String texte) {
	super();
	this.nomcom = nomcom;
	this.id_commentaire = id_commentaire;
	this.texte = texte;
}


public Commentaire(int id_commentaire,String nomcom, String texte, int id_voyageur) {
	super();
	this.id_commentaire = id_commentaire;
	this.nomcom = nomcom;
	this.texte = texte;
	this.id_voyageur = id_voyageur;
}




public Commentaire() {
	// TODO Auto-generated constructor stub
}




public int getId_commentaire() {
	return id_commentaire;
}
public void setId_commentaire(int id_commentaire) {
	this.id_commentaire = id_commentaire;
}
public String getTexte() {
	return texte;
}
public void setTexte(String texte) {
	this.texte = texte;
}
public int getId_voyageur() {
	return id_voyageur;
}
public void setId_voyageur(int id_voyageur) {
	this.id_voyageur = id_voyageur;
}





public void publierCommentaire(String nomcom,String texte,int id_con,int id_voy) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");

		System.out.println("m1");
		String sql = "insert into commentaire (nomcmnt , texte ) values (?,?) ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		System.out.println("m2");
		ps.setString(1, nomcom);
		ps.setString(2, texte);
		
		
		
		ps.executeUpdate();     

	} catch (ClassNotFoundException e) {
		System.out.println("mawech ga3ed yansiri -_-");
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}





public ArrayList<Commentaire> ToutLesComment(int idC) {
	ArrayList<Commentaire> a1 = new ArrayList<Commentaire>();

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
		String sql = "Select * from commentaire WHERE id_conducteur='"+idC+"'";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

		ResultSet res = ps.executeQuery();

		while (res.next()) {
			Commentaire com = new Commentaire();

			com.setId_commentaire(res.getInt("id_cmnt"));
			com.setNomcom(res.getString("nomcmnt"));
			com.setTexte(res.getString("texte"));
			

			a1.add(com);
		}

	} catch (Exception e) {
		System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

	}
	return (a1);
}




public String getNomcom() {
	return nomcom;
}




public void setNomcom(String nomcom) {
	this.nomcom = nomcom;
}






public ArrayList<Commentaire> getCommentaire() {
	Connexion cnx=new Connexion();
	ArrayList<Commentaire> cmnt=new ArrayList<>();
	try {
		cnx.rs=cnx.stmnt.executeQuery("select * from commentaire;");
		int id_commentaire;
		String nomcom = "";
		String texte ="";
		
		
		while(cnx.rs.next()){
			
				 
				 id_commentaire =cnx.rs.getInt("id_cmnt");
				 nomcom =cnx.rs.getString("nomcmnt");
				 texte =cnx.rs.getString("texte");
				 
				
				 
				 
		
			cmnt.add(new Commentaire( id_commentaire,nomcom, texte));
			
		
		}	} catch (SQLException e) {
		e.printStackTrace();
	}
	return cmnt;
	}













}

