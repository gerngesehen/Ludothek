package ch.gbssg.quartalsarbeit;

public class Filialleiter extends Person {

	static private int Id;
	private boolean Vorsitzender;
	private boolean Vorstand;
	
	public Filialleiter(int Id, String Vorname, String Nachname, String Geburtsdatum, String Adresse, String TelefonNr,
			String Email, eGender Geschlecht, boolean Vorsitzender, boolean Vorstand) {
		this.Id = Id;
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Geburtsdatum = Geburtsdatum;
		this.Adresse = Adresse;
		this.Telefonnummer = TelefonNr;
		this.Email = Email;
		this.Geschlecht = Geschlecht;
		this.Vorsitzender = Vorsitzender;
		this.Vorstand = Vorstand;
		
		System.out.println("Der Filialleiter " + Nachname +" " +  Vorname + " wurde erstellt");
	}	
}
