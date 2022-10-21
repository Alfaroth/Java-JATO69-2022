package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class RaccoglitoreBollette {

	public static void main(String[] args) throws FileNotFoundException {	
		// throws aggiunto dai suggerimenti sull'inizializzazione di Scanner sc
		
		List<Bolletta> bollette = new ArrayList<Bolletta>();
		
		File f = new File("files/bollette.csv");
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			
			String riga = sc.nextLine();
			String[] valori = riga.split(",");
			
			String tipo = valori[0];	// gas, luce o telefono
			String importo = valori[1];
			String misura = (valori.length > 2 && valori[2] != null) ? valori[2] : null;	// operatore ternario - if/else su una riga
			// 			  =              (condizione)                ?    true   : false
			// se valori[2]!=null allora misura = valori[2], altrimenti misura = null
			// mi serve perché non tutte le righe nel file bollette.csv hanno un terzo campo
		
			if (tipo.equals("GAS")) {
				BollettaGas bollGas1 = new BollettaGas(Double.parseDouble(importo), Double.parseDouble(misura));
				bollette.add(bollGas1);
			}
			
			if (tipo.equals("LUCE")) {
				BollettaLuce bollLuce1 = new BollettaLuce(Double.parseDouble(importo), Double.parseDouble(misura));
				bollette.add(bollLuce1);
			}
			
			if (tipo.equals("GAS")) {
				BollettaTelefono bollTelefono1 = new BollettaTelefono(Double.parseDouble(importo));
				// le bollette telefono nel file bollette.csv non hanno una misura
				bollette.add(bollTelefono1);
			}
			
		}
			
		double totale = 0;
		
		for (Bolletta bolletta : bollette) {
			totale += bolletta.getImporto();
		}
		
		System.out.println("Totale bollette: " + totale + "€");
		
		for (Bolletta bolletta : bollette) {
			if (bolletta instanceof BollettaLuce) {
				System.out.print("***");
			}
			System.out.println(bolletta);
		}
		
	}
	
}