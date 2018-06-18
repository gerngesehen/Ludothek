package ch.gbssg.quartalsarbeit;

/**
 * Klasse des Filialleiters
 * @author joelh
 * @version 1.1
 * Diese Klasse erbt von der Klasse Person
 * Did Id ist eine Klassenvariable damit man nie eine ID 2 mal vergibt.
 * Die booleans Voristzender und Vorstand zeigen ob der Filialleiter Vorsitzender oder im Vorstand ist.
 */
public class Filialleiter extends Person {

	static private int Id;
	private boolean Vorsitzender;
	private boolean Vorstand;
	
	/**
	 * Dieser Konstruktor erstellt einen neuen Filialleiter mit einer ID, seinem Vornamen, Nachname, Geburtsdatum,
	 * seiner Adresse, Telefonnummer, Email und dem Geschlecht. Ausserdem wird festgehalten, ob er Vorsitzender oder im Vorstand ist.
	 * @param Id Id des Filialleiters
	 * @param Vorname Vorname des Filialleiters
	 * @param Nachname Nachname des Filialleiters
	 * @param Geburtsdatum Geburtsdatum des Filialleiters
	 * @param Adresse Adresse des Filialleiters
	 * @param TelefonNr TelefonNr des Filialleiters
	 * @param Email Email des Filialleiters
	 * @param Geschlecht Geschlecht des Filialleiters
	 * @param Vorsitzender boolean ob der Filialleiter Vorsitzender ist
	 * @param Vorstand boolean ob der Filialleiter im Vorstand ist
	 */
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
