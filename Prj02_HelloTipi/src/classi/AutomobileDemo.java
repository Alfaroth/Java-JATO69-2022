package classi;

public class AutomobileDemo {

	public static void main(String[] args) {

		Automobile a1 = new Automobile("Fiat", "500");
		Automobile a2 = new Automobile("Ferrari", "GT305", true);
		
		a1. accendi();
		
		System.out.println(a1.stampa());
		System.out.println(a2.stampa());
	
		a2.spegni();
		
		System.out.println(a1.stampa());
		System.out.println(a2.stampa());
		
	}

}
