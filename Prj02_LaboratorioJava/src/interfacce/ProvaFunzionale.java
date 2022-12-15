package interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import eccezioni.Gatto;

public class ProvaFunzionale {

	public static void main(String[] args) {
		
		// IntStream.range(1, 91).forEach(n -> System.out.println(n));	// genera uno stream di interi tra 1 e 91 e li stampa
		
		IntStream
			.range(1, 91)							// genera uno stream di interi tra 1 e 91
			.filter(n -> n%2==0)					// filtro solo i numeri pari
			.filter(n -> n%3==0)					// e divisibili per 3
			.limit(15) 								// solo i primi 15
			.skip(5)								// salta i primi 5
			.forEach(n -> System.out.println(n)); 	// e li stampa
		
		Stream.of("do", "re", "mi")
			.sorted()						// mette in ordine alfabetico gli elementi dello stream
			.forEach(System.out::println);	// e li stampa
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};	
		Arrays.stream(note)					// usa l'array come stream
			.map(n -> n.toUpperCase())		// restituisce uno stream applicando toUpperCase() a ogni elemento
			.sorted()						// mette in ordine alfabetico gli elementi dello stream
			.forEach(System.out::println);	// e li stampa
		
		// le collezioni di partenza non vengono modificate dalle operazioni sullo stream 
		// ma posso salvare le collezioni modificate in una nuova collezione
		List<String> noteMaiuscoleOrdinate = Arrays.stream(note)
												.map(n -> n.toUpperCase())
												.sorted()	
												.toList();	// salvo le modifiche nella lista noteMaiuscoleOrdinate
		
		IntSummaryStatistics summaryStatistics = IntStream.of(24,26,18,23,28,29,27,24,30,30,19,22,21)
													.summaryStatistics();	// restituisce una serie di statistiche di uno stream
		System.out.println(summaryStatistics);
		
		try {
			List<Gatto> gatti =	Files.lines(Paths.get("files/gatti.txt"))	// legge tutte le righe di un file
				.map(s -> {
					String[] split = s.split(","); 							// splitta le righe usando "," come separatore
					return new Gatto(split[0], split[1]);					// crea un nuovo oggetto Gatto
				})
				.toList();													// li salva nella nuova lista gatti
				gatti.forEach(System.out::println);							// e li stampa
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
}
