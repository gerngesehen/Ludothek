package ch.gbssg.quartalsarbeit;

import ch.gbssg.quartalsarbeit.Kunde;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kunde Sepp wird erstellt
		Kunde Sepp = new Kunde(1, "Sepp", "Eugster", "07.08.1996", "Schwammstrasse 5", "0792787048", "sepp.eugster@gbssg.ch", eGender.MALE, false);
		
		//Kunde wird Mitglied
		Sepp.setMitglied(true);
		
		Spiel CSGO = new Spiel(1, "CSGO", eKategorien.OBERSTUFE, 34.99);
				
		Sepp.Ausleihen(CSGO);		
		Sepp.Ausleihen(CSGO);		
		Sepp.zurueckgeben(CSGO);	
		Sepp.Ausleihen(CSGO);
		
		Filialleiter Hans = new Filialleiter(1, "Hans", "Lingg", "04.28.1992","Musterstrasse 1","0798909876","hans.lingg@gbssg.ch", eGender.MALE, false, false);
		Filiale Oberriet = new Filiale(1, "Oberriet", "Staatsstrasse 12", Hans);
		
		Mitarbeiter Peter = new Mitarbeiter(1, "Peter", "Hallauer", "07.08.1988", "Rietliweg 4", "0792777048", "peter.hallauer@gbssg.ch", eGender.MALE);
		Oberriet.addMitarbeiter(Peter);
	}
}
