
public class Paire { // carte + carte (meme valeur)
	protected Carte c1, c2;
	
	public Paire (Carte c1, Carte c2) { 
		this.c1=c1;
		this.c2=c2;
	}
	public Paire (Paire p) {
		c1=p.c1;
		c2=p.c2;
	}
	
	public String toString() {
		return "Paire ("+c1+","+c2+")";
	}
}

