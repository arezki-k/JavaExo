
public class QuinteFlush extends Quinte { // quinte + flush
	
	QuinteFlush(Carte c1,Carte c2,Carte c3,Carte c4,Carte c5) {
		super( c1,c2,c3,c4,c5); 
	}
	
	public String toString() {
		return "Quinte flush "+cartesToString();
	}
}

