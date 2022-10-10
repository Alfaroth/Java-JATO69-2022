package programma;

import utenti.Utente;
import veicoli.Bicicletta;

public class NoleggioTest {

	public static void main(String[] args) {
		
		Bicicletta b1 = new Bicicletta();
		b1.setNome("Alessia");
		b1.setPrezzoNoleggio(6);
		
		Utente u1 = new Utente("Valentina");
		
		Noleggio n1 = new Noleggio(u1, b1, 10, 15);		// l'utente u1 ha usato la bici b1 dalle 10:00 alle 15:00
		System.out.println("Il prezzo del noleggio è " + n1.calcolaPrezzo() + "€.");
		
		n1.pagamento();
		
		System.out.println(n1);
	}
	
}
