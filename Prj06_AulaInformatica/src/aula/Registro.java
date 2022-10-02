package aula;

import java.util.Scanner;

public class Registro {

	Studente[] elenco = null; 
	int presenti;
	int assenti;
								
	public void init() {
		elenco = StudentiJato69.studenti;	// prendo l'array dalla classe StudentiJato69
	}
	
	public void appello() {

		for (int i = 0; i < elenco.length; i++) {
			
			Scanner kb = new Scanner(System.in);
			String risposta = null;
			System.out.print("È presente lo studente " + elenco[i].getStudente() + "? ");
			risposta = kb.next();
			
			if (risposta.equalsIgnoreCase("s")) 
				presenti++;
			else 
				assenti++;
			
		}
		
	}
	
	public String resoconto() {
		
		return "Oggi " +	//trovare il modo per aggiungere la data di oggi
				"\nSono presenti " + presenti + 
				"\nSono assenti " + assenti;
		
	}
	
}