package ch.gbssg.quartalsarbeit;

/**
 * Klasse für den Kunden
 * @author joelh
 * @version 1.4
 * Diese Klasse hängt von der Klasse Person ab
 */
public class Kunde extends Person{
	
	private int Id;

	private Boolean Mitglied;
	
	/**
	 * Dieser Konstruktor erstellt einen neuen Kunden mit einer ID, seinem Vornamen, Nachname, Geburtsdatum,
	 * seiner Adresse, Telefonnummer, Email und dem Geschlecht.
	 * @param Id Id des Kunden
	 * @param Vorname Vornamen des Kunden
	 * @param Nachname Nachnamen des Kunden
	 * @param Geburtsdatum Geburtsdatum des Kunden
	 * @param Adresse Adresse des Kunden
	 * @param TelefonNr TelefonNr des Kunden
	 * @param Email Email des Kunden
	 * @param Geschlecht Geschlecht des Kunden
	 * @param Mitglied boolean ob der Kunde Mitglied ist.
	 */
	public Kunde(int Id, String Vorname, String Nachname, String Geburtsdatum, String Adresse, String TelefonNr,
			String Email, eGender Geschlecht, boolean Mitglied) {
		this.Id = Id;
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Geburtsdatum = Geburtsdatum;
		this.Adresse = Adresse;
		this.Telefonnummer = TelefonNr;
		this.Email = Email;
		this.Geschlecht = Geschlecht;
		this.Mitglied = Mitglied;
	}
	
	/**
	 * Diese Methode wird aufgerufen wenn ein Kunde ein Spiel ausleihen möchte.
	 * @param spiel Das Spiel das Ausgeliehen werden soll
	 */
	public void Ausleihen(Spiel spiel)
	{
		int CurrentLagerbestand = spiel.getLagerbestand();
		
		/**
		 * Hier wird geprüft ob das Spiel noch vorhanden ist.
		 */
		if(CurrentLagerbestand <= 0) {
			System.out.println("Spiel " + spiel.getName() +" nicht vorhanden");
			return;
		}
		
		/**
		 * Hier wird geprüft ob der Kunde ein Mitglied ist.
		 */
		if(this.Mitglied == true) {
			System.out.println("Mitgliederrabatt wird dem Kunden" + this.Vorname + "gutgeschrieben");
		}
		
		CurrentLagerbestand--;
		spiel.setLagerbestand(CurrentLagerbestand);
		
		System.out.println("Spiel " + spiel.getName() + " wurde ausgelehnt und der Lagerbestand verringert");
	}
	
	/**
	 * Diese Methode wird aufgerufen wenn ein Spiel zurückgegeben wurde
	 * @param spiel Das Spiel das zurückgegeben wurde
	 */
	public void zurueckgeben(Spiel spiel)
	{
		int CurrentLagerbestand = spiel.getLagerbestand();
				
		CurrentLagerbestand++;
		spiel.setLagerbestand(CurrentLagerbestand);
		
		System.out.println("Spiel " + spiel.getName() + " wurde zurückgebracht und der Lagerbestand erhöht");
	}

	public int getId() {
		return Id;
	}

	
	public Boolean getMitglied() {
		return Mitglied;
	}

	public void setMitglied(Boolean mitglied) {
		Mitglied = mitglied;
	}
	
}
