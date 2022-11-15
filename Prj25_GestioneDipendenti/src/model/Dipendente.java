package model;

public abstract class Dipendente {

	private static int counter = 1;
	
	protected int nMatricola;
	protected String nome;
	
	public Dipendente(String nome) {
		this.nMatricola = counter++;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnMatricola() {
		return nMatricola;
	}
	
	public abstract double calcolaStipendio(); 
	// se non metto il corpo del metodo questo è un metodo astratto che può stare solo in una classe astratta

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [nMatricola=");
		builder.append(nMatricola);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
