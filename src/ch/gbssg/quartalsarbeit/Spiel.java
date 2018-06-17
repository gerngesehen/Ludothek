package ch.gbssg.quartalsarbeit;


public enum Kategorie {
    Unterstufe, Mittelstufe, Oberstufem, 
}

public class Spiel {

private int Lagerbestand;
private String name;
private Kategorie kategorie;
private int Preis;

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
public Kategorie getKategorie() {
	return kategorie;
}
public void setKategorie(Kategorie kategorie) {
	this.kategorie = kategorie;
}
public int getPreis() {
	return Preis;
}
public void setPreis(int preis) {
	Preis = preis;
}

}

