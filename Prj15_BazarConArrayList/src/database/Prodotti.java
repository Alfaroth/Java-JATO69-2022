package database;

import java.util.ArrayList;

import prodotti.Prodotto;

public class Prodotti {

	private static ArrayList<Prodotto> prodotti = new ArrayList<>();
	
	public static void riempiProdotti() {
		
		String[] prodottiFake = {
				"Maglia rossa", "Maglia blu", "Maglia verde", "Giacca gialla", "Pantalone nero"
		};
		
		for (int i = 0; i < prodottiFake.length; i++) {
			
			int codProdotto = i+1;
			String nomeProdotto = prodottiFake[i];
			double prezzoProdotto = (Math.random()*25);
			
			Prodotto p = new Prodotto(codProdotto, nomeProdotto, prezzoProdotto);
			addProdotto(p);
			
		}
		
	}
	
	public static void svuotaProdotti() {
		prodotti.clear();
	}
	
	public static void addProdotto(Prodotto p) {
		prodotti.add(p);
	}
	
	public static Prodotto getProdottoById(int codProdotto) { 
		
		for (Prodotto prodotto : prodotti) {
			
			if (prodotto.getCodiceProdotto() == codProdotto) {
				return prodotto;
			}
			
		}
		
		return null;
		
	}
	
	public static void removeProdotto(int codProdotto) {
		
		Prodotto trovato = getProdottoById(codProdotto);
		
		if(trovato != null) {
			prodotti.remove(trovato);
		}
		
	}
	
	public static void removeProdottoByPos(int pos) {
		prodotti.remove(pos);
	}
		
	/**
	 * Il metodo restituisce tutti i prodotti nel db.
	 * @return ArrayList di oggetti di tipo Prodotto.
	 */
	public static ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}
	
}