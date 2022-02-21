package heritageExemple.exemple2;

public class Etudiant extends Personne {
private String niveauScholaire;

public Etudiant(String nom, String prenom, int age, String niveauScholaire) {
	super(nom, prenom, age);
	this.niveauScholaire = niveauScholaire;
}

public String getNiveauScholaire() {
	return niveauScholaire;
}

public void setNiveauScholaire(String niveauScholaire) {
	this.niveauScholaire = niveauScholaire;
}




}
