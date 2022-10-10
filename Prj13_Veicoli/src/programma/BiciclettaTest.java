package programma;

import veicoli.Bicicletta;

public class BiciclettaTest {

	public static void main(String[] args) {
		
		Bicicletta b1 = new Bicicletta();
		Bicicletta b2 = new Bicicletta();
		
		b1.setColore("grigio");
		b1.setNome("Gandalf il Grigio");
		b1.setMarcia(1);
		b1.setPrezzoNoleggio(10);
		
		b2.setColore("bianco");
		b2.setNome("Saruman");
		b2.setMarcia(2);
		b2.setPrezzoNoleggio(15);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		b1.setColore("bianco");
		b1.setNome("Gandalf il Bianco");
		b1.setMarcia(3);
		b1.setPrezzoNoleggio(20);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("----------------------------------------------------------------------------------------------------");

		Bicicletta b3 = new Bicicletta();
		
		b3.setColore("nero");
		b3.setNome("Sauron");
		b3.setMarcia(6);
		b3.setPrezzoNoleggio(100);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
	
}