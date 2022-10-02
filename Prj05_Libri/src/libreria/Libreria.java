package libreria;

import java.util.Iterator;
import java.util.Scanner;

public class Libreria {

	public static void main(String[] args) {

		Libro[] scaffale = new Libro[10];	// l'oggetto Libro è definito in Libro.java
		Scanner kb = new Scanner(System.in);
		
		/*
		// per far riempire lo scaffale all'utente
		for (int i = 0; i < scaffale.length; i++) {
			scaffale[i] = new Libro();
			System.out.print("Titolo " + (i+1) + ": ");
			scaffale[i].titolo = kb.nextLine();
		}
		*/
		
		
		String[] titoli = {
			"Io, robot",
			"I promessi sposi",
			"Guerra e pace",
			"I Malavoglia",
			"Divina Commedia",
			"Il ritratto di Dorian Gray",
			"Neuromancer",
			"Codice Da Vinci",
			"Notre Dame de Paris",
			"Il richiamo di Cthulhu"
		};
		
		for (int i = 0; i < scaffale.length; i++) {
			scaffale[i] = new Libro();
			scaffale[i].titolo = titoli[i];
		}
		
		
		
		/*
		scaffale[0] = new Libro();	
		scaffale[0].titolo = "Io, robot";
		scaffale[1] = new Libro();
		scaffale[1].titolo = "Guerra e pace";
		*/
		
		for (int i = 0; i < scaffale.length; i++) {
			if (scaffale[i] != null) 	// se la posizione i di scaffale non è vuota
				System.out.println(scaffale[i].stampaScheda());
		}
		
	}

}
