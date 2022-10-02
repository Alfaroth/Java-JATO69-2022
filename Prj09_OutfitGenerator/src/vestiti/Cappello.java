package vestiti;

public class Cappello {
	
	public String colore;
	public String nome;

	public Cappello(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	public String etichetta() {
		return nome + " - " + colore;
	}
	
}
