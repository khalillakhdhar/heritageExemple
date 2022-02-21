package heritageExemple;

public class Bike extends Vehicule {
private int hauteur;

public int getHauteur() {
	return hauteur;
}

public void setHauteur(int hauteur) {
	this.hauteur = hauteur;
}

public Bike(String marque, float prix, int hauteur) {
	super(marque, prix);
	this.hauteur = hauteur;
}

@Override
public String toString() {
	return "Bike [hauteur=" + hauteur + ", toString()=" + super.toString() + "]";
}

}
