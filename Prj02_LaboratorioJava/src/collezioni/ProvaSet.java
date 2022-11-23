package collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		
		String[] colori = {
				"rosso",
				"verde",
				"giallo",
				"blu",
				"arancione",
				"viola",
				"rosa",
		};
		
		Set<String> setColori = new HashSet<>(); // Set: esclude duplicati
		
		for (String colore : colori) {
			setColori.add(colore);			
		}
		
		Set<String> setColoriOrdinati = new TreeSet<>(setColori); // Set: esclude duplicati e ordina

		
		System.out.println("Ci sono " + setColori.size() + " colori:");
		
		for (String coloreLista : setColoriOrdinati) {
			System.out.println(coloreLista);		
		}
		
	}
	
}
