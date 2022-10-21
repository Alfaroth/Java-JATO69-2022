package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {
		
		File f = new File("files/gatti.txt");	// Prj02_LaboratorioJava/files/gatti.txt
		
		ArrayList<Gatto> gattile = new ArrayList<Gatto>();
		
		try {
			
			Scanner sc = new Scanner(f);	// Unhandled exception type FileNotFoundException - uso try/catch
			
			while(sc.hasNextLine()) {
				
				String rigaIntera = sc.nextLine();	// assegno a rigaIntera la riga del file di testo
				String[] dueEta = rigaIntera.split(",");	// uso la virgola come separatore
				
				String etaGatto = dueEta[0];	// assegno a etaGatto la stringa prima della virgola
				String etaUmano = dueEta[1];	// assegno a etaUmano la stringa dopo la virgola
				
				Gatto g = new Gatto(etaGatto, etaUmano);
				gattile.add(g);
				
				// System.out.println("Un gatto di " + etaGatto + " corrisponde a un umano di " + etaUmano + ".");
			
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 	
		
		System.out.println("Il gattile ha " + gattile.size() + " gatti.");
		for (Gatto gatto : gattile) {
			System.out.println(gatto);
		}
		
	}
	
}