package stringhe;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.print("Inserisci username: ");		
		String user  = kb.nextLine();
		// String user  = kb.next();	
		//next() legge fino ad uno spazio o invio quindi potrebbe dare problemi con dati contenenti spazi e riempire automaticamente il .next() successivo
		System.out.print("Inserisci password: ");		
		String passw = kb.nextLine();
		
		if (passw.equals("segreto") && user.equals("pippo")) System.out.println("Sei entrato nell'area riservata.");
		else System.out.println("Username o password errati.");

	}

}
