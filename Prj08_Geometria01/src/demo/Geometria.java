package demo;

import forme.Rettangolo;	// devo importare il file Rettangolo.java del package forme per poter utilizzare l'oggetto Rettangolo

public class Geometria {

	public static void main(String[] args) {

		Rettangolo r1 = new Rettangolo(4, 3);	// posso vedere il commento javadoc di Rettangolo() nella sua tooltip
		/*
		System.out.println(r1);		// stampa il riferimento all'oggetto r1 in memoria
		System.out.println(r1.altezza);
		
		System.out.println("Perimetro: " + r1.getPerimetro());
		System.out.println("Area: " + r1.getArea());
		*/
		System.out.println(r1.getInfo());

		Rettangolo r2 = new Rettangolo(5, 4);
		System.out.println(r2.getInfo());
		
	}

}
