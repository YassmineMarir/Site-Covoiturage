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
	private String lieu_d�part;
	private String lieu_arriv�e;
	private String heure_d�part;
	private String date_d�part;
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
	
	public String getLieu_d�part() {
		return lieu_d�part;
	}



	public void setLieu_d�part(String lieu_d�part) {
		this.lieu_d�part = lieu_d�part;
	}



	public String getLieu_arriv�e() {
		return lieu_arriv�e;
	}



	public void setLieu_arriv�e(String lieu_arriv�e) {
		this.lieu_arriv�e = lieu_arriv�e;
	}



	public String getHeure_d�part() {
		return heure_d�part;
	}



	public void setHeure_d�part(String heure_d�part) {
		this.heure_d�part = heure_d�part;
	}



	public String getDate_d�part() {
		return date_d�part;
	}



	public void setDate_d�part(String date_d�part) {
		this.date_d�part = date_d�part;
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
	
public Trajet( String lieu_d�part, String lieu_arriv�e, String heure_d�part, String date_d�part,
			float prix, int place) {
		super();
		
		this.lieu_d�part = lieu_d�part;
		this.lieu_arriv�e = lieu_arriv�e;
		this.heure_d�part = heure_d�part;
		this.date_d�part = date_d�part;
		this.prix = prix;
		this.place = place;
}
public Trajet( String lieu_d�part, String lieu_arriv�e, String heure_d�part, String date_d�part) {
	super();
	
	this.lieu_d�part = lieu_d�part;
	this.lieu_arriv�e = lieu_arriv�e;
	this.heure_d�part = heure_d�part;
	this.date_d�part = date_d�part;
	
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
			trj.setLieu_d�part(res.getString("lieu_depart"));
			trj.setLieu_arriv�e(res.getString("lieu_arriv�e"));
			trj.setHeure_d�part(res.getString("heure_depart"));
			trj.setDate_d�part(res.getString("date_depart"));
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
			trj.setLieu_d�part(res.getString("lieu_depart"));
			trj.setLieu_arriv�e(res.getString("lieu_arriv�e"));
			trj.setHeure_d�part(res.getString("heure_depart"));
			trj.setDate_d�part(res.getString("date_depart"));
			

			a2.add(trj);
		}

	} catch (Exception e) {
		System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

	}
	return (a2);
}

public void AjouterTrajet(String lieu_d�part, String lieu_arriv�e, String heure_depart, String date_depart,
		 float prix, int place , int id_con) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
System.out.println("m1");
		String sql = "insert into trajet (lieu_depart , lieu_arriv�e , heure_depart , date_depart , prix, place) values (?,?,?,?,?,?) ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		System.out.println("m2");
		ps.setString(1, lieu_d�part);
		ps.setString(2, lieu_arriv�e);
		ps.setString(3, heure_depart);
		ps.setString(4, date_depart);
		ps.setFloat(5, prix);
		ps.setInt(6, place);
		System.out.println("heure depart "+heure_d�part+" and " +heure_depart);
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
public void ProposerTrajet(String lieu_d�part, String lieu_arriv�e, String heure_depart, String date_depart) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
				"");
System.out.println("m1");
		String sql = "insert into trajetsproposes(lieu_depart , lieu_arriv�e , heure_depart , date_depart ) values (?,?,?,?) ";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		System.out.println("m2");
		ps.setString(1, lieu_d�part);
		ps.setString(2, lieu_arriv�e);
		ps.setString(3, heure_depart);
		ps.setString(4, date_depart);
		
		System.out.println("heure depart "+heure_d�part+" and " +heure_depart);
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
		
		public void modifierTrajet(int id_trajet,String lieu_d�part,String lieu_arriv�e,String heure_d�part,String date_d�part,float prix,int place){

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
		System.out.println("m1");
				String sql = "update `trajet` set `id_trajet`=?,`lieu_depart`=?,`lieu_arriv�e`=?,`heure-depart`=?,`date_depart`=?,`prix`=?,`place`=?";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				System.out.println("m2");
				ps.setString(1, lieu_d�part);
				ps.setString(2, lieu_arriv�e);
				ps.setString(3, heure_d�part);
				ps.setString(4, date_d�part);
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
			 
			 ArrayList<Trajet> trajets_trouv�s = new ArrayList<>();
			 // java.sql.Date date=new java.sql.Date(this.getDate_d�part().getTime());
		        Trajet trajetR ;
			 
		        try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
			System.out.println("m1");
					String sql = "SELECT * FROM trajet WHERE lieu_depart='"+this.getLieu_d�part()+"'" +
			                " AND lieu_arriv�e='"+this.getLieu_arriv�e()+"'" + " AND  date_depart='"+this.getDate_d�part()+"' AND place>0 AND date_depart>CURRENT_DATE ;";  
					
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
					ResultSet resSet = ps.executeQuery();
					System.out.println("m2");
					
					 while (resSet.next()) {
			                trajetR=new Trajet();

			                trajetR.setId_trajet(resSet.getInt(1));
			                trajetR.setLieu_d�part(resSet.getString(2));
			                trajetR.setLieu_arriv�e(resSet.getString(3));
			                trajetR.setHeure_d�part(resSet.getString(4));
			                trajetR.setDate_d�part(resSet.getString(5));
			                trajetR.setPrix(resSet.getFloat(6));
			                trajetR.setPlace(resSet.getInt(7));

			                trajets_trouv�s.add(trajetR);
					
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
		return trajets_trouv�s;
		        
		 }
		
		 public ArrayList<Trajet> RechercheTrajet(String de , String A , String date ) {
			 
				ArrayList<Trajet> a1 = new ArrayList<Trajet>();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
					String sql = "Select * from trajet where lieu_depart like '%"+de+"%' and lieu_arriv�e like '%"+A+"%' and date_depart like '%"+date+"%'";
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

					ResultSet res = ps.executeQuery();

					while (res.next()) {
						Trajet trj = new Trajet();

						trj.setId_trajet(res.getInt("id_trajet"));
						trj.setLieu_d�part(res.getString("lieu_depart"));
						trj.setLieu_arriv�e(res.getString("lieu_arriv�e"));
						trj.setHeure_d�part(res.getString("heure_depart"));
						trj.setDate_d�part(res.getString("date_depart"));
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
						trj.setLieu_d�part(res.getString("lieu_depart"));
						trj.setLieu_arriv�e(res.getString("lieu_arriv�e"));
						trj.setHeure_d�part(res.getString("heure_depart"));
						trj.setDate_d�part(res.getString("date_depart"));
						trj.setPrix(res.getFloat("prix"));
						trj.setPlace(res.getInt("place"));

						a1.add(trj);
						System.out.println("les trajets du conducteur bien affich�s !");
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
						trj.setLieu_d�part(res.getString("lieu_depart"));
						trj.setLieu_arriv�e(res.getString("lieu_arriv�e"));
						trj.setHeure_d�part(res.getString("heure_depart"));
						trj.setDate_d�part(res.getString("date_depart"));
						trj.setPrix(res.getFloat("prix"));
						trj.setPlace(res.getInt("place"));

						a1.add(trj);
						System.out.println("id trajet bien selectionn� !");
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

