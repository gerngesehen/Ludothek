package ch.gbssg.quartalsarbeit;

public class Spiel {

private int Lagerbestand;
private String name;
private eKategorien kategorie;
private double Preis;

public Spiel(int Lagerbestand, String name, eKategorien Kategorie, double Preis) {
	this.name = name;
	this.Lagerbestand = Lagerbestand;
	this.kategorie = Kategorie;
	this.Preis = Preis;
}

public int getLagerbestand() {
	return Lagerbestand;
}
public void setLagerbestand(int lagerbestand) {
	Lagerbestand = lagerbestand;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public eKategorien getKategorie() {
	return kategorie;
}
public void setKategorie(eKategorien kategorie) {
	this.kategorie = kategorie;
}
public double getPreis() {
	return Preis;
}
public void setPreis(double preis) {
	Preis = preis;
}

}

