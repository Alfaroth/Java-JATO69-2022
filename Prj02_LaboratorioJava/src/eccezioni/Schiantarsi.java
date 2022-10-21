package eccezioni;

public class Schiantarsi {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 0;
		
		try {	// con try/catch posso dare istruzioni in caso di errori Exception
			String s = null;
			System.out.println(s.charAt(0));
			System.out.println(a/b);	// Exception / by zero - interrompe l'esecuzione se non gestita
		} catch (NullPointerException e) {	// catturando l'errore posso proseguire fino alla fine del codice
			System.err.println("Sì è verificata un'eccezione: " + e.getMessage());
		} catch (ArithmeticException e) {	
			System.err.println("Sì è verificata un'eccezione: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Sì è verificata un'eccezione: " + e.getMessage());
		}
		// i catch più generici vanno in fondo, i più precisi all'inizio
		
		System.out.println("Sei arrivato alla fine del programma.");
		
	}
	
}