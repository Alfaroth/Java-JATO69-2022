package interfaccia;

import java.util.Scanner;

public class MioScanner {
	
	static Scanner kb = new Scanner(System.in);
	
	public static String leggiStringa(String domanda) {
		System.out.println(domanda);
		return kb.nextLine();
	}
	
	public static int leggiIntero(String domanda) {
		System.out.println(domanda);
		return kb.nextInt();
	}
	
	public static double leggiDouble(String domanda) {
		System.out.println(domanda);
		return kb.nextDouble();
	}
	
}