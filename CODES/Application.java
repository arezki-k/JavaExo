
public class Application {
	static final int PIQUE=0, TREFLE=1, CARREAU=2, COEUR=3;
	static final int AS=12, ROI=11, DAME=10, VALET=9, DIX=8, NEUF=7, HUIT=6,
		SEPT=5,SIX=4, CINQ=3, QUATRE=2, TROIS=1, DEUX=0;
	
	public static void main(String args[]) {
		System.out.println();
		Main m0=new Main(new Carte[] {
			new Carte(AS,PIQUE),new Carte(AS,COEUR),new Carte(AS,TREFLE),
			new Carte(VALET,PIQUE),new Carte(VALET,COEUR)});
		System.out.println(m0);
		System.out.println(m0.extraire());
		Main m1=new Main(new Carte[] {
			new Carte(AS,PIQUE),new Carte(ROI,PIQUE),new Carte(DAME,PIQUE),
			new Carte(VALET,PIQUE),new Carte(DIX,PIQUE)});
		System.out.println(m1);
		System.out.println(m1.extraire());
		Main m2=new Main(new Carte[] {
			new Carte(AS,PIQUE),new Carte(CINQ,PIQUE),new Carte(QUATRE,PIQUE),
			new Carte(TROIS,PIQUE),new Carte(DEUX,PIQUE)});
		System.out.println(m2);
		System.out.println(m2.extraire());
	}
}

// resultat d'execution
/*
Main (as de pique,as de coeur,as de trefle,valet de pique,valet de coeur)
Full (Brelan (as de pique,as de coeur,as de trefle),Paire (valet de
pique,valet de coeur))

Main (as de pique,roi de pique,dame de pique,valet de pique,10 de pique)
Quinte flush (as de pique,roi de pique,dame de pique,valet de pique,10 de
pique)

Main (as de pique,5 de pique,4 de pique,3 de pique,2 de pique)
Quinte flush (5 de pique,4 de pique,3 de pique,2 de pique,as de pique)
*/
