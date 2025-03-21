package Beans;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Trajet {
	
	
	private int id_trajet;
	private String lieu_départ;
	private String lieu_arrivée;
	private String heure_départ;
	private String date_départ;
	private float prix;
	private int place;
	private int id_trajetpropose;
	
	


	public int getId_trajetpropose() {
		return id_trajetpropose;
	}
	public void setId_trajetpropose(int id_trajetpropose) {
		this.id_trajetpropose = id_trajetpropose;
	}
	public int getId_trajet() {
		return id_trajet;
	}
	public void setId_trajet(int id_trajet) {
		this.id_trajet = id_trajet;
	}
	
	public String getLieu_départ() {
		return lieu_départ;
	}



	public void setLieu_départ(String lieu_départ) {
		this.lieu_départ = lieu_départ;
	}



	public String getLieu_arrivée() {
		return lieu_arrivée;
	}



	public void setLieu_arrivée(String lieu_arrivée) {
		this.lieu_arrivée = lieu_arrivée;
	}



	public String getHeure_départ() {
		return heure_départ;
	}



	public void setHeure_départ(String heure_départ) {
		this.heure_départ = heure_départ;
	}



	public String getDate_départ() {
		return date_départ;
	}



	public void setDate_départ(String date_départ) {
		this.date_départ = date_départ;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}



	public int getPlace() {
		return place;
	}



	public void setPlace(int place) {
		this.place = place;
	}



	public Trajet() {
	}
	
public Trajet( String lieu_départ, String lieu_arrivée, String heure_départ, String date_départ,
			float prix, int place) {
		super();
		
		this.lieu_départ = lieu_départ;
		this.lieu_arrivée = lieu_arrivée;
		this.heure_départ = heure_départ;
		this.date_départ = date_départ;
		this.prix = prix;
		this.place = place;
}
public Trajet( String lieu_départ, String lieu_arrivée, String heure_départ, String date_départ) {
	super();
	
	this.lieu_départ = lieu_départ;
	this.lieu_arrivée = lieu_arrivée;
	this.heure_départ = heure_départ;
	this.date_départ = date_départ;
	
}

//public ArrayList<Trajet> SelectionClientAnonnce(String idC) {
//	ArrayList<Trajet> a1 = new ArrayList<Trajet>();
//
//	try {
//		
//		
//		String sql = "Select * from Trajet  where id_client='"+idC+"'";
//		PreparedStatement ps = con.prepareStatement(sql);
//
//		ResultSet res = ps.executeQuery();
//
//		while (res.next()) {
//			Trajet m = new Trajet();
//
//			m.setBdId_Trajet(res.getString("id_Trajet"));
//			m.setBdTitre(res.getString("titre"));
//			m.setBdDelai(res.getString("delai"));
//			m.setBdBudget(res.getString("budget"));
//			m.setBdType_annoce(res.getString("type_Trajet"));
//			m.setBdType_payment(res.getString("type_payment"));
//			m.setBdDescription(res.getString("description"));
//			m.setBdDate_P(res.getString("date_P"));
//			a1.add(m);
//		}
//
//	} catch (Exception e) {
//		System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());
//
//	}
//	return (a1);
//}

public ArrayList<Trajet> ToutLesTrajet() {
	ArrayList<Trajet> a1 = new ArrayList<Trajet>();

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
		String sql = "Select * from trajet";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

		ResultSet res = ps.executeQuery();

		while (res.next()) {
			Trajet trj = new Trajet();

			trj.setId_trajet(res.getInt("id_trajet"));
			trj.setLieu_départ(res.getString("lieu_depart"));
			trj.setLieu_arrivée(res.getString("lieu_arrivée"));
			trj.setHeure_départ(res.getString("heure_depart"));
			trj.setDate_départ(res.getString("date_depart"));
			trj.setPrix(res.getFloat("prix"));
			trj.setPlace(res.getInt("place"));

			a1.add(trj);
		}

	} catch (Exception e) {
		System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

	}
	return (a1);
}

public ArrayList<Trajet> ToutLesTrajetProposes() {
	ArrayList<Trajet> a2 = new ArrayList<Trajet>();

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
		String sql = "Select * from trajetsproposes ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

		ResultSet res = ps.executeQuery();

		while (res.next()) {
			Trajet trj = new Trajet();

			trj.setId_trajet(res.getInt("id_trajetpropose"));
			trj.setLieu_départ(res.getString("lieu_depart"));
			trj.setLieu_arrivée(res.getString("lieu_arrivée"));
			trj.setHeure_départ(res.getString("heure_depart"));
			trj.setDate_départ(res.getString("date_depart"));
			

			a2.add(trj);
		}

	} catch (Exception e) {
		System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

	}
	return (a2);
}

public void AjouterTrajet(String lieu_départ, String lieu_arrivée, String heure_depart, String date_depart,
		 float prix, int place , int id_con) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
System.out.println("m1");
		String sql = "insert into trajet (lieu_depart , lieu_arrivée , heure_depart , date_depart , prix, place) values (?,?,?,?,?,?) ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		System.out.println("m2");
		ps.setString(1, lieu_départ);
		ps.setString(2, lieu_arrivée);
		ps.setString(3, heure_depart);
		ps.setString(4, date_depart);
		ps.setFloat(5, prix);
		ps.setInt(6, place);
		System.out.println("heure depart "+heure_départ+" and " +heure_depart);
		System.out.println("m3");
		ps.executeUpdate();
		System.out.println("m4");
		System.out.println("il a bien ajoute  ;)");
	} catch (ClassNotFoundException e) {
		System.out.println("il n'ajoute pas -_-");
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
public void ProposerTrajet(String lieu_départ, String lieu_arrivée, String heure_depart, String date_depart) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
System.out.println("m1");
		String sql = "insert into trajetsproposes(lieu_depart , lieu_arrivée , heure_depart , date_depart ) values (?,?,?,?) ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		System.out.println("m2");
		ps.setString(1, lieu_départ);
		ps.setString(2, lieu_arrivée);
		ps.setString(3, heure_depart);
		ps.setString(4, date_depart);
		
		System.out.println("heure depart "+heure_départ+" and " +heure_depart);
		System.out.println("m3");
		ps.executeUpdate();
		System.out.println("m4");
		System.out.println("il a bien ajoute  ;)");
	} catch (ClassNotFoundException e) {
		System.out.println("il n'ajoute pas -_-");
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	//------------------------------------------------------------------------------------------------

	// la suppresion

	public void SupprimerTrajet(int id_trajet) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");
			
	System.out.println("m1");
			String sql = "delete from trajet where id_trajet=?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			System.out.println("m2");
			ps.setInt(1, id_trajet);
		
			System.out.println("m3");
			ps.executeUpdate();
			System.out.println("m4");
			System.out.println("il a bien supprime  ;)");

		} catch (ClassNotFoundException e) {
			System.out.println("il ne supprime pas -_-"+ e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		
	}}

	//-----------------------------------------------------------------------------------------------------
		
		// la modification
		
		public void modifierTrajet(int id_trajet,String lieu_départ,String lieu_arrivée,String heure_départ,String date_départ,float prix,int place){

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
		System.out.println("m1");
				String sql = "update `trajet` set `id_trajet`=?,`lieu_depart`=?,`lieu_arrivée`=?,`heure-depart`=?,`date_depart`=?,`prix`=?,`place`=?";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				System.out.println("m2");
				ps.setString(1, lieu_départ);
				ps.setString(2, lieu_arrivée);
				ps.setString(3, heure_départ);
				ps.setString(4, date_départ);
				ps.setFloat(5, prix);
				ps.setInt(6, place);
				System.out.println("m3");
				ps.executeUpdate();
				System.out.println("m4");
			} catch (ClassNotFoundException e) {
				System.out.println("il ne change pas -_-"+ e.getMessage());
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		}
	//-------------------------------------------------------------------------------------------------------
		
		// la recherche
		
		 public ArrayList<Trajet> rechercheTrajet(){
			 
			 ArrayList<Trajet> trajets_trouvés = new ArrayList<>();
			 // java.sql.Date date=new java.sql.Date(this.getDate_départ().getTime());
		        Trajet trajetR ;
			 
		        try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
			System.out.println("m1");
					String sql = "SELECT * FROM trajet WHERE lieu_depart='"+this.getLieu_départ()+"'" +
			                " AND lieu_arrivée='"+this.getLieu_arrivée()+"'" + " AND  date_depart='"+this.getDate_départ()+"' AND place>0 AND date_depart>CURRENT_DATE ;";  
					
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
					ResultSet resSet = ps.executeQuery();
					System.out.println("m2");
					
					 while (resSet.next()) {
			                trajetR=new Trajet();

			                trajetR.setId_trajet(resSet.getInt(1));
			                trajetR.setLieu_départ(resSet.getString(2));
			                trajetR.setLieu_arrivée(resSet.getString(3));
			                trajetR.setHeure_départ(resSet.getString(4));
			                trajetR.setDate_départ(resSet.getString(5));
			                trajetR.setPrix(resSet.getFloat(6));
			                trajetR.setPlace(resSet.getInt(7));

			                trajets_trouvés.add(trajetR);
					
					 }
					System.out.println("m3");
					ps.executeUpdate();
					System.out.println("m4");
				} catch (ClassNotFoundException e) {
					System.out.println("il ne change pas -_-");
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		return trajets_trouvés;
		        
		 }
		
		 public ArrayList<Trajet> RechercheTrajet(String de , String A , String date ) {
			 
				ArrayList<Trajet> a1 = new ArrayList<Trajet>();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
					String sql = "Select * from trajet where lieu_depart like '%"+de+"%' and lieu_arrivée like '%"+A+"%' and date_depart like '%"+date+"%'";
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

					ResultSet res = ps.executeQuery();

					while (res.next()) {
						Trajet trj = new Trajet();

						trj.setId_trajet(res.getInt("id_trajet"));
						trj.setLieu_départ(res.getString("lieu_depart"));
						trj.setLieu_arrivée(res.getString("lieu_arrivée"));
						trj.setHeure_départ(res.getString("heure_depart"));
						trj.setDate_départ(res.getString("date_depart"));
						trj.setPrix(res.getFloat("prix"));
						trj.setPlace(res.getInt("place"));

						a1.add(trj);
					}
					System.out.println("RechercheTrajet, bien executer");
				} catch (Exception e) {
					System.out.println("RechercheTrajet, method class trajet ligne433" + e.getMessage());

				}
				return (a1);
			}



		 public ArrayList<Trajet> SelectionConducteurTrajet(int idC) {
				ArrayList<Trajet> a1 = new ArrayList<Trajet>();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");

					String sql = "Select * from trajet  where id_conducteur='"+idC+"'";
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

					ResultSet res = ps.executeQuery();

					while (res.next()) {
						Trajet trj = new Trajet();

						trj.setId_trajet(res.getInt("id_trajet"));
						trj.setLieu_départ(res.getString("lieu_depart"));
						trj.setLieu_arrivée(res.getString("lieu_arrivée"));
						trj.setHeure_départ(res.getString("heure_depart"));
						trj.setDate_départ(res.getString("date_depart"));
						trj.setPrix(res.getFloat("prix"));
						trj.setPlace(res.getInt("place"));

						a1.add(trj);
						System.out.println("les trajets du conducteur bien affichés !");
					}

				} catch (Exception e) {
					System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

				}
				return (a1);
			}


		 public static ArrayList<Trajet> SelectionIDTrajet(int idTrajet) {
				ArrayList<Trajet> a1 = new ArrayList<Trajet>();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");

					String sql = "Select * from trajet  where id_trajet='"+idTrajet+"'";
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

					ResultSet res = ps.executeQuery();

					while (res.next()) {
						Trajet trj = new Trajet();

						trj.setId_trajet(res.getInt("id_trajet"));
						trj.setLieu_départ(res.getString("lieu_depart"));
						trj.setLieu_arrivée(res.getString("lieu_arrivée"));
						trj.setHeure_départ(res.getString("heure_depart"));
						trj.setDate_départ(res.getString("date_depart"));
						trj.setPrix(res.getFloat("prix"));
						trj.setPlace(res.getInt("place"));

						a1.add(trj);
						System.out.println("id trajet bien selectionné !");
					}
				} catch (Exception e) {
					System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

				}
				return (a1);
			}
		 
		 
		 
		 static public int NbrPlace(int id_trajet) {
				int a=100;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");

					
					String sql2="SELECT place FROM `trajet` WHERE id_trajet='"+id_trajet+"'";
			
					PreparedStatement ps2 = (PreparedStatement) con.prepareStatement(sql2);
					
			
					ResultSet res2 = ps2.executeQuery();

				 
					res2.next(); 
					
					a=res2.getInt(1);

				} catch (Exception e) {
					System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

				}
				System.out.println("tajet "+id_trajet+" "+a);
				return a;
			
			}




}

