package esercizi;

import java.util.Scanner;

// Scrivi, utilizzando if-statement, un programma per trovare il numero più grande tra 5 numeri. Stampa il risultato.

public class Max {

	public static void main(String[] args) {
		
		/*
		Scanner kb = new Scanner(System.in);
		int max = 0;
		int next = 0;

		for (int i = 0; i < 5; i++) {		
			System.out.print("Inserisci un numero: ");
			next = kb.nextInt();
			if (next > max)
				max = next;

		}
		System.out.println(max);		// più breve ma non ricorda i valori inseriti
		*/
		
		double[] a = chiedi();
		double max = maxNum(a);
		System.out.print("Il numero più alto tra questi ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("è " + max);
	}
	
	public static double maxNum(double[] a) {
		
		double  n = a[0];
		
		for (int i=1; i<a.length; i++) {
			
			if (a[i]>a[0])
					n = a[i];
		}
		return n;
	}
	
	public static double[] chiedi() {
		
		double a[] = new double[5];
		Scanner kb = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			
			System.out.print("Inserisci il numero #" + (i+1) + ": ");
			a[i] = kb.nextDouble();
		}

		return a;
	}
}