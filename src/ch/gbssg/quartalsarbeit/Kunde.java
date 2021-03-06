package ch.gbssg.quartalsarbeit;

/**
 * Klasse f�r den Kunden
 * @author joelh
 * @version 1.4
 * Diese Klasse h�ngt von der Klasse Person ab
 */
public class Kunde extends Person{
	
	private int Id;
	private int CurrentAusgeliehen = 0;

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
	 * Diese Methode wird aufgerufen wenn ein Kunde ein Spiel ausleihen m�chte.
	 * @param spiel Das Spiel das Ausgeliehen werden soll
	 * @return true wenn das Spiel erfolgreich ausgelehnt wurde und false falls es fehlgeschlagen ist
	 */
	public boolean Ausleihen(Spiel spiel)
	{
		int CurrentLagerbestand = spiel.getLagerbestand();
		
		/**
		 * Hier wird gepr�ft ob das Spiel noch vorhanden ist.
		 */
		if(CurrentLagerbestand <= 0) {
			System.out.println("Spiel " + spiel.getName() +" nicht vorhanden");
			return false;
		}
		
		/**
		 * Hier wird gepr�ft ob der Kunde ein Mitglied ist.
		 */
		if(this.Mitglied == true) {
			System.out.println("Mitgliederrabatt wird dem Kunden" + this.Vorname + "gutgeschrieben");
		}
		
		if(this.CurrentAusgeliehen >= 3) {
			System.out.println("Schon mehr als 3 Spiele ausgeliehen");
			return false;
		}
		
		CurrentLagerbestand--;
		CurrentAusgeliehen++;
		spiel.setLagerbestand(CurrentLagerbestand);
		
		System.out.println("Spiel " + spiel.getName() + " wurde ausgelehnt und der Lagerbestand verringert");
		return true;
	}
	
	/**
	 * Diese Methode wird aufgerufen wenn ein Spiel zur�ckgegeben wurde
	 * @param spiel Das Spiel das zur�ckgegeben wurde
	 */
	public boolean zurueckgeben(Spiel spiel)
	{
		if(CurrentAusgeliehen <= 0) {
			System.out.println(this.Vorname + "hat momentan kein Spiel ausgeliehen");
			return false;			
		}
		
		int CurrentLagerbestand = spiel.getLagerbestand();
				
		CurrentLagerbestand++;
		spiel.setLagerbestand(CurrentLagerbestand);
		System.out.println("Spiel " + spiel.getName() + " wurde zur�ckgebracht und der Lagerbestand erh�ht");
		return true;
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
