package versione1;

public class BloccoNote {

	Nota[] elenco = new Nota[10];

	public void addNota(String desc, int pos) {
		
		Nota n = new Nota();	// creo un oggetto di tipo nota
		n.desc = desc;			// assegno al campo desc della nuova nota la stringa desc passata in argomento al metodo
		elenco[pos] = n;		// assegno la nuova nota al blocco note in posizione pos
		
	}
	
	public void stampa() {
		
		for (int i = 0; i < elenco.length; i++) {
			
			if (elenco[i] != null)
				System.out.println(elenco[i].stampa());
			
			else System.out.println("-");
		}
		
	}
	
}
