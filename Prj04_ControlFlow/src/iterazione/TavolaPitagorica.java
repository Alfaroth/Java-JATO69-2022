package iterazione;

public class TavolaPitagorica {

	public static void main(String[] args) {

		final int RIGHE = 10;		// final si utilizza per creare costanti
		final int COLONNE = 10;		// le costanti si scrivono in MAIUSCOLO
		
		for (int i=1; i<=RIGHE; i++) {
			
			for (int j=1; j<=COLONNE; j++) {
				
				System.out.print("\t" + (i*j));		// \t è la tabulazione
				
			}
			
			System.out.println(); // per andare a capo ogni 10 caratteri
			
		}
		
	}

}
