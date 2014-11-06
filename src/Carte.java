
public class Carte {
	private String couleur;
	private int valeur;
	
	public Carte(String couleur, int valeur){
		this.couleur = couleur;
		this.valeur = valeur;
		
		
	}
	public Carte(){
		this.couleur = "Coeur";
		this.valeur = 1;
		
	}
	

	public String getCouleur() {
		return couleur;
	}

	public int getValeur() {
		return valeur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public String comparer(Carte c2){ 
		if (this.getValeur() == 1){
			if (c2.getValeur()==1){
				return "Egalité";
			}
			else{
				return "Gagné";
			}
		}
		if (c2.getValeur() == 1){
			if (this.getValeur()==1){
				return "Egalité";
			}
			else{
				return "Perdu";
			}
		}
		if (this.getValeur() > c2.getValeur()){
			return "Gagné";
		}
		else if(this.getValeur() == c2.getValeur()){
			return "Egalité";
		}
		else {
			return "Perdu";
		}
		
		
	}

}
