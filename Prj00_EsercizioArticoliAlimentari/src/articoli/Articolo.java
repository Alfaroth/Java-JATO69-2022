package articoli;

public class Articolo {

	private String nome;
	private double peso;
	private double prezzoKg;
	
	public Articolo(String nome, double peso, double prezzoKg) {
		super();
		this.nome = nome;
		this.prezzoKg = prezzoKg;
		this.peso = peso;
	}

	/**
	 * Restituisce il costo dell’articolo.
	 * @return prodotto tra peso e prezzo al kg.
	 */
	public double getCosto() {
		return this.peso*this.prezzoKg;
	}
	
	/**
	 * Applica uno sconto al costo dell'articolo.
	 * @param percentuale di sconto da applicare all'articolo.
	 */
	public void applicaSconto(double percentuale) {
		double sconto = (100 - percentuale)/100;
		this.prezzoKg *= sconto;
		System.out.println("È stato applicato uno sconto del " + percentuale + "% sul seguente prodotto: " + this.getNome() + ".\n");
	}
	
	/**
	 * Determina i punti fedeltà, un punto ogni 2€ di costo.
	 * @return quantità di punti fedeltà dell'articolo.
	 */
	public int getPuntiFedelta() {
		int punti = 0;
		double calc = this.getCosto();
		while(calc >= 2) {
			calc -= 2;
			punti++;
		}
		return punti;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrezzoKg() {
		return prezzoKg;
	}
	
	public void setPrezzoKg(double prezzoKg) {
		this.prezzoKg = prezzoKg;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articolo: ");
		builder.append(nome);
		builder.append(", Prezzo al kg: ");
		builder.append(prezzoKg + "€");
		builder.append(", Peso: ");
		builder.append(peso + "kg");
		builder.append(", Costo: ");
		builder.append(getCosto());
		builder.append("€");
		return builder.toString();
	}
	
}