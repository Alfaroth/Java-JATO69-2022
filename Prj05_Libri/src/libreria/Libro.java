package libreria;

public class Libro {	// definisco l'oggetto Libro

	String titolo;
	String autore;
	int pagine;
	double prezzo;
	boolean disponibile;
	
	// metodo costruttore che serve a dare un valore iniziale alle proprietà dell'oggetto e unico metodo autorizzato a non avere un tipo di ritorno
	public Libro() {	// deve chiamarsi come la classe quindi iniziare con lettera maiuscola
		
		pagine = (int)(Math.random() * 200);	// assegno un numero casuale di pagine a ogni libro
		prezzo = Math.random() * 20;	// assegno un prezzo casuale a ogni libro
		
		System.out.println("Ho costruito un libro.");
	
	}
	
	public String stampaScheda() {
		return "\"" + titolo + "\", " + pagine + " pagine, " + prezzo + " €.";
	}
	
}
