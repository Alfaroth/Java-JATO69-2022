package model;
 
import java.util.ArrayList;
 
public class Teatro {
		
	private String nome;
	private ArrayList<Posto>posti;
	private int id; 
	private int platea; 
	private int galleria; 
	private int palco; 
	private int postiDisabili; 
	
	public Teatro(String nome, int id, int platea, int galleria, int palco, int postiDisabili) {
		super();
		this.nome = nome;
		this.id = id;
		this.platea = platea;
		this.galleria = galleria;
		this.palco = palco;
		this.postiDisabili = postiDisabili;
		this.posti = creaPosti(platea, galleria, palco, postiDisabili);
	}

	public Teatro(String nome, ArrayList<Posto> posti) {
		super();
		this.nome = nome;
		this.posti = posti;
	}
	
	public Teatro(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
		this.posti = new ArrayList<Posto>();
	}
	
	private ArrayList<Posto> creaPosti(int platea, int galleria, int palco, int postiDisabili) {
		
		ArrayList<Posto> temp = new ArrayList<>();
		
		// creo i posti platea
		for (int i = 1; i <= platea; i++) {
			temp.add(new Posto(i, "Platea"));
		}
		
		// creo i posti galleria
		for (int i = 1; i <= galleria; i++) {
			temp.add(new Posto(i, "Galleria"));
		}
		
		// creo i posti palco
		for (int i = 1; i <= palco; i++) {
			temp.add(new Posto(i, "Palco"));
		}
		
		// creo i posti disabile
		for (int i = 1; i <= postiDisabili; i++) {
			temp.add(new PostoDisabile(i, "Posto disabile", "Riservato"));
		}
		
		return temp;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Posto> getPosti() {
		return posti;
	}
	
	public void setPosti(ArrayList<Posto> posti) {
		this.posti = posti;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getPlatea() {
		return platea;
	}

	public void setPlatea(int platea) {
		this.platea = platea;
	}

	public int getGalleria() {
		return galleria;
	}

	public void setGalleria(int galleria) {
		this.galleria = galleria;
	}

	public int getPalco() {
		return palco;
	}

	public void setPalco(int palco) {
		this.palco = palco;
	}

	public int getPostiDisabili() {
		return postiDisabili;
	}

	public void setPostiDisabili(int postiDisabili) {
		this.postiDisabili = postiDisabili;
	}
  
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nTeatro '");
		builder.append(nome);
		builder.append("', ID: ");
		builder.append(id);
		builder.append("\nPosti:\n");
		
		// builder.append(posti);
		for (int i = 0; i < posti.size(); i++) {
			builder.append(posti.get(i));
			if (posti.get(i).getNumero() % 5==0) {
				builder.append("\n");
			}
		}
		
		builder.append("Posti platea: ");
		builder.append(platea);
		builder.append("\nPosti galleria: ");
		builder.append(galleria);
		builder.append("\nPosti palco: ");
		builder.append(palco);
		builder.append("\nPosti per disabili: ");
		builder.append(postiDisabili);
		return builder.toString();
	}
	
}