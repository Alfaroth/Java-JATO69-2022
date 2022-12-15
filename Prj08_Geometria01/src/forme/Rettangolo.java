package forme;

public class Rettangolo {

	public Segmento base, altezza;	// public serve perché sia visibile da altri package

	// commento in tipologia javadoc: appare nella tooltip quando il metodo viene utilizzato
	/** 
	 * Costruttore del Rettangolo.
	 * @param base Segmento della base. 
	 * @param altezza Segmento dell'altezza.
	 * */
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
 	}
	
	public double getPerimetro() {
		return 2*(base.lunghezza() + altezza.lunghezza());	
	}


	public double getArea() {
		System.out.println("Metodo del rettangolo");
		return base.lunghezza() * altezza.lunghezza();	
	}
	
	public String getInfo() {
		return "Rettangolo" +
			   "\n Base = " + base +
			   "\n Altezza = " + altezza +
			   "\n Perimetro = " + getPerimetro() +
			   "\n Area = " + getArea();			   
	}
	
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", getPerimetro()=" + getPerimetro()
				+ ", getSuperficie()=" + getArea() + "]";
	}
	
}