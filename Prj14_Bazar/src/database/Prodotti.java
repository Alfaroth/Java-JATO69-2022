package database;

import prodotti.Prodotto;

public class Prodotti {

	/**
	 * Il metodo restituisce tutti i prodotti nel db.
	 * @return array di oggetti di tipo Prodotto.
	 */
	public static Prodotto[] getProdotti() {
		
		Prodotto[] prodotti = {
				new Prodotto(1, "Chitarra Music Man Petrucci", 3799.00),
				new Prodotto(2, "Batteria TAMA Imperialstar", 839.99),
				new Prodotto(3, "Basso Ibanez", 699.99),
				new Prodotto(4, "Plugin Archetype Gojira", 129.00),
				new Prodotto(5, "Modulo batteria Yamaha EAD10", 556.00)
		};
		
		return prodotti;
		
	}
	
}