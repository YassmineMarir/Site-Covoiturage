package Beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Connexion;

public class Reservation {

	private int id_reservation ;
	private int id_voyageur ;
	private int id_trajet;
    private int place= 0 ;
  
	
    public int getId_voyageur() {
		return id_voyageur;
	}
	public void setId_voyageur(int id_voyageur) {
		this.id_voyageur = id_voyageur;
	}
	
	
	
	

public int getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
	}
	public int getId_trajet() {
		return id_trajet;
	}
	public void setId_trajet(int id_trajet) {
		this.id_trajet = id_trajet;
	}
	
	
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	
	
		//	_______________Les Methodes de reservation__________________
		public void DemandeReserver (int id_trajet,int place,int id_voyageur) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");

			String sql = "INSERT INTO reservation (id_trajet ,place,id_voyageur) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id_trajet);
			ps.setInt(2, place);
			
			ps.setInt(3, id_voyageur);
			
			

			ps.executeUpdate();
			System.out.println("reserver, bien ga3ed yansiri a sidi hamdoulah LOL");
		} catch (Exception e) {
			System.out.println("reserver, mahouch ga3ed yinsiri" + e.getMessage());

		}
	}

//	____________________________________________________
	static public int NbrPlaceRestant(int id_trajet) {
		int a=100;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");

			String sql = "SELECT SUM(place) FROM reservation  WHERE id_trajet='"+id_trajet+"' GROUP BY id_trajet";
			String sql2="SELECT place FROM `trajet` WHERE id_trajet='"+id_trajet+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			PreparedStatement ps2 = con.prepareStatement(sql2);
			
			ResultSet res = ps.executeQuery();
			ResultSet res2 = ps2.executeQuery();

			res.next(); 
			res2.next(); 
			
			a=res2.getInt(1)-res.getInt(1);

		} catch (Exception e) {
			System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

		}
		System.out.println("tajet "+id_trajet+" "+a);
		return a;
	
	}

	
	
	
	public void Reservation (int id_trajet,int place,int id_voyageur) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");

			String sql = "INSERT INTO reservationa (id_trajet ,placeA,id_voyageur) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id_trajet);
			ps.setInt(2, place);
			
			ps.setInt(3, id_voyageur);
			
			

			ps.executeUpdate();
			System.out.println("reserver, bien inséré");
		} catch (Exception e) {
			System.out.println("reserver, non inséré" + e.getMessage());

		}
	}
	//-----------------------------------------------------------------------------------------------------------------------
	
	public ArrayList<Reservation> ToutLesReservation() {
		ArrayList<Reservation> a1 = new ArrayList<Reservation>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");
			String sql = "Select * from reservationa";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				Reservation trj = new Reservation();

				trj.setId_reservation(res.getInt("id_reservationA"));
				trj.setId_trajet(res.getInt(" id_trajet"));
				trj.setPlace(res.getInt("placeA"));
				trj.setId_voyageur(res.getInt("id_voyageur"));
				

				
				
				a1.add(trj);
			}

		} catch (Exception e) {
			System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

		}
		return (a1);
	}
	
	
	public ArrayList<Reservation> getReservation() {
		Connexion cnx=new Connexion();
		ArrayList<Reservation> resv=new ArrayList<>();
		try {
			cnx.rs=cnx.stmnt.executeQuery("select * from reservationa;");
			int id_reservation;
			int id_trajet;
			int place;
			int id_voyageur;
			
			
			
			while(cnx.rs.next()){
				
					 
					 id_reservation =cnx.rs.getInt("id_reservationA");
					 id_trajet =cnx.rs.getInt("id_trajet");
					 place =cnx.rs.getInt("placeA");
					 id_voyageur =cnx.rs.getInt("id_voyageur");
					 
					
					 
					 
			
				resv.add(new Reservation( id_reservation, id_trajet, place, id_voyageur));
				
			
			}	} catch (SQLException e) {
			e.printStackTrace();
		}
		return resv;
		}
	public Reservation(int id_reservation, int id_voyageur, int id_trajet, int place) {
		super();
		this.id_reservation = id_reservation;
		this.id_voyageur = id_voyageur;
		this.id_trajet = id_trajet;
		this.place = place;
	}
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	

	}
	
	
	


