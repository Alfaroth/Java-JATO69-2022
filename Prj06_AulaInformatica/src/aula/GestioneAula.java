package aula;

import java.util.Scanner;

public class GestioneAula {

	public static void main(String[] args) {

		boolean gira = true;
		Scanner kb = new Scanner(System.in);
		String scelta = null;
		Registro r = new Registro();
		
		while (gira) {
			
			System.out.println("Scegli un'operazione:\n" +
							   "A) Inizializza registro\n" +
							   "B) Fai l'appello\n" +
							   "C) Visualizza resoconto\n" +
							   "X) Esci");
			
			scelta = kb.next();
			
			switch (scelta) {
			
			case "a":
			case "A":
				System.out.println("\nInizializzazione registro...\n");
				r.init();
				break;
			
			case "b":
			case "B":
				System.out.println("\nAppello\n");
				r.appello();
				System.out.println();
				break;
			
			case "c":
			case "C":
				System.out.println("\nResoconto\n");
				System.out.println(r.resoconto() + "\n");
				break;
				
			case "x":
			case "X":
				System.out.println("\nUscita\n");
				gira = false;
				break;

			default:
				System.out.println("\nScelta non valida\n");
				break;
			
			}
			
		}
		
	}

}
