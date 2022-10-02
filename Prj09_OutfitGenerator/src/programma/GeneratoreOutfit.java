package programma;

public class GeneratoreOutfit {

	public String genera(String ogg) {
		
		DatabaseVestiti.init();
		int casuale = (int)(Math.random()*5);
		String risposta = null;
		
		switch (ogg) {
		case "borse":
			risposta = DatabaseVestiti.borse[casuale].etichetta();
			break;
		case "cappelli":
			risposta = DatabaseVestiti.cappelli[casuale].etichetta();
			break;
		case "maglie":
			risposta = DatabaseVestiti.maglie[casuale].etichetta();
			break;
		case "pantaloni":
			risposta = DatabaseVestiti.pantaloni[casuale].etichetta();
			break;
		case "scarpe":
			risposta = DatabaseVestiti.scarpe[casuale].etichetta();
			break;
		default:
			risposta = "Scelta errata.";
			break;
		}
		
		return risposta;
	
	}
	
	public String outfit() {
		
		String borsa = genera("borse");
		String cappello = genera("cappelli");
		String maglia = genera("maglie");
		String pantalone = genera("pantaloni");
		String scarpa = genera("scarpe");
	
		return borsa + "\n" + cappello + "\n" + maglia + "\n" + pantalone + "\n" + scarpa;
		
	}
	
}
