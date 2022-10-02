package esercizi;

import java.util.Scanner;

// Scrivi un programma per rimuovere un carattere in una specifica posizione di una data stringa e ritorna la nuova stringa

public class RimuoviCarattere {

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in);
		System.out.print("Inserisci una stringa: ");
		String a = kb.next();	
		StringBuilder sb = new StringBuilder(a);	// sequenza di caratteri	
		System.out.println(a.length());
		System.out.print("Inserisci la posizione del carattere da cancellare: ");
		int n = kb.nextInt();
		
		if (n<=0 || n>=a.length())
			System.out.println("Posizione non valida.");
		
		else {
			sb.deleteCharAt(n-1);		// cancella il carattere alla posizione n
			String result = sb.toString();		// copio StringBuilder sb in una stringa
			System.out.println(result);
		}
	}
	
}