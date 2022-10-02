package iterazione;

public class ProvaWhile {

	public static void main(String[] args) {

		int n=5;
		
		while (n==5) {
			
			System.out.println("...");
			double random = Math.random();
			System.out.println("Il numero random scelto è " + random + ".");
			
			if (random < 0.1) n=0;	// uscita dal ciclo
			
		}
		
	}

}
