
public class Brelan extends Paire { // paire + carte
	protected Carte c;
	
	public Brelan(Carte c1,Carte c2,Carte c3) {
		super(c1,c2);
		c=c3;
	}
	public Brelan(Brelan b) { 
		super(b.c1,b.c2); 
		c=b.c;
	}
	
	public String toString() {
		return "Brelan ("+c1+","+c2+","+c+")";
	}
}

