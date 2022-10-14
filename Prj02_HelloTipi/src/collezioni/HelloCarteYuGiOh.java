package collezioni;

import java.util.ArrayList;

public class HelloCarteYuGiOh {

	public static void main(String[] args) {
	
		ArrayList<CartaYuGiOh> carte = new ArrayList<>();
		
		carte.add(new CartaYuGiOh("Blue-Eyes White Dragon", 3000, 2500));
		carte.add(new CartaYuGiOh("Dark Magician", 2500, 2100));
		carte.add(new CartaYuGiOh("Exodia the Forbidden One", 1000, 1000));
		carte.add(new CartaYuGiOh("Left Arm of the Forbidden One", 200, 300));
		carte.add(new CartaYuGiOh("Right Arm of the Forbidden One", 200, 300));
		carte.add(new CartaYuGiOh("Left Leg of the Forbidden One", 200, 300));
		carte.add(new CartaYuGiOh("Right Leg of the Forbidden One", 200, 300));

		int totaleAtk = 0;
		int totaleDef = 0;
		
		System.out.println("Carte:");
		
		for (CartaYuGiOh carta : carte) {
			System.out.println(carta.toString());
			totaleAtk += carta.getAtk();
			totaleDef += carta.getDef();
		}
		
		System.out.println("Totale ATK: " + totaleAtk + 
						 "\nTotale DEF: " + totaleDef);
		
	}
	
}