
public abstract class CinqCartes { // classe de base pour Quinte et Flush
	protected Carte c1,c2,c3,c4,c5;
	
	public CinqCartes(Carte c1,Carte c2,Carte c3,Carte c4,Carte c5) {
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		this.c4=c4;
		this.c5=c5;
	}
	
	protected String cartesToString() { 
		return "("+c1+","+c2+","+c3+","+c4+","+c5+")";
	}
}

