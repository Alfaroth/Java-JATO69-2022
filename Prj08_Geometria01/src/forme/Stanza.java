package forme;

public class Stanza {

	public double base, altezza;	// public serve perché sia visibile da altri package

	// commento in tipologia javadoc: appare nella tooltip quando il metodo viene utilizzato
	/** 
	 * Costruttore del Rettangolo.
	 * @param b Valore della base. 
	 * @param h Valore dell'altezza.
	 * */
	public Stanza(double b, double h) {
		base = b;
		altezza = h;
 	}
	
	public double getPerimetro() {
		return 2*(base+altezza);	
	}


	public double getArea() {
		return base*altezza;	
	}
	
	public String getInfo() {
		return "Rettangolo" +
			   "\n Base = " + base +
			   "\n Altezza = " + altezza +
			   "\n Perimetro = " + getPerimetro() +
			   "\n Area = " + getArea();
			   
	}
	
}