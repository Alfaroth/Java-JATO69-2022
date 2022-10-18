package model;

public class Stanza {

	private String nome;
	
	public Stanza(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Stanza ");
		builder.append(nome + "]");
		return builder.toString();
	}
		
}