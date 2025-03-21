package Database;

import java.sql.*;

public class Connexion {
	
	public Connection conex=null;
	public Statement stmnt=null;
	public ResultSet rs=null;
	
	public Connexion() {
		
		try{
			Class.forName( "com.mysql.jdbc.Driver" );
			}
		catch(ClassNotFoundException ex){
			System.out.println("Erreur de Cnx Avec Driver");
			}	
		try{
			conex=DriverManager.getConnection("jdbc:mysql://localhost:3306/covoiturage","root","");
			stmnt=conex.createStatement();
			}
		catch(SQLException ignore){
			System.out.println("ignored");	
			}			
	}
}


