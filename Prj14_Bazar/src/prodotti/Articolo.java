package prodotti;

public class Articolo {

	private Prodotto prodotto;
	private int quantita;
	private double prezzoArticolo;
	
	public Articolo(Prodotto prodotto, int quantita) {
		super();
		this.prodotto = prodotto;
		this.quantita = quantita;	
		this.prezzoArticolo = prodotto.getPrezzo()*quantita;
	}
	
	public Prodotto getProdotto() {
		return prodotto;
	}

	public int getQuantita() {
		return quantita;
	}
	
	public double getPrezzoArticolo() {
		return prezzoArticolo;
	}
	
	@Override
	public String toString() {
		return prodotto + 
				"\nQuantità = " + quantita + 
				"\nPrezzo Articolo = " + prezzoArticolo + "\n";
	}

}