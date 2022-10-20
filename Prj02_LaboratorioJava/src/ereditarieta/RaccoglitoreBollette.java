package ereditarieta;

import java.util.ArrayList;

public class RaccoglitoreBollette {

	public static void main(String[] args) {
		
		ArrayList<Bolletta> bollette = new ArrayList<Bolletta>();	
		
		BollettaGas bollGas1 = new BollettaGas();
		Bolletta bollLuce1 = new BollettaLuce();
		Bolletta bollTelefono1 = new BollettaTelefono();
		
		bollGas1.importo = 15;
		bollGas1.metriCubi = 12;
		bollLuce1.importo = 20;
		bollTelefono1.importo = 25;

		bollette.add(bollGas1);
		bollette.add(bollLuce1);
		bollette.add(bollTelefono1);
		
		double totale = 0;
		
		for (Bolletta bolletta : bollette) {
			totale += bolletta.importo;
		}
		
		System.out.println("Totale bollette: " + totale + "€");
		
		for (Bolletta bolletta : bollette) {
			System.out.println(bolletta);
			
		}
		
	}
	
}