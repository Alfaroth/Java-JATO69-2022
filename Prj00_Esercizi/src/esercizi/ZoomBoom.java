package esercizi;


// Scrivi un programma che itera tutti i numeri interi da 1 a 100. Per i multipli di 3 stamperà "Zoom" mentre per i multipli di 5 stamperà "Boom". 
// Controlla anche il caso in cui il numero è divisibile sia per 3 sia per 5.


public class ZoomBoom {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			
			if ((i%3==0) && (i%5==0)) System.out.println(i + " Zoom Boom");
			else if (i%3==0) System.out.println(i + " Zoom");
			else if (i%5==0) System.out.println(i + " Boom");
			else System.out.println(i);
		
		}
		
	}

}