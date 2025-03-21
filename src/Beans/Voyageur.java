package Beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Voyageur {
	private int id_voyageur;
	private String bdnom = null;
	private String bdprenom = null;
	private String bddate_nais = null;
	private String bdemail = null;
	private String bdtype = null;
	private String bdpsw = null;
	private String photo = "";
	
	
	
		public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
		public int getId_voyageur() {
		return id_voyageur;
	}
	public void setId_voyageur(int id_voyageur) {
		this.id_voyageur = id_voyageur;
	}

		
	
		 public String getBdnom() {
			return bdnom;
		}
		public void setBdnom(String bdnom) {
			this.bdnom = bdnom;
		}

		public String getBdprenom() {
			return bdprenom;
		}
		public void setBdprenom(String bdprenom) {
			this.bdprenom = bdprenom;
		}

		public String getBddate_nais() {
			return bddate_nais;
		}
		public void setBddate_nais(String bddate_nais) {
			this.bddate_nais = bddate_nais;
		}

		public String getBdemail() {
			return bdemail;
		}
		public void setBdemail(String bdemail) {
			this.bdemail = bdemail;
		}

		public String getBdtype() {
			return bdtype;
		}
		public void setBdtype(String bdtype) {
			this.bdtype = bdtype;
		}

		public String getBdpsw() {
			return bdpsw;
		}
		public void setBdpsw(String bdpsw) {
			this.bdpsw = bdpsw;
		}
		
		public Voyageur() {
			
		}
		
		public Voyageur(int id_voyageur, String bdnom, String bdprenom, String bddate_nais, String bdemail,
				String bdtype, String bdpsw,String photo) {
			super();
			this.id_voyageur = id_voyageur;
			this.bdnom = bdnom;
			this.bdprenom = bdprenom;
			this.bddate_nais = bddate_nais;
			this.bdemail = bdemail;
			this.bdtype = bdtype;
			this.bdpsw = bdpsw;
			this.photo = photo;
		}
		public void InscrireVoyageur(String nom,String prenom,String date_nais, String mail , String type , String psw,String photo ){
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
				
				String sql = "insert into voyageur (nom , prenom , date_nais , email ,type, psw, photo ) values (?,?,?,?,?,?,?) ";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				
				ps.setString(1, nom);
				ps.setString(2, prenom);
				ps.setString(3, date_nais);
				ps.setString(4, mail);
				ps.setString(5, type);
				ps.setString(6, psw);
				ps.setString(7, photo);
				
				ps.executeUpdate();

			} catch (ClassNotFoundException e) {
				System.out.println("mawech ga3ed yansiri -_-"+ e.getMessage());
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
		//-----------------------------------------------------------------------------------------------------
		
		// select idvoyageur
		
		
		
		
		
		public ArrayList<Voyageur> selecetIDVoyageur(int idV) {
			ArrayList<Voyageur> a1 = new ArrayList<Voyageur>();

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
				

				String sql = "SELECT * FROM voyageur WHERE id_voyageur='"+idV+"'";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				
				ResultSet res = ps.executeQuery();


				while (res.next()) {
					Voyageur tr = new Voyageur();

					tr.selecetIDVoyageur(res.getInt("id"));
					tr.setBdnom(res.getString("nom"));
					tr.setBdprenom(res.getString("prenom"));
					

					a1.add(tr);
				}

				ps.executeUpdate();
				System.out.println("freelancer, bien ga3ed yansirif  a sidi hamdoulah LOL");
			} catch (Exception e) {
				System.out.println("freelancer, mahouch ga3ed yinsiri" + e.getMessage());

			}
			return a1;
		}
		//------------------------------------------------------------------------------------------------

				// la suppresion

				public void SupprimerVoyageur(int id_voyageur) {

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
								"");
						
				System.out.println("m1");
						String sql = "delete from voyageur where id_voyageur=?";
						PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
						System.out.println("m2");
						ps.setInt(1, id_voyageur);
					
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
					
					public void ModifierProfil(int id_voyageur,String nom ,String prenom ,String date_nais ,String email ,String type,String psw ){

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
									"");
					System.out.println("m1");
							String sql = "update `voyageur` set `id_voyageur`=?,`nom`=?,`prenom`=?,`date_nais`=?,`email`=?,`type`=?,`psw`=?";
							PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
							System.out.println("m2");
							ps.setString(1, nom);
							ps.setString(2, prenom);
							ps.setString(3, date_nais);
							ps.setString(4, email);
							ps.setString(5, type);
							ps.setString(6, psw);
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
					public ArrayList<Voyageur> ToutLesVoyageurs() {
						ArrayList<Voyageur> a1 = new ArrayList<Voyageur>();

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
									"");
							String sql = "Select * from Voyageur";
							PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

							ResultSet res = ps.executeQuery();

							while (res.next()) {
								Voyageur voy = new Voyageur();

								voy.setId_voyageur(res.getInt("id_voyageur"));
								voy.setBdnom(res.getString("nom"));
								voy.setBdprenom(res.getString("prenom"));
								voy.setBddate_nais(res.getString("date_nais"));
								voy.setBdemail(res.getString("email"));
								voy.setBdtype(res.getString("type"));
								voy.setBdpsw(res.getString("psw"));

								a1.add(voy);
							}

						} catch (Exception e) {
							System.out.println("client, mahouch ga3edyconectili blem f login" + e.getMessage());

						}
						return (a1);
					}

}
