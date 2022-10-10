package utenti;

public class Utente {

	private String nome;

	// RClick > Source > Generate Constructor using Fields...
	public Utente(String nome) {
		super();
		this.nome = nome;
	}

	// RClick > Source > Generate Getters and Setters...
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// RClick > Source > Generate toString()...
	@Override
	public String toString() {
		return "Utente [nome=" + nome + "]";
	}	
	
}