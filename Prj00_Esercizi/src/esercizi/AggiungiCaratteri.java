package esercizi;

import java.util.Scanner;

// Scrivi un programma che, a partire da una stringa fornita, ne crea un'altra inserendo la prima lettera all'inizio e alla fine della stringa. Esempio (mario -> mmariom) 

public class AggiungiCaratteri {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Inserisci una stringa: ");
		String s = kb.next();
        char[] ch = s.toCharArray();	// copio la stringa s in un array di caratteri
        char[] copia = new char[ch.length+2];	// creo una copia più lunga dell'array
        copia[0]=ch[0];	// copio il primo carattere dell'array ch nella copia
        int i;
        for (i=0; i<ch.length; i++) 
        	copia[i+1]=ch[i];  	// copio il resto dell'array ch nella copia
        copia[i+1]=ch[0];		// copio il carattere iniziale di ch alla fine dell'array copia
        for (i=0; i<copia.length; i++) 		
        	System.out.print(copia[i]);		// stampo l'array
       
        /*
        // altro modo per stampare un array di caratteri
       	System.out.println();  
        String str = new String(copia);		
        System.out.println(str);		
        */
        
	}
}