package vestiti;

public class Maglia {
	
	public String colore;
	public String nome;

	public Maglia(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	public String etichetta() {
		return nome + " - " + colore;
	}
	
}
