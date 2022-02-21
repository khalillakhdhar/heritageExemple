package heritageExemple;

public class Voiture extends Vehicule {
String carburant;
int chevaux;
public String getCarburant() {
	return carburant;
}
public void setCarburant(String carburant) {
	this.carburant = carburant;
}
public int getChevaux() {
	return chevaux;
}
public void setChevaux(int chevaux) {
	this.chevaux = chevaux;
}
public Voiture(String marque, float prix, String carburant, int chevaux) {
	super(marque, prix);
	this.carburant = carburant;
	this.chevaux = chevaux;
}
@Override
public String toString() {
	return "Voiture [carburant=" + carburant + ", chevaux=" + chevaux + ", " + super.toString() + "]";
}




}
