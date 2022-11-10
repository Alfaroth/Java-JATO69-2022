package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RiempitoreTabellaLibri {

	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection conn = c.getConn();
		
        svuotaBiblioteca(conn);

		File f = new File("files/Biblioteca.csv");
		
		String queryRiempimento = "insert into biblioteca (codice, titolo) values (?,?)";
		
		try {
			// leggo il file: lancia eccezione
			Scanner scanner = new Scanner(f);
			
			while(scanner.hasNextLine()) {
				// scrivo sul db: lancia eccezione
				PreparedStatement ps = conn.prepareStatement(queryRiempimento);
				
				String riga = scanner.nextLine();
				String[] splitRow = riga.split(",");
				String codice = splitRow[0]; // la posizione 1 nel file .csv è quella che contiene il codice
				String titolo = splitRow[2]; // la posizione 3 nel file .csv è quella che contiene il titolo
				System.out.println(codice + ", \"" + titolo + "\"");
				ps.setString(1, codice); // secondo ?
				ps.setString(2, titolo); // primo ?
				ps.execute();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	private static void svuotaBiblioteca(Connection conn) {
		String queryTruncate = "truncate table biblioteca";
		
		try {
			Statement portaIstruzioneSQL = conn.createStatement();
			portaIstruzioneSQL.execute(queryTruncate);
			System.out.println("Eseguito.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
