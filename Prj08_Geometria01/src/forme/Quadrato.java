package forme;

public class Quadrato extends Rettangolo {		// Quadrato è un sottotipo di Rettangolo

	public Segmento lato;
	
	public Quadrato(Segmento lato) {	
		super(lato, lato);	// costruisco un Rettangolo
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + ", toString()=" + super.toString() + "]";
	}
	
	public void stampaQuadrato() {
		System.out.println("Sono il metodo stampaQuadrato");
	}
	
	@Override
	public double getArea() {
		return this.lato.lunghezza() * this.lato.lunghezza();
	}
	
}
