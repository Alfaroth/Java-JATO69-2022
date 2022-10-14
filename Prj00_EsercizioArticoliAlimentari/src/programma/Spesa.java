package programma;

import articoli.Articolo;
import logica.Scontrino;

public class Spesa {

	public static void main(String[] args) {

		Scontrino sc1 = new Scontrino();
		Articolo a1 = new Articolo("Farina", 1.5, 0.8);
		Articolo a2 = new Articolo("Pollo", 1.43, 2.99);
		sc1.addArticolo(a1);
		sc1.addArticolo(a2);
		System.out.println(sc1);
		a2.applicaSconto(5);
		System.out.println(sc1);

	}

}