import java.util.ArrayList;
public class Joueur {
	private ArrayList<Carte> tabCartes; 
	private int point;
	private String nom;
	
	public Joueur(String nom){
		this.nom = nom;
		this.point = 0;
		this.tabCartes =  new ArrayList<Carte>();
	}

	public ArrayList<Carte> getTabCartes() {
		return tabCartes;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterCarte(Carte carte){
		this.tabCartes.add(carte);
	}
	public Carte tirerCarte(int a){
		Carte value = this.tabCartes.get(a);
		return value;
		
	}
	
}
