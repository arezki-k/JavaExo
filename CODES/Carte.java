class Carte {
	static final int PIQUE=0, TREFLE=1, CARREAU=2, COEUR=3;
	static final int AS=12, ROI=11, DAME=10, VALET=9, DIX=8, NEUF=7,
		HUIT=6, SEPT=5, SIX=4, CINQ=3, QUATRE=2, TROIS=1, DEUX=0;
	static final String[] COULEURS={"pique","trefle","carreau","coeur"};
	static final String[] VALEURS=
	{"2","3","4","5","6","7","8","9","10","valet","dame","roi","as"};
	
	protected int couleur,valeur; // couleur valeur
	protected boolean marque;     // marque
	
	public Carte() {}
	public Carte(int v,int c) {
		valeur=v; couleur=c;
	}
	
	public int couleur() {
		return couleur;
	}
	public int valeur() {
		return valeur;
	}
	public boolean estInferieureA(Carte c) {
		return valeur<c.valeur;
	}
	public void marquer() {
		marque=true;
	}
	public boolean estMarque() {
		return marque;
	}
	public String toString() {
		return VALEURS[valeur]+" de "+COULEURS[couleur];
	}
}

