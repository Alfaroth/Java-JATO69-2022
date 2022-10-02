package gioco;

import java.util.Scanner;

public class IndovinaNumero {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int numeroDaIndovinare = (int)(Math.random()*100)+1;	// spiegato in Test.java
		boolean indovinato = false;
		// int vittorie = 0;
		System.out.println("Indovina il numero\n");
		
		/*
		for (int partita = 1; partita<=3; partita++) {		// per fare 3 partite 
			
			System.out.println("Partita " + partita + "\n");
			indovinato = false;
		*/	
			while (!indovinato) {
				
				System.out.print("Inserisci un numero intero tra 1 e 100: ");
				int numeroUtente = kb.nextInt();
				
				if (numeroUtente == numeroDaIndovinare)	{
					System.out.println("Hai indovinato il numero " + numeroDaIndovinare + "!\n");
					indovinato = true;
					// vittorie++;
				}
				else if (numeroUtente < numeroDaIndovinare) System.out.println("Troppo basso, prova ancora.\n");
				else System.out.println("Troppo alto, prova ancora.\n");
			
			}
		/*
		}
		
		if (vittorie == 0) System.out.println("Non hai vinto nessuna partita.");
		else System.out.println("Hai vinto " + vittorie + " partite su 3!");
		*/
	}
	
}