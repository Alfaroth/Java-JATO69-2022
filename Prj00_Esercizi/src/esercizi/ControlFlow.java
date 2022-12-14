package esercizi;

import java.math.BigInteger;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		primiDieci();
		primiDieciPari();
		tabellina();
		fibonacci();
	}
	
	public static void primiDieci() {
	// Scrivere un programma che stampi a video i primi dieci numeri interi
		System.out.println("Primi dieci numeri interi:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	public static void primiDieciPari() {
	// Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20
		System.out.println("Primi dieci interi pari partendo da 20:");
		for (int i = 20; i >= 0; i--) {
			if (i%2==0) System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	public static void tabellina() {
	// Scrivere un programma che stampi le tabellina del numero dato come argomento
		Scanner kb = new Scanner(System.in);
		System.out.print("Tabellina del numero: ");
		int num = kb.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		System.out.println("\n");
	}
	
	public static void tuttiPositiviPari() {
	/* Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) 
	 * e poi, al termine dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti	sono tutti positivi e pari, altrimenti stampa "NO". */	
		
	}
	
	public static void fibonacci() {
	// Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.
		BigInteger prec = new BigInteger("0");
		BigInteger succ = new BigInteger("1");
		System.out.println("Primi 100 numeri della successione di Fibonacci:");
		System.out.println("0\t"+prec);
		System.out.println("1\t"+succ);
		for (int i=2; i<=100; i++) {
			BigInteger fibo = prec.add(succ);
			System.out.println(i+"\t"+fibo); 
			prec = succ;
			succ = fibo;
		}
	}
		
}