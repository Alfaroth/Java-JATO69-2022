package esercizi;

// Scrivi un loop che itera da 0 a 15. Per ogni ciclo controlla se il numero è pari o dispari. Mostra il risultato in console.

public class PariDispari {

	public static void main(String[] args) {
		
		for (int i=0; i<=15; i++) {
			
			if (i%2==0) System.out.println(i + " è pari.");
			else System.out.println(i + " è dispari.");
			
		}
					
	}

}