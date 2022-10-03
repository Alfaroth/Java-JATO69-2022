package giochi;

public class Dado {

	// stato interno della classe
	private int facce;
	private int faccia;
	// --------------------------
	
	public Dado() {		// costruttore dado standard d6
		
		facce = 6;
		faccia = 1;
		System.out.println("Dado standard inizializzato.");
		
	}
	
	public Dado (int facce) { 	// costruttore dado custom
		
		this.facce = facce;
		faccia = 1;
		System.out.println("Dado custom inizializzato.");
		
	}
	
	public void lancia() {
		
		int risultato = (int)((Math.random()*facce)+1);		// intero casuale tra 1 e 6
		faccia = risultato;
		
	}
	
	public int getFaccia() {
		
		return faccia;
		
	}
	
}
