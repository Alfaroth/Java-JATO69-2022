package vestiti;

public class Pantalone {
	
	public String colore;
	public String nome;

	public Pantalone(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	public String etichetta() {
		return nome + " - " + colore;
	}
	
}
