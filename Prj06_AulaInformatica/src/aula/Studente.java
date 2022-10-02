package aula;

public class Studente {

	static int matricolatore = 1;
	
	int matricola;
	String nome;
	String cognome;

	public Studente(String n, String c) {
		//nome = n;
		//cognome = c;
		setStudente(n, c);
		matricola = matricolatore++;
	}
	
	public String getStudente() {
		return matricola + ") " + nome + " " + cognome.toUpperCase();
	}

	public void setStudente(String ilNome, String ilCognome) {	// metodo per inizializzare uno studente passando nome e cognome come argomenti
		nome = ilNome;
		cognome = ilCognome;
	}
	
}
