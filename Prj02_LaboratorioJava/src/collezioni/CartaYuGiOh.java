package collezioni;

public class CartaYuGiOh {
	
	private String nome;
	private int atk;
	private int def;
	
	public CartaYuGiOh(String nome, int atk, int def) {
		super();
		this.nome = nome;
		this.atk = atk;
		this.def = def;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	@Override
	public String toString() {
		return "[\"" + nome + "\" ATK/ " + atk + " DEF/ " + def + "]";
	}	
	
}