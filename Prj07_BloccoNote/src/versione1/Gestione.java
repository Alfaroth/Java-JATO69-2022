package versione1;

import java.util.Scanner;

public class Gestione {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String risposta = null;
		String desc = null;
		int pos = 0;
		BloccoNote block = new BloccoNote();
		boolean gira = true;
		
		while (gira) {
		
			System.out.println("A) Aggiungi nota\n" +
							   "B) Stampa note\n" + 
							   "X) Esci");
			
			risposta = kb.nextLine();
			
			switch (risposta) {
				
				case "A":
				case "a":
					System.out.println();
					System.out.println("Inserisci la descrizione della nota:");
					desc = kb.nextLine();
					System.out.println("Inserisci la posizione della nota:");
					pos = kb.nextInt();
					kb.nextLine();
					block.addNota(desc, pos);
					System.out.println();
					break;
				
				case "B":
				case "b":
					System.out.println();
					block.stampa();
					System.out.println();
					break;
					
				case "X":
				case "x":
					gira = false;
					break;
					
				default:
					System.out.println("\nSelezione non valida\n");
					break;
			}
			
		}
		
		System.out.println("\nGrazie per aver usato il nostro software.");
		
	}

}
