package ch.gbssg.quartalsarbeit;

import ch.gbssg.quartalsarbeit.Kunde;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kunde Sepp wird erstellt
		Kunde Sepp = new Kunde(1, "Sepp", "Eugster", "07.08.1996", "Schwammstrasse 5", "0792787048", "sepp.eugster@gbssg.ch", eGender.MALE, false);
		
		//Kunde wird Mitglied
		Sepp.setMitglied(true);
		
		Spiel CSGO = new Spiel(5, "CSGO", eKategorien.OBERSTUFE, 34.99);
				
		Sepp.Ausleihen(CSGO);		
		Sepp.zurueckgeben(CSGO);
	
		
	}

}
