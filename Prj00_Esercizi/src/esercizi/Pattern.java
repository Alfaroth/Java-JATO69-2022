package esercizi;

import java.util.Scanner;



public class Pattern {

	public static void main(String[] args) {
		
		patternUno();
		System.out.println();
		patternCrescente1();
		System.out.println();
		patternCrescente2();
		System.out.println();
		patternChiocciola();
		System.out.println();
		patternReverse();
		System.out.println();
		patternSpazio();
		
	}
	
	/*
	Scrivi un programma che stampa il seguente pattern (chiede all'utente il numero di righe):
	1
	12
	123
	1234
	12345
	*/
	
	public static void patternUno() {

		Scanner kb = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int numRighe = kb.nextInt();
		int conta = 0;
		
		while (conta<numRighe) {
			
			int a=0;
			
			while (a<=conta) {
				
				System.out.print(a+1);
				a++;
				
			}
			
			System.out.println();
			conta++;
			
		}
		
	}
	
	/* 
	Scrivi un programma che stampa il seguente pattern (chiede all'utente il numero):	
	1
	2 3
	4 5 6
	7 8 9 10
	*/
	
	public static void patternCrescente1() {		// chiede il numero di righe

		Scanner kb = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int numRighe = kb.nextInt();
		int conta = 0;
		int stampa = 1;
		
		while (conta<numRighe) {
			
			int a=0;
			
			while (a<=conta) {
				
				System.out.print(stampa + " ");
				a++;
				stampa++;
				
			}
			
			System.out.println();
			conta++;
			
		}
		
	}
	
	public static void patternCrescente2() {	// chiede il numero finale del pattern

		Scanner kb = new Scanner(System.in);
		System.out.print("Numero finale: ");
		int num = kb.nextInt();
		int conta = 0;
		int stampa = 1;
		boolean fine = false;
		
		while (!fine) {
			
			int a=0;
			
			while (a<=conta && !fine) {
								
				if (stampa==num) fine = true;
				System.out.print(stampa + " ");
				a++;
				stampa++;
				
			}
			
			System.out.println();
			conta++;
			
		}
	}
	
	/* 
	Scrivi un programma che stampa il seguente pattern (chiede all'utente il numero di righe):
	@
	@@
	@@@
	@@@@
	@@@@@
	@@@@@@
	*/
	
	public static void patternChiocciola() {

		Scanner kb = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int numRighe = kb.nextInt();

		for (int i=1; i<=numRighe; i++) {

			for (int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	/* 
	Scrivi un programma che stampa il seguente pattern (chiede all'utente il numero di righe):
	*****
	****
	***
	**
	*
	*/
	
	public static void patternReverse() {

		Scanner kb = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int numRighe = kb.nextInt();

		for (int i=numRighe; i>0; i--) {

			for (int j=i; j>0; j--) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void patternSpazio() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int numRighe = kb.nextInt();
		
		for (int i=1; i<numRighe; i++) {

			for (int j=1; j<=i; j++) {
				
				System.out.print(j);
				
			}
			
			System.out.print("     ");
			
			for (int j=numRighe; j>i; j--) {
				
				System.out.print(j);
				
			}
			
			System.out.println();
			
		}
		
	}
	
}