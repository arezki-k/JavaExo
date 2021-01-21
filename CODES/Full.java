
public class Full extends Brelan { // brelan + paire
	protected Paire p;
	
	public Full(Brelan b,Paire p) {
		super(b);
		this.p=p;
	}
	
	public String toString() {
		return "Full ("+super.toString()+","+p+")";
	}
}

