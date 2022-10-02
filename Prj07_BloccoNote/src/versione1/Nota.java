package versione1;

import java.util.Date;

public class Nota {

	String desc;
	Date data = new Date();
	
	public String stampa() {
		
		return data + " - " + desc;
	
	}
	
}
