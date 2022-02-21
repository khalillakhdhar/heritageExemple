package heritageExemple;

public class Vehicule {
	
private String marque;
private float prix;
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public Vehicule(String marque, float prix) {
	super();
	this.marque = marque;
	this.prix = prix;
}
@Override
public String toString() {
	return "Vehicule [marque=" + marque + ", prix=" + prix + "]";
}
public Vehicule() {
	super();
	// TODO Auto-generated constructor stub
}


}
