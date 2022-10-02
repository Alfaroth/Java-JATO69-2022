package esercizi;

import java.util.Scanner;

// Scrivi un programma per calcolare moltiplicazione e divisione di due numeri (input utente) 

public class MoltiplicaDividi {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		double a = kb.nextDouble();
		System.out.print("Inserisci il secondo numero: ");
		double b = kb.nextDouble();
		System.out.println(a + " x " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		
	}

}