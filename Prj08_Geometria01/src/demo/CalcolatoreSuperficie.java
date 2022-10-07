package demo;

import forme.Stanza;

public class CalcolatoreSuperficie {

	public static void main(String[] args) {

		Stanza[] stanze = new Stanza[5];
		stanze[0] = new Stanza(4, 4);
		stanze[1] = new Stanza(2, 6);
		stanze[2] = new Stanza(5, 4);
		stanze[3] = new Stanza(8, 6);
		stanze[4] = new Stanza(10, 7);
		double totSuperfici = 0;
		
		/*
		for (int i = 0; i < stanze.length; i++) {
			System.out.println(stanze[i].getArea());

		}
		*/
		
		for (Stanza stanza : stanze) {	// per ogni stanza in stanze
			totSuperfici += stanza.getArea();	// totSuperfici = totSuperfici + stanza.getArea();
			System.out.println(stanza.getArea());
		}
		
		System.out.println("Totale: " + totSuperfici);
	
	}

}
