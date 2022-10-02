package aula;

public class StudentiJato69 {

	public static Studente[] studenti = initRegistro();
	
	public static Studente[] initRegistro() {	// anche il metodo deve essere static per poter essere richiamato quando creo la classe
			
			String[] database = {
				"Abel Nucci",
				"Adrian Bucur",
				"Alessia Marton",
				"Andrea Nardo",
				"Angelika Grażyna",
				"Antonio Napolitano",
				"Clarissa Quagliotti",
				"Claudia Seres",
				"Dalila DiPaolo",
				"Dario Mucci",
				"Davide Valerio",
				"Federico Fissore",
				"Francesco Villa",
				"Giacomo Salato",
				"Giuseppe Morabito",
				"Leonardo Mundaca",
				"Lorena Scattone",
				"Lorenzo Pace",
				"Lorenzo Zeppegno",
				"Luca Franchino",
				"Luisa Acevedo",
				"Nicolò Petrucci",
				"Nigusu Cosentini",
				"Noemi DeCicco",
				"Riccardo Fogliasso",
				"Riccardo Tucci",
				"Valentina DeIaco",
				"Valentina DiGesu"
			};
		
			studenti = new Studente[database.length];
			
			for (int i = 0; i < studenti.length; i++) {			// scorro l'array di stringhe studenti
				String[] nomecognome = database[i].split(" ");	// creo un array di 2 stringhe ottenute separando la stringa in studenti[i] usando " " come separatore
				String nome = nomecognome[0];					// assegno la stringa in posizione 0 a nome
				String cognome = nomecognome[1];				// assegno la stringa in posizione 1 a cognome
				studenti[i] = new Studente(nome, cognome);		// creo un nuovo oggetto Studente e assegno nome e cognome allo Studente creato
	 		}
			
			for (int i = 0; i < studenti.length; i++) {
				System.out.println(studenti[i].getStudente());
			}
			
			System.out.println("\n...Registro inizializzato\n");

			return studenti;
	}
	
}
