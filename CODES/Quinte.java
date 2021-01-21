
public class Quinte extends CinqCartes { // 5 cartes qui se suivent
	
	public Quinte(Carte c1,Carte c2,Carte c3,Carte c4,Carte c5) {
		super(c1,c2,c3,c4,c5);
	}
	
	public String toString() { return "Quinte "+cartesToString(); }
}


