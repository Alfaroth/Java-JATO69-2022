package programma;

import utenti.Utente;
import veicoli.Bicicletta;

public class NoleggioTestEvo {

	public static void main(String[] args) {
		
		Bicicletta[] biciclette = {
				new Bicicletta(),
				new Bicicletta("Super Bike", 35),
				new Bicicletta("Electric Bike Super", 75)
		};
		
		Utente[] utenti = {
				new Utente("Luca"),
				new Utente("Federico"),
				new Utente("Noemi")
		};
		
		for (int i = 0; i < utenti.length; i++) {

			Noleggio n = new Noleggio(utenti[i], biciclette[i], 10, 15);
			n.calcolaPrezzo();
			n.pagamento();
			System.out.println(n);
			
		}
		
	}
	
}