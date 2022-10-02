package calcolatrice;

import java.util.Scanner; // tutto ciò che è fuori del package dev'essere importato - serve per creare Scanner

public class CalcolatriceDemo {

	public static void main(String[] args) {
		
		/*
		double a = 12;
		double b = 4;
		double risultato = Calcolatrice.addizione(a,b);						// posso calcolare il risultato della funzione presente nella classe Calcolatrice
		System.out.println(a + " + " + b + " = " + risultato);				// ed assegnarlo alla variabile risultato oppure
		System.out.println("5 + 9 = " + Calcolatrice.addizione(5,9));		// posso calcolarlo direttamente nella stampa
		risultato = Calcolatrice.sottrazione(a,b);
		System.out.println(a + " - " + b + " = " + risultato);
		System.out.println("5 - 9 = " + Calcolatrice.sottrazione(5,9));
		risultato = Calcolatrice.moltiplicazione(a,b);
		System.out.println(a + " * " + b + " = " + risultato);
		System.out.println("5 * 9 = " + Calcolatrice.moltiplicazione(5,9));
		risultato = Calcolatrice.divisione(a,b);
		System.out.println(a + " / " + b + " = " + risultato);
		System.out.println("5 / 9 = " + Calcolatrice.divisione(5,9));
		*/	
		
		double a = chiediNumero();
		double b = chiediNumero();
		System.out.println(a + " + " + b + " = " + Calcolatrice.addizione(a,b));
		System.out.println(a + " - " + b + " = " + Calcolatrice.sottrazione(a,b));
		System.out.println(a + " * " + b + " = " + Calcolatrice.moltiplicazione(a,b));
		System.out.println(a + " / " + b + " = " + Calcolatrice.divisione(a,b));
		
		/*
		System.out.println(Calcolatrice.addizione(chiediNumero(),chiediNumero()));
		// la funzione chiediNumero() può essere utilizzata come argomento	del metodo Calcolatrice.addizione
		*/
		
	}
	
	public static double chiediNumero() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		double numero = kb.nextDouble();
		return numero;
		
	}
	
}