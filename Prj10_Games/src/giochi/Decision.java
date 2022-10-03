package giochi;

public class Decision {
	
	static int successi = 0;	// quante volte è uscito "fallo"
	
	public static void main(String[] args) {

		int volte = 1000;
		
		for (int i = 0; i < volte; i++) {
			System.out.println(play());
		}
		
		System.out.println(successi);
		
	}

	public static String play() {

		String risposta = null;

		if (Math.random() > 0.5) {
			risposta = "Fallo";
			successi++;
		} else {
			risposta = "Non farlo";
		}

		return risposta;

	}

}
