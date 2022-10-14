package interfaccia;

import database.Prodotti;
import logica.Scontrino;
import prodotti.Articolo;
import prodotti.Prodotto;

public class Bazar {
	
	public static void main(String[] args) {
		
		Prodotti.riempiProdotti();
		Scontrino sc1 = new Scontrino();
				
		mostraProdotti();
		
		sc1.addArticolo(new Articolo(Prodotti.getProdottoById(1), 2));	// aggiungo allo scontrino 2 oggetti Prodottp con codiceProdotto = 1
		sc1.addArticolo(new Articolo(Prodotti.getProdottoById(2), 4));	// aggiungo allo scontrino 4 oggetti Prodottp con codiceProdotto = 2
		sc1.addArticolo(new Articolo(Prodotti.getProdottoById(3), 1));	// aggiungo allo scontrino 1 oggetto Prodottp con codiceProdotto = 3
		sc1.addArticolo(new Articolo(Prodotti.getProdottoById(4), 3));	// aggiungo allo scontrino 3 oggetti Prodottp con codiceProdotto = 4
		sc1.addArticolo(new Articolo(Prodotti.getProdottoById(5), 2));	// aggiungo allo scontrino 2 oggetti Prodottp con codiceProdotto = 5
		
		System.out.println(sc1);
		
	}

	private static void mostraProdotti() {
		System.out.println("Elenco prodotti:");
		for (Prodotto p : Prodotti.getProdotti()) {
			System.out.println(p);
		}
	}
	
}