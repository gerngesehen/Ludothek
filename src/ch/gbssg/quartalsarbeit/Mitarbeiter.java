package ch.gbssg.quartalsarbeit;

public class Mitarbeiter extends Person {
	
	private int Id;
	
	public Mitarbeiter(int Id, String Vorname, String Nachname, String Geburtsdatum, String Adresse, String TelefonNr,
			String Email, eGender Geschlecht) {
		this.Id = Id;
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Geburtsdatum = Geburtsdatum;
		this.Adresse = Adresse;
		this.Telefonnummer = TelefonNr;
		this.Email = Email;
		this.Geschlecht = Geschlecht;
		
		System.out.println("Neuer Mitarbeiter " + Vorname + " angelegt");
	}
	
	public int getId() {
		return Id;
	}
}
