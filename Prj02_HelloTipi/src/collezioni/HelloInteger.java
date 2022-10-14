package collezioni;

import java.util.ArrayList;

public class HelloInteger {

	public static void main(String[] args) {

		ArrayList<Integer> voti = new ArrayList<>();
		
		voti.add(25);
		voti.add(28);
		voti.add(30);
		voti.add(18);
		
		double totale = 0;
		
		/*
		for (int i = 0; i < voti.size(); i++) {
			totale += voti.get(i);
		}
		*/
		
		System.out.println("Voti: ");
		
		for (int voto : voti) {
			System.out.println(voto);
			totale += voto;
		}
		
		System.out.print("Media dei voti: " + totale/voti.size());
		
	}

}
