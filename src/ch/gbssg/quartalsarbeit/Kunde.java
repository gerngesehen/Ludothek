package ch.gbssg.quartalsarbeit;

/**
 * @author Pascal
 *
 */

public class Kunde extends Person{
	
	private int Id;

	private Boolean Mitglied;
	
	public Kunde(int Id, String Vorname, String Nachname, String Geburtsdatum, String Adresse, String TelefonNr,
			String Email, eGender Geschlecht, boolean Mitglied) {
		// TODO Auto-generated constructor stub
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
	
	public void Ausleihen(Spiel spiel)
	{
		int CurrentLagerbestand = spiel.getLagerbestand();
		
		if(CurrentLagerbestand <= 0) {
			System.out.println("Spiel " + spiel.getName() +" nicht vorhanden");
			return;
		}
		
		CurrentLagerbestand--;
		spiel.setLagerbestand(CurrentLagerbestand);
		
		System.out.println("Spiel " + spiel.getName() + " wurde ausgelehnt und der Lagerbestand verringert");
	}
	
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
