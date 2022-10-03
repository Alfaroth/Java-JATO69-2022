package interfaccia;

import giochi.Decision;
import giochi.DiceGame;

public class Console {

	public static void main(String[] args) {
		
		boolean gira = true;
		
		while (gira) {
			
			System.out.println(Domande.MENU);
			String risposta = MioScanner.leggiStringa(Domande.SCEGLI_GIOCO);
			
			switch (risposta) {
			
			case "1":
				System.out.println(Decision.play());
				break;
				
			case "2":
				System.out.println("Non ancora disponibile.");
				break;
				
			case "3":
				System.out.println(DiceGame.play());
				break;
				
			case "0":
				System.out.println("Game over.");
				gira = false;
				break;
				
			default:
				System.out.println("Opzione non valida.");
				break;
				
			}
			
		}
		
		System.out.println("Arrivederci.");
		
		// far scegliere un gioco
		// scelte, farlo o non farlo
		// carta forbice sasso
		// lancia dadi n volte
		// oppure esci dal gioco
		
	}

}
