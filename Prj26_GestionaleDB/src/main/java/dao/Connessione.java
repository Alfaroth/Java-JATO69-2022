package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/gestionale";	// ponte tra java e database
	private final String USER = "app_java";
	private final String PASS = "java_2022!";
	
	private Connection conn = null;
	
	public Connection getConn() {	
		if (conn == null) {
			connetti();
		}
		return conn;
	}
	
	private void connetti() {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connessione aperta.");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e.getMessage());
		}
	}
	
	public void disconnetti() {
		
		if (conn != null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				System.err.println("Si è verificato un errore: " + e.getMessage());
			}
			
		} else {
			System.out.println("Sei già disconnesso.");
		}
		
		System.out.println("Connessione chiusa.");
		
	}
	
}