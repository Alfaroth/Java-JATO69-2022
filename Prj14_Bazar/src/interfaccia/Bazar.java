package interfaccia;

import database.Prodotti;
import logica.Scontrino;
import prodotti.Articolo;
import prodotti.Prodotto;

public class Bazar {

	public static void main(String[] args) {	
		// elencoProdotti();	
		Articolo[] acquisti = {
				new Articolo(Prodotti.getProdotti()[0], 1),
				new Articolo(Prodotti.getProdotti()[1], 1),
				new Articolo(Prodotti.getProdotti()[2], 2),
				new Articolo(Prodotti.getProdotti()[3], 3),
				new Articolo(Prodotti.getProdotti()[4], 2),
		};
		
		elencoProdotti();
		
		System.out.println("");
		
		//stampaScontrino(acquisti);
		//stampaScontrinoHTML(acquisti);
		stampaScontrinoHTMLStringBuilder(acquisti);
		
	}
	
	private static void stampaScontrino(Articolo[] acquisti) {
		Scontrino sc = new Scontrino(acquisti, 1);
		System.out.println(sc);
	}
	
	private static void stampaScontrinoHTML(Articolo[] acquisti) {
		
		String output = "<html>\n";
			output += "<head>\n";
			output += "</head>\n";
			output += "<body>\n";
			
			output += "<ul>\n";
			
				for (Articolo articolo : acquisti) {
					output += "<li>";
					output += articolo.getProdotto();
					output += "</li>\n";
				}
			
			output += "</ul>\n";
	
			output += "</body>\n";
			System.out.println(output);
		
	}
	
	private static void stampaScontrinoHTMLStringBuilder(Articolo[] acquisti) {
		
		StringBuilder sb = new StringBuilder("<html>");
		
		sb.append("<head>\n");
		sb.append("</head>\n");
		
		sb.append("<body>\n");
		
		sb.append("<ul>\n");
		
		for (Articolo articolo : acquisti) {
			sb.append("<li>" + articolo.getProdotto().getNome() + "</li>\n");
		}
		
		sb.append("</ul>\n");
		
		sb.append("<script>console.log('funziona');</script>");
		
		sb.append("</body>\n");
		
		System.out.println(sb.toString());
		
	}

	private static void elencoProdotti() {
		// per ogni Prodotto P contenuto in Prodotti.getProdotti()
		for (Prodotto p : Prodotti.getProdotti()) {
			System.out.println(p);
		}
	}
	
}