package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloProgrammazioneFunzionale {

	public static void main(String[] args) {

		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		
		/*
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}
		*/
		
		/*
		for (String nota : note) {
			System.out.println(nota);
		}
		*/
		
		List<String> listaNote = Arrays.asList(note); // trasformo l'Array in una List
		
		listaNote.stream()
			.filter(nota -> nota.endsWith("a"))
			.filter(nota -> nota.startsWith("l"))
			.forEach(nota -> System.out.println(nota)); // stampa i risultati rimanenti dopo i filtri (solo "la")
		
		//Collections.sort(listaNote);

		System.out.println(listaNote);
		
	}

}
