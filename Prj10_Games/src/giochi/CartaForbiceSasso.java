package giochi;

import java.util.Scanner;

public class CartaForbiceSasso {

	public static String play() {

		String segno = getSegno();
		String segnoUtente = getSegnoUtente();
		
		System.out.println("Hai giocato " + segnoUtente + " contro " + segno + ".") ;
		
		if (segno == segnoUtente)
			return "Pareggio!";
		else if (segnoUtente == "Carta" && segno == "Sasso")
			return "Hai vinto!";
		else if (segnoUtente == "Carta" && segno == "Forbice")
			return "Hai perso!";
		else if (segnoUtente == "Forbice" && segno == "Carta")
			return "Hai vinto!";
		else if (segnoUtente == "Forbice" && segno == "Sasso")
			return "Hai perso!";
		else if (segnoUtente == "Sasso" && segno == "Carta")
			return "Hai perso!";
		else 
			return "Hai vinto!";
		
	}

	
	public static String getSegno() {
		
		String segno = null;
		int scelta = (int)(Math.random()*3);
		
		switch (scelta) {
			case 0:
				segno = "Carta";
				break;
			case 1:
				segno = "Forbice";
				break;	
			case 2:
				segno = "Sasso";
				break;
			default:
				break;
		}
		
		return segno;
		
	}
	
	public static String getSegnoUtente() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Scegli un segno da giocare:\n" +
						   "1) Carta\n" + 
						   "2) Forbice\n" +
						   "3) Sasso");
		String segno = null;
		int scelta = kb.nextInt();
		
		switch (scelta) {
			case 1:
				segno = "Carta";
				break;
			case 2:
				segno = "Forbice";
				break;	
			case 3:
				segno = "Sasso";
				break;
			default:
				System.out.println("Scelta non valida.");
				break;
		}
		
		return segno;
		
	}
	
}