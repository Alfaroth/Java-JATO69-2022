package main;

import controller.GestionaleCtrl;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class ProvaGestionale {

	public static void main(String[] args) {

		GestionaleCtrl ctrl = new GestionaleCtrl();
		
		Dipendente d1 = new Fattorino("Pippo");
		// ((Fattorino)d1).setnConsegne(10);	// il cast a tipo Fattorino mi serve per poter accedere ai suoi metodi
		Dipendente d2 = new Fattorino("Giuseppe");
		Dipendente d3 = new Fattorino("Antonio");
		Dipendente d4 = new Fattorino("Valentina");
		
		Dipendente d5 = new Impiegato("Dario");
		Dipendente d6 = new Impiegato("Davide");
		Dipendente d7 = new Impiegato("Noemi");
		
		Dipendente d8 = new Dirigente("Allen");
		
		ctrl.addDipendente(d1);
		ctrl.addDipendente(d2);
		ctrl.addDipendente(d3);
		ctrl.addDipendente(d4);
		ctrl.addDipendente(d5);
		ctrl.addDipendente(d6);
		ctrl.addDipendente(d7);
		ctrl.addDipendente(d8);
		
		for (Dipendente d : ctrl.getDipendenti()) {
			
			if (d instanceof Fattorino) {
				((Fattorino)d).setnConsegne(15);
			}
			
			if (d instanceof Impiegato) {
				((Impiegato)d).setOreLavoro(100);
			}
			
			if (d instanceof Dirigente) {
				((Dirigente)d).setEmolumenti(500);
			}
			
		}
		
		double totStipendi = 0;
		
		for (Dipendente d : ctrl.getDipendenti()) {
			double stipendio = d.calcolaStipendio();
			totStipendi += stipendio;
			System.out.println(d + " Stipendio: " + stipendio + "€");
		}
		
		System.out.println("Totale stipendi: " + totStipendi + "€");
		
	}

}
