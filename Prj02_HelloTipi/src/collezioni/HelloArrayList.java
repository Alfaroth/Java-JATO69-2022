package collezioni;

import java.util.ArrayList;

public class HelloArrayList {

	public static void main(String[] args) {

		ArrayList<String> prodotti = new ArrayList<>();
		
		prodotti.add("scarpe");					// aggiunge un nuovo elemento alla fine dell'ArrayList
		prodotti.add("maglie");
		
		System.out.println(prodotti);			// stampa l'ArrayList 
		System.out.println(prodotti.size());	// dimensione dell'ArrayList
		System.out.println(prodotti.get(0));	// elemento in posizione 0
		
		prodotti.clear();						// svuota l'ArrayList
		
		System.out.println(prodotti);
		
		prodotti.add("scarpe");
		prodotti.add("maglie");
		
		prodotti.remove(0);						// rimuove l'elemento in posizione 0
		
		System.out.println(prodotti);

		prodotti.add("scarpe");

		for (String prodotto : prodotti) {		// stampa in ordine gli elementi dell'ArrayList
			System.out.println(prodotto);
		}
		
	}

}