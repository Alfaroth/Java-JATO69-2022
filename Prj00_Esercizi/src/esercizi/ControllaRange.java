package esercizi;

import java.util.Scanner;

// Scrivi un programma che controlla se un dato intero si trova tra 20 e 100 o tra 20 e 400

public class ControllaRange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Inserisci un intero: ");
		int a = kb.nextInt();
		if (a<=20 && a<=400) {	
			if (a<=100) System.out.println(a + " è compreso tra 20 e 100.");
			else System.out.println(a + " è compreso tra 20 e 400 ma non tra 20 e 100.");
		}
		else System.out.println(a + " non è compreso tra 20 e 400.");
		
		/* 
		if (a>=20) {				// stessa cosa senza usare &&
			if (a<=400) {
				if (a<=100) System.out.println(a + " è compreso tra 20 e 100.");
				else System.out.println(a + " è compreso tra 20 e 400 ma non tra 20 e 100.");
			}
		}
		else System.out.println(a + " non è compreso tra 20 e 400.");
		*/
	}

}




