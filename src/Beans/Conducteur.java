package Beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Conducteur  {
	private int id_conducteur=0;
	private String bdnom = null;
	private String bdprenom = null;
	private String bddate_nais = null;
	private String bdemail = null;
	private String bdtype = null;
	private String bdpsw = null;
	private String photo = "";
	
	 public Conducteur(){}
	
	
	 public Conducteur(int id_conducteur, String bdnom, String bdprenom, String bddate_nais, String bdemail,
			String bdtype, String bdpsw, String photo) {
		super();
		this.id_conducteur = id_conducteur;
		this.bdnom = bdnom;
		this.bdprenom = bdprenom;
		this.bddate_nais = bddate_nais;
		this.bdemail = bdemail;
		this.bdtype = bdtype;
		this.bdpsw = bdpsw;
		this.photo = photo;
	}
	 
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getId_conducteur() {
		return id_conducteur;
	}
	public void setId_conducteur(int id_conducteur) {
		this.id_conducteur = id_conducteur;
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
	public Conducteur( String bdnom, String bdprenom, String bddate_nais, String bdemail,
			String bdtype, String bdpsw) {
		super();
	
		this.bdnom = bdnom;
		this.bdprenom = bdprenom;
		this.bddate_nais = bddate_nais;
		this.bdemail = bdemail;
		this.bdtype = bdtype;
		this.bdpsw = bdpsw;
		
	}
	
	
	public void InscrireConducteur(String nom, String prenom, String date_nais, String mail, String type, String psw,String photo) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");

			String sql = "insert into conducteur (nom , prenom , date_nais , email ,type, psw , photo) values (?,?,?,?,?,?,?) ";
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
			System.out.println("mawech ga3ed yansiri -_-");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//------------------------------------------------------------------------------------------------

		// la suppresion

		public void SupprimerConducteur(int id_conducteur) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
						"");
				
		System.out.println("m1");
				String sql = "delete from conducteur where id_conducteur=?";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				System.out.println("m2");
				ps.setInt(1, id_conducteur);
			
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
			
			public void ModifierProfil(int id_conducteur,String nom ,String prenom ,String date_nais ,String email ,String type,String psw ){

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
			System.out.println("m1");
					String sql = "update `conducteur` set `id_conducteur`=?,`nom`=?,`prenom`=?,`date_nais`=?,`email`=?,`type`=?,`psw`=?";
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
			//Tout les conducteurs

			
			//-------------------------------------------------------------------------------------------------------
			//select Id conducteur
			
			
			public ArrayList<Conducteur> selecetIDConducteur(int idC) {
				ArrayList<Conducteur> a1 = new ArrayList<Conducteur>();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
							"");
					

					String sql = "SELECT * FROM conducteur WHERE id_conducteur='"+idC+"'";
					PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
					
					ResultSet res = ps.executeQuery();


					while (res.next()) {
						Conducteur tr = new Conducteur();

						tr.selecetIDConducteur(res.getInt("id"));
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
			
			
}