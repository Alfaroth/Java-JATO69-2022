package array;

import java.util.Iterator;

public class ProvaArray {

	public static void main(String[] args) {

		/*
		String[] note = new String[7];	// gli array hanno dimensione prefissata e sono 0-based (partono da 0)
		// posso creare array con questo metodo se non so ancora i valori che ci verranno inseriti

		note[0] = "do";
		note[1] = "re";
		note[2] = "mi";
		note[3] = "fa";
		note[4] = "sol";
		note[5] = "la";
		note[6] = "si";
		*/
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};	// metodo più veloce per creare un array di stringhe che posso usare se conosco già i valori da inserire 
		
		for (int i=0; i<note.length; i++) {	// siccome l'array non si può ridimensionare, length è una proprietà quindi non scrivo length(), che è invece un metodo
			System.out.println(note[i].toUpperCase());	// .toUpperCase() trasforma una stringa in caratteri maiuscoli
		}		
	}

}

