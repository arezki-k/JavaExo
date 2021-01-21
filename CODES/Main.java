
public class Main {
	protected Carte c1, c2, c3, c4, c5; // 5 cartes
	
	public Main(Carte c1, Carte c2, Carte c3, Carte c4, Carte c5) {
		this.c1=c1; 
		this.c2=c2; 
		this.c3=c3; 
		this.c4=c4;
		this.c5=c5; 
		trier();
	}
	
	public Main(Carte[] cs) {
		c1=cs[0]; 
		c2=cs[1]; 
		c3=cs[2]; 
		c4=cs[3];
		c5=cs[4]; 
		trier();
	}
	
	public void trier() {  // tri par la methode des bulles
		Carte c;
		if (c1.estInferieureA(c2)) { c=c1; c1=c2; c2=c; } // 1
		if (c2.estInferieureA(c3)) { c=c2; c2=c3; c3=c; }
		if (c3.estInferieureA(c4)) { c=c3; c3=c4; c4=c; }
		if (c4.estInferieureA(c5)) { c=c4; c4=c5; c5=c; }
		if (c1.estInferieureA(c2)) { c=c1; c1=c2; c2=c; } // 2
		if (c2.estInferieureA(c3)) { c=c2; c2=c3; c3=c; }
		if (c3.estInferieureA(c4)) { c=c3; c3=c4; c4=c; }
		if (c1.estInferieureA(c2)) { c=c1; c1=c2; c2=c; } // 3
		if (c2.estInferieureA(c3)) { c=c2; c2=c3; c3=c; }
		if (c1.estInferieureA(c2)) { c=c1; c1=c2; c2=c; } // 4
	}
	
	public Object extraire() {
		int i; 
		boolean b1, b2; 
		Brelan b; 
		Paire p1, p2;
		b1=memeCouleur();
		b2=suiteDecroissante();
		if (b1 && b2) 
			return new QuinteFlush(c1,c2,c3,c4,c5); // Quinte flush
		if (c1.valeur()==c2.valeur() && c2.valeur()==c3.valeur() &&
			c3.valeur()==c4.valeur())
			return new Poker(c1,c2,c3,c4);
		if (c2.valeur()==c3.valeur() && c3.valeur()==c4.valeur() &&
			c4.valeur()==c5.valeur())
			return new Poker(c2,c3,c4,c5);
		b=brelan();
		p1=paire();
		if (b!=null && p1!=null) { // Full
			return new Full(b,p1);
		}
		if (b1) return new Flush(c1,c2,c3,c4,c5); // Flush
		if (b2) return new Quinte(c1,c2,c3,c4,c5); // Quinte
		if (b!=null) return b; // Brelan
		p2=paire();
		if (p1!=null && p2!=null) // Deux paires
			return new DeuxPaires(p1,p2);
		if (p1!=null) return p1; // Paire
		return c1;
	}
	
	// les 3 cartes d'un brelan sont consecutives (triees)
	// il ne peut y avoir qu'un seul brelan par main
	// pour une main c1 c2 c3 c4 c5 on a 3 cas : c1 c2 c3 ou c2 c3 c4 ou c3 c4 c5
	public Brelan brelan() {
		if (brelan(c1,c2,c3)) return new Brelan(c1,c2,c3);
		if (brelan(c2,c3,c4)) return new Brelan(c2,c3,c4);
		if (brelan(c3,c4,c5)) return new Brelan(c3,c4,c5);
		return null;
	}
	
	public boolean brelan(Carte c1,Carte c2,Carte c3) {
		if (c1.valeur()==c2.valeur() && c2.valeur()==c3.valeur()) {
			c1.marquer(); 
			c2.marquer(); 
			c3.marquer(); 
			return true;
		}
		return false;
	}
	
	// les 2 cartes d'une paire sont consecutives (triees)
	// il ne peut y avoir que 2 paires par main
	// pour une main c1 c2 c3 c4 c5 on a 4 cas : c1 c2 ou c2 c3 ou c3 c4 ou c4 c5
	public Paire paire() {
		if (paire(c1,c2)) return new Paire(c1,c2);
		if (paire(c2,c3)) return new Paire(c2,c3);
		if (paire(c3,c4)) return new Paire(c3,c4);
		if (paire(c4,c5)) return new Paire(c4,c5);
		return null;
	}
	
	public boolean paire(Carte c1,Carte c2) {
		if (!c1.estMarque() && !c2.estMarque() && c1.valeur()==c2.valeur()) { 
			c1.marquer(); c2.marquer(); return true;
		}
		return false;
	}
	
	public boolean memeCouleur() {
		return c1.couleur()==c2.couleur() && c2.couleur()==c3.couleur() &&
			c3.couleur()==c4.couleur() && c4.couleur()==c5.couleur();
	}
	
	public boolean suiteDecroissante() {
		if (c2.valeur()!=c3.valeur()+1 || // quatre dernieres cartes
		    c3.valeur()!=c4.valeur()+1 ||
		    c4.valeur()!=c5.valeur()+1) return false;
		if (c1.valeur()==c2.valeur()+1) return true; // deux premieres
		else if (c1.valeur()==Carte.AS && c5.valeur()==Carte.DEUX) { 
			// deux et as
			Carte c=c1;
			c1=c2; 
			c2=c3; 
			c3=c4; 
			c4=c5; // decalage des cartes
			c5=c;
			return true;
		} else return false;
	}
	
	public String toString() {
		return "Main	("+c1+","+c2+","+c3+","+c4+","+c5+")";
	}
}

