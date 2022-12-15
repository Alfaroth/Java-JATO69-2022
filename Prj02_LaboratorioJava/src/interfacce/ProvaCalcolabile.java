package interfacce;

public class ProvaCalcolabile {

	// definisco solo i parametri della funzione
	private static double calcolatrice(Calcolabile c, double a, double b) {
		return c.calcolo(a, b);
	}
	
	public static void main(String[] args) {
		
		// definisco le operazioni della funzione direttamente all'implementazione
		double addizione = calcolatrice((a, b) -> a + b, 10, 15);
		double sottrazione = calcolatrice((a, b) -> a - b, 10, 15);
		double moltiplicazione = calcolatrice((a, b) -> a * b, 10, 15);
		double divisione = calcolatrice((a, b) -> a / b, 10, 15);
		
		System.out.println(addizione);
		System.out.println(sottrazione);
		System.out.println(moltiplicazione);
		System.out.println(divisione);
		
	}
	
}
