package advanced;

public class Fattoriale {

	static int calcola(int n) {
				
		if (n==0) {
			return 1;
		} else {
			System.out.println(n);
			return n*calcola(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(calcola(5));
	}
	
}
