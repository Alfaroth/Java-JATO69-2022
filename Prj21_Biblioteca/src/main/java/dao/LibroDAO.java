package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Libro;

public class LibroDAO {

	private Connessione connessione = new Connessione();
	private Connection conn;
	
	private Statement statement;
	private ResultSet rs;
	
	public void addLibro(Libro l) {
		String titolo = l.getTitolo();
		String query = "insert into libri (titolo) values (\"" + titolo + "\")";
		
		this.conn = connessione.getConn();
		try {
			this.statement = this.conn.createStatement();
			this.statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
