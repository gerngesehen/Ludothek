package ch.gbssg.quartalsarbeit;

/**
 * @author Pascal
 *
 */

public class Kunde {
	
	private int Id;
	private String Vorname;
	private String Nachname;
	private String Geburtsdatum;
	private String Adresse;
	private String Telefonnummer;
	private String Email;
	private eGender Geschlecht;
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
		
		System.out.println("Spiel " + spiel.getName() + " wurde zur�ckgebracht und der Lagerbestand erh�ht");
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getGeburtsdatum() {
		return Geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelefonnummer() {
		return Telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		Telefonnummer = telefonnummer;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public eGender getGeschlecht() {
		return Geschlecht;
	}

	public void setGeschlecht(eGender geschlecht) {
		Geschlecht = geschlecht;
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
