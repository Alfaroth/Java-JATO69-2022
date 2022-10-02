package gioco;

public class Test {

	public static void main(String[] args) {

		/*
		double casuale = Math.random();
		int casualeMoltiplicato = (int)(casuale*100)+1;	
		// converto un double in un int quindi perdo informazioni, non importanti in questo contesto
 		// il +1 serve per evitare 0 come risultato e per poter ottenere 100
														 		
		System.out.println((int)(Math.random()*100)+1);	
		// posso mettere le funzioni direttamente nella stampa per fare meno operazioni
		*/
		
		//stampa un numero random tra 1 e 100 dieci volte
		for (int i=1; i<=10; i++) {
			System.out.println("Ciclo " + i + ": " + ((int)(Math.random()*100)+1));
		}
		
	}

}
