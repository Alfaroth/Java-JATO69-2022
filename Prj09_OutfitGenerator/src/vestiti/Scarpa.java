package vestiti;

public class Scarpa {
	
	public String colore;
	public String nome;

	public Scarpa(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	public String etichetta() {
		return nome + " - " + colore;
	}
	
}
