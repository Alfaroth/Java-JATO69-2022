package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
// creo il nuovo oggetto ComparatoreLibriTitolo per definire il criterio per ordinare i libri
class ComparatoreLibriTitolo implements Comparator<Libro> {
	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.titolo.compareTo(l2.titolo);
	}	 
}
*/

public class Libreria {

	public static void main(String[] args) {
		
		Libro[] libri = {
				new Libro(1, "Zanna bianca"),
				new Libro(2, "Cuore"),
				new Libro(3, "Barbablu"),
				new Libro(4, "I Malavoglia"),
		};
		
		List<Libro> listaLibri = Arrays.asList(libri);
		
		// ComparatoreLibriTitolo clt = new ComparatoreLibriTitolo();
		// posso utilizzare il nuovo oggetto ComparatoreLibriItolo
		
		/*
		Comparator<Libro> comparatoreTitolo = new Comparator<Libro>() { 
		// oppure posso aggiungere direttamente i metodi non implementati per evitare di creare un nuovo oggetto ComparatoreLibriTitolo
			@Override
			public int compare(Libro l1, Libro l2) {
				return l1.titolo.compareTo(l2.titolo);
			}
		};
		*/
			
		// Comparator<Libro> comparatoreTitolo = (l1, l2) -> l1.titolo.compareTo(l2.titolo);
		// oppure posso dare direttamente l'intera istruzione in una sola riga
		
		/*
		listaLibri.stream()
			// posso ordinare usando il Comparator comparatoreTitolo
			.sorted(comparatoreTitolo)
			.forEach(l -> System.out.println(l));				
		*/
		
		listaLibri.stream()
			// oppure posso ordinare dando l'intera istruzione in una sola riga
			.sorted((l1, l2) -> l1.titolo.compareTo(l2.titolo))
			.forEach(l -> System.out.println(l));
		
		List<Libro> libriPerTitolo1 = listaLibri.stream()
			.sorted((l1, l2) -> l1.titolo.compareTo(l2.titolo))
			.collect(Collectors.toList());
			// in questo caso creo una nuova collezione partendo dalla precedente
		
		Set<String> libriPerTitolo2 = listaLibri.stream()
			.sorted((l1, l2) -> l1.titolo.compareTo(l2.titolo))
			.map(l -> l.titolo)
			.collect(Collectors.toSet());
			// creo un set di stringhe contenenti solo i titoli dei libri
		
		libriPerTitolo1.forEach(titolo -> System.out.println(titolo));
		libriPerTitolo2.forEach(titolo -> System.out.println(titolo));
		
	}
	
}
