package programma;

import java.time.LocalDateTime;

import utenti.Utente;
import veicoli.Bicicletta;

public class Noleggio {

	private LocalDateTime data;
	private Utente user;
	private Bicicletta bici;
	private int inizio, fine;
	private double prezzo;
	private boolean pagato;
	
	// RClick > Source > Generate Constructor using Fields...
	public Noleggio(Utente user, Bicicletta bici, int inizio, int fine) {

		this.user = user;
		this.bici = bici;
		this.inizio = inizio;
		this.fine = fine;
		this.pagato = false;
		
	}
	
	public void pagamento() {
		
		this.data = LocalDateTime.now();
		this.pagato = true;
		
	}
	
	public double calcolaPrezzo() {

		double prezzoBici = this.bici.getPrezzoNoleggio();
		int oreUso = this.fine - this.inizio;
		this.prezzo = prezzoBici * oreUso;
		return this.prezzo;
		
	}
	
	// RClick > Source > Generate toString()...
	@Override
	public String toString() {
		return "Noleggio [data=" + data + ", user=" + user + ", bici=" + bici + ", inizio=" + inizio + ", fine=" + fine
				+ ", prezzo=" + prezzo + ", pagato=" + pagato + "]";
	}
	
}