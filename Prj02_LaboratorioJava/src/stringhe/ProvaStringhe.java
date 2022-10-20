package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {

		String s1 = "ciao";
		String s2 = "ciao";
		String s3 = new String("ciao");		// con new creo un nuovo oggetto in memoria
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		System.out.println(s1 == s2);	// con == confronto la posizione degli oggetti -> true
		System.out.println(s1 == s3);	// siccome con new ho creato un nuovo oggetto, s1 e s3 non si riferiscono allo stesso oggetto -> false
		
		System.out.println(s1.equals(s3));	// in questo modo controllo il contenuto della stringa -> true

	}

}
