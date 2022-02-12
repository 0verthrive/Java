package Processo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/test";
		final String user ="root";
		final String password ="Pipinha";
		final String driverBanco = "org.gjt.mm.mysql.Driver";
		final String incluir = "INSERT INTO pessoa(ID, nome) VALUES(?,?)";
		
		try {
			Class.forName(driverBanco);
			
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement(incluir);
			ps.setInt(1, 10);
			ps.setString(2, "Danilo");
			ps.executeUpdate();
			
			System.out.println("Entrou");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
