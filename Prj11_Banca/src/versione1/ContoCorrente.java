package versione1;

public class ContoCorrente {

	private int numeroConto;
	private String titolare;
	private double saldo;
	
	// RClick > Source > Generate Constructor using Fields... > numeroConto e titolare
	public ContoCorrente(int numeroConto, String titolare) {
		this.numeroConto = numeroConto;
		this.titolare = titolare;
		this.saldo = 0.0;
	}
	
	public void versamento(double amount) {
		this.saldo += amount;
		System.out.println("Hai versato " + amount + "€.");
	}
		
	public double prelievo(double amount) {
		if (this.saldo >= amount) {
			this.saldo -= amount;
			System.out.println("Hai prelevato " + amount + "€.");
			return amount;
		}
		System.out.println("Disponibilità insufficiente!");
		return 0;
	}
	
	public double getSaldo() { // serve per poter accedere all'attributo privato saldo fuori dalla class ContoCorrente
		return this.saldo;
	}
	
	public String stampa() {
		return "\nContro corrente #" + numeroConto + 
				"\nTitolare: " + titolare + 
				"\nSaldo attuale: " + saldo + "€" +
				"\n****************************************\n";
	}
}
