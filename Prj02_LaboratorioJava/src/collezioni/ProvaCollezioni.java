package collezioni;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ProvaCollezioni {

	public static void main(String[] args) {
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		Collection<String> noteCollection = Arrays.asList(note);
		List<String> noteList = Arrays.asList(note);
		TreeSet<String> noteAL = new TreeSet<>(noteList);
		
		noteAL
			.stream()
			.filter(n -> n.startsWith("s"))
			.map(String::toUpperCase)
			.collect(Collectors.toSet());
		
	}
	
}
