package veicoli;

public class Bicicletta {

	private String colore;
	private String nome;
	private int marcia;
	private double prezzoNoleggio;
	
	public Bicicletta() {
		
		this.colore = "bianco";
		this.nome = "standard";
		this.marcia = 1;
		this.prezzoNoleggio = 10;
		
	}
	
	public Bicicletta(String nome, double prezzoNoleggio) {
		
		this.colore = "bianco";
		this.nome = nome;
		this.marcia = 1;
		this.prezzoNoleggio = prezzoNoleggio;
		
	}
	
	public void setColore (String colore) {
		this.colore = colore;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarcia (int marcia) {
		if (marcia>0 && marcia <= 6) {
			this.marcia = marcia;
		}
		else {
			System.out.println("Non puoi mettere la marcia " + marcia + ".");
		}
	}
	
	public void setPrezzoNoleggio(double prezzoNoleggio) {
		this.prezzoNoleggio = prezzoNoleggio;
	}

	public double getPrezzoNoleggio() {
		return this.prezzoNoleggio;
	}
	
	// RClick > Source > Generate toString()...
	@Override
	public String toString() {
		return "La bicicletta " + nome + " è di colore " + colore + " ed è in marcia " + marcia + ".";
	}
	
}