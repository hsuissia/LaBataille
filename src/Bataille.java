import java.util.ArrayList;


public class Bataille {
	
	public static void main(String[] args){
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		String couleur = "";
		int distrib = 0;
		int taillePaquet = 52;
		Joueur j1 = new Joueur("Jean");
		Joueur j2 = new Joueur("Charles");
		for (int i = 0; i < 4; i++){
			if (i == 0){
				couleur = "coeur"; 
			}
			if (i == 1){
				couleur = "carreau"; 
			}
			if (i == 2){
				couleur = "pique"; 
			}
			if (i == 3){
				couleur = "trèfle"; 
			}
			for (int a = 1; a < 14; a++){
				paquet.add(new Carte(couleur,a));
			}
		}
		int tailleInitial = paquet.size();
		for(int b = 0; b < tailleInitial ;b++) {
			int random = (int)(Math.random() * (taillePaquet - 0));
			if( distrib == 0){
				j1.ajouterCarte(paquet.get(random));
				paquet.remove(random);
				taillePaquet--;
				distrib++;
			}
			else{
				j2.ajouterCarte(paquet.get(random));
				paquet.remove(random);
				taillePaquet--;
				distrib--;
			}
		}
		
		for (int c = 0; c < 26; c++){
			Carte carteJ1 = j1.tirerCarte(c);
			Carte carteJ2 = j2.tirerCarte(c);
			String resultat = carteJ1.comparer(carteJ2);
			if(resultat == "Gagné"){
				j1.setPoint(j1.getPoint()+1);
			}
			else if (resultat == "Perdu"){
				j2.setPoint(j2.getPoint()+1);
			}
			System.out.println(j1.getNom()+" : "+j1.getPoint()+" - "+j2.getPoint()+" : "+j2.getNom());
			
		}
		if(j1.getPoint()>j2.getPoint()){
			System.out.println("Le gagnant est "+j1.getNom());
		}
		else {
			System.out.println("Le gagnant est "+j2.getNom());
		}
		
		
	}
}
