
public class DeuxPaires extends Paire { // paire + paire
	protected Paire p;
	
	public DeuxPaires(Paire p1,Paire p2) {
		super(p1);
		p=p2;
	}
	
	public String toString() {
		return "Deux paires ("+super.toString()+","+p+")";
	}
}

