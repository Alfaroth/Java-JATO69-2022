package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CastelloOrrori {

	public static void main(String[] args) {
		
		Mostruoso dracula = new Vampiro();
		Mostruoso imhotep = new Mummia();
		Licantropo lupo = new Licantropo();
		Zombie twd = new Zombie();
		
		// Mostruoso[] arrayMostri = new Mostruoso[]{dracula, imhotep, lupo, twd};
		List<Mostruoso> listaMostri = Arrays.asList(new Mostruoso[]{dracula, imhotep, lupo, twd}); // trasforma Array in List
		
		List<Mostruoso> mostruosi = new ArrayList<>(listaMostri); // JFC - Java Collection Framework
		List<CreaturaSpaventosa> creatureSpaventose = new Vector<>();
		List<Distruttivo> distruttivi = new ArrayList<>();
		
		mostruosi.add(dracula);
		mostruosi.add(twd);
		
		creatureSpaventose.add(lupo);
		
	}
	
}
