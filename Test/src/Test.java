
public class Test {

	public static void main(String[] args) {

			int carta = 0;
			int forbice = 0;
			int sasso = 0;
			
			for (int i=0; i<1000; i++) {
				
				int segno = (int)((Math.random()*3)+1);

				if (segno == 1) {
					System.out.println("Carta");
					carta++;
				}
				else if (segno == 2) {
					System.out.println("Forbice");
					forbice++;
				}
				else {
					System.out.println("Sasso");
					sasso++;
				}
			}
			System.out.println(carta + "\tcarta\n" + 
							   forbice + "\tforbice\n" + 
							   sasso + "\tsasso");
		
	}

}
