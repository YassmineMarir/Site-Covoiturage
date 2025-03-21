package Beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Statistique {
	

    public  static String nbrConduct;
    public  static String nbrVoy;
    public  static String nbrReservation;
    

		public static void nbrConducteur() {
			Connection con = null;
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("probleme");}
			
			
			
			String sql = "select count(id_conducteur) from conducteur";
			
			try {
				
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

				ResultSet res = ps.executeQuery();
				while(res.next()) {
				nbrConduct=res.getString(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
			
			
		}
		
		
		public static void nbrVoyageur() {
			Connection con = null;
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("probleme");}
			
			
			
			String sql = "select count(id_voyageur) from voyageur";
			
			try {
				
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

				ResultSet res = ps.executeQuery();
				while(res.next()) {
				nbrVoy=res.getString(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
			
			
		}
		
		
		public static void nbrReservation() {
			Connection con = null;
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("probleme");}
			
			
			
			String sql = "select count(id_reservation) from reservation";
			
			try {
				
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

				ResultSet res = ps.executeQuery();
				while(res.next()) {
				nbrReservation=res.getString(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
			
			
		}
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

