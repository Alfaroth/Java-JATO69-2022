package model;

public class Utente {

	private String nome;
	private String username;
	private String pass;
	
	public Utente(String nome, String username, String pass) {
		this.nome = nome;
		this.username = username;
		this.pass = pass;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utente [nome=");
		builder.append(nome);
		builder.append(", username=");
		builder.append(username);
		builder.append(", pass=");
		builder.append(pass);
		builder.append("]");
		return builder.toString();
	}
		
}