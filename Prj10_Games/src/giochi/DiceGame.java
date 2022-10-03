package giochi;

public class DiceGame {

	static Dado d1 = new Dado();	// primo costruttore di Dado senza argomenti
	static Dado d2 = new Dado();
	// static Dado d3 = new Dado(20);	// secondo costruttore di Dado con argomento 20
	static int successi = 0;
	
	public static String play() {
		
		String risultato = null;
		
		d1.lancia();
		d2.lancia();
		// d3.lancia();
		
		System.out.print("Hai rollato " + d1.getFaccia() + " e " + d2.getFaccia() + ", ");
		
		if (d1.getFaccia() == d2.getFaccia()) {
			risultato = "hai vinto!";
			successi++;
		} else {
			risultato = "hai perso...";
		}
		
		return risultato;
		
	}
	
	public static void main(String[] args) {
		
		int tentativi = 1_000_000; 	// posso usare _ per separare le migliaia in numeri grandi
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < tentativi; i++) {
			System.out.println(play());
		}
		
		long stop = System.currentTimeMillis();
		double percentuale = (double)successi/tentativi;
		System.out.println("Hai vinto " + successi + " volte su " + tentativi + ", il " + (percentuale*100) + "% delle volte.");
		System.out.println("L'elaborazione è durata " + (stop-start) + "ms.");
		
	}

} 
