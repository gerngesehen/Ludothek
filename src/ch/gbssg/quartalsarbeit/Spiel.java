package ch.gbssg.quartalsarbeit;

/**
 * Klasse für die Spiele
 * @author joelh
 * @version 1.4
 */
public class Spiel {

static private int Lagerbestand;
private String name;
private eKategorien kategorie;
private double Preis;

/**
 * Dieser Konstruktor erstellt ein neues Spiel mit dem Lagerbestand, Namen des Spiels, der Kategorie und dem Preis
 * @param Lagerbestand Lagerbestand des Spiels
 * @param name Name des Spiels
 * @param Kategorie Kategorie in die das Spiel eingeteilt wurde
 * @param Preis Preis der das Spiel kostet
 */
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

