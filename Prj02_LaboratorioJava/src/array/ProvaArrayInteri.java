package array;

public class ProvaArrayInteri {

	public static void main(String[] args) {

		int[] voti = {18, 25, 29, 30, 24, 25};
		double somma = 0;
		
		for (int i=0; i<voti.length; i++) {
			somma += voti[i];	// somma = somma+ voti;
		}
		
		System.out.print(somma/voti.length);
		
	}

}