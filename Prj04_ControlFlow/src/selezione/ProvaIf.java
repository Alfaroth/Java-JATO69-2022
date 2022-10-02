package selezione;

public class ProvaIf {

	public static void main(String[] args) {

		int ora = 11;

		if (ora>=6 && ora<12) {
			System.out.println("Buongiorno, sono le " + ora + ".");
		}
		else if (ora>=12 && ora<20) {
			System.out.println("Buon pomeriggio, sono le " + ora + ".");
		}
		else {
			System.out.println("Buonanotte, sono le " + ora + ".");
		}
		
	}
}