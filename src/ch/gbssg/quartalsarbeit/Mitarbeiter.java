package ch.gbssg.quartalsarbeit;

public class Mitarbeiter {
	
	private int Id;
	private String Vorname;
	private String Nachname;
	private String Geburtsdatum;
	private String Adresse;
	private String Telefonnummer;
	private String Email;
	private eGender Geschlecht;
	
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
}
