package ch.gbssg.quartalsarbeit;

/**
 * Klasse der Mitarbeiter
 * @author joelh
 * @version 1.3
 * Diese Klasse erbt vond der Klasser Person.
 */
public class Mitarbeiter extends Person {
	
	static private int Id;
	private boolean Angestellt = false;
	
	/**
	 * Dieser Konstruktor erstellt einen neuen Mitarbeiter mit einer ID, seinem Vornamen, Nachname, Geburtsdatum,
	 * seiner Adresse, Telefonnummer, Email und dem Geschlecht.
	 * @param Id Id des Mitarbeiters
	 * @param Vorname Vorname des Mitarbeiters
	 * @param Nachname Nachname des Mitarbeiters
	 * @param Geburtsdatum Geburtsdatum des Mitarbeiters
	 * @param Adresse Adresse des Mitarbeiters
	 * @param TelefonNr TelefonNr des Mitarbeiters
	 * @param Email Email des Mitarbeiters
	 * @param Geschlecht Geschlecht des Mitarbeiters
	 */
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

	public boolean isAngestellt() {
		return Angestellt;
	}

	public void setAngestellt(boolean angestellt) {
		Angestellt = angestellt;
	}
}
