package Beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Compte {
	
	public String bdemail = null;
	public String bdpsw = null;	
	public int bdid ;	
	public String bdnom ;	
	public String bdtype ;	
	
		
	

	public ArrayList<Compte> login(String email, String psw) {
		ArrayList<Compte> aC = new ArrayList<Compte>();
		ArrayList<Compte> aV = new ArrayList<Compte>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage", "root",
					"");
			String sqlC = "Select * from Conducteur where email = ? and psw = ?";
			String sqlV = "Select * from Voyageur where email = ? and psw = ?";

			PreparedStatement psC = (PreparedStatement) con.prepareStatement(sqlC);
			PreparedStatement psV = (PreparedStatement) con.prepareStatement(sqlV);


			psC.setString(1, email);
			psC.setString(2, psw);
			
			psV.setString(1, email);
			psV.setString(2, psw);

			ResultSet resC = psC.executeQuery();
			ResultSet resV = psV.executeQuery();
			

			while (resC.next()) {
				Compte m = new Compte();

				m.setBdemail(resC.getString("email"));
				m.setBdpsw(resC.getString("psw"));
				m.setBdid(resC.getInt("id_conducteur"));
				m.setBdNom(resC.getString("nom"));
				aC.add(m);

			}
			while (resV.next()) {
				Compte m = new Compte();

				m.setBdemail(resV.getString("email"));
				m.setBdpsw(resV.getString("psw"));
				m.setBdid(resV.getInt("id_voyageur"));
				m.setBdNom(resV.getString("nom"));

				aV.add(m);

			}
			

		} catch (Exception e) {
			System.out.println(" mahouch ga3edyconectili blem f login" + e.getMessage());
		}
		Compte m1 = new Compte();
		if(aC.size()>0) {
			m1.setBdType("Conducteur");
			aC.add(m1);
			return aC;
		}else {
			m1.setBdType("Voyageur");
			aV.add(m1);
			return aV;
			
		}
	}
	// _____________________________________________



	public String getBdType() {
		return bdtype;
	}



	public void setBdType(String bdtype) {
		this.bdtype = bdtype;
	}
	
	public String getBdemail() {
		return bdemail;
	}



	public void setBdemail(String bdemail) {
		this.bdemail = bdemail;
	}



	public String getBdpsw() {
		return bdpsw;
	}



	public void setBdpsw(String bdpsw) {
		this.bdpsw = bdpsw;
	}

	public String getBdNom() {
		return bdnom;
	}



	public void setBdNom(String bdnom) {
		this.bdnom = bdnom;
	}

	public int getBdid() {
		return bdid;
	}



	public void setBdid(int bdid) {
		this.bdid = bdid;
	}

}
