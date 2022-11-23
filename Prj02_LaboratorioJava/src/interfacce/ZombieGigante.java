package interfacce;

public class ZombieGigante extends Zombie implements Distruttivo {

	@Override
	public void faiPaura() {
		super.faiPaura();
		System.out.println(" ancora di più");
	}
	
}
