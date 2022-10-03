package classi;

import java.util.Scanner;

public class Stringhe {

	static String parola = "ciao";		// static viene assegnato a tutte le classi e pesa in memoria per tutta la durata del programma
	String tentativo = "salut";
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Stringhe pierre = new Stringhe();
		Stringhe marie= new Stringhe();
		Stringhe bruno = new Stringhe();
		
		String resultP = faiIlTentativo(pierre);
		String resultM = faiIlTentativo(marie);
		String resultB = faiIlTentativo(bruno);
		
		System.out.println("Pierre " + resultP);
		System.out.println("Marie " + resultM);
		System.out.println("Bruno " + resultB);
						
		/*
		System.out.println(pierre.tentativo.equals(parola));	// false
		System.out.println(marie.tentativo.equals(parola));		// false
		bruno.tentativo = "bonjour";
		System.out.println(marie.tentativo.equals(parola));		// false
		
		Stringhe.parola = "bonjour";
		
		System.out.println(bruno.tentativo.equals(parola));		// true
		*/
		
	}
	
	private static String faiIlTentativo(Stringhe player) {		// private è leggibile solo all'interno della classe
		
		player.tentativo = getInputString("Indovina la parola d'ordine: ");
		String risposta = null;
		
		if (player.tentativo.equals(parola)) {
			risposta = "hai indovinato!";
		} else {
			risposta = "prova ancora!";
		}
		
		return risposta;
		
	}
	
	private static String getInputString(String question) {		
		
		System.out.print(question);
		return scanner.nextLine();
		
	}

}
