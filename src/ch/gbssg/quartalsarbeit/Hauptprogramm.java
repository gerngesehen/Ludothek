package ch.gbssg.quartalsarbeit;

import ch.gbssg.quartalsarbeit.Kunde;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kunde Sepp wird erstellt
		Kunde Sepp = new Kunde(1, "Sepp", "Eugster", "07.08.1996", "Schwammstrasse 5", "0792787048", "sepp.eugster@gbssg.ch", true, false);
		
		//Kunde wird Mitglied
		Sepp.setMitglied(true);
		
		
	}

}
