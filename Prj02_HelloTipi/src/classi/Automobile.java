package classi;

public class Automobile {

	String marca;
	String modello;
	boolean accesa;
	
	public Automobile(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
		this.accesa= false;
	}
	
	// posso avere più costruttori con argomenti diversi
	public Automobile(String marca, String modello, boolean accesa) {
		this.marca = marca;
		this.modello = modello;
		this.accesa = accesa;
	}
	
	public void accendi() {
		this.accesa=true;
	}
	
	public void spegni() {
		this.accesa=false;
	}
	
	public String stampa() {
		return "Questa automobile è di marca " + this.marca + " e modello " + this.modello + " e lo stato di accensione è " + this.accesa + ".";
	}
}
