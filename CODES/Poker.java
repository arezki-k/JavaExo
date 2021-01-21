
public class Poker extends Brelan { // 4 meme valeur
	protected Carte c;
	
	public Poker(Carte c1,Carte c2,Carte c3,Carte c4) {
		super(c1,c2,c3);
		c=c4;
	}
	
	public String toString() {
		return "Poker ("+c1+","+c2+","+super.c+","+c+")";
	}
}

