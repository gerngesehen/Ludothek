package ch.gbssg.quartalsarbeit;
/**
 * Dies ist die Oberste Klasse für alle Klassen die mit einer Person zu tun haben. Also alle Klassen erben
 * von dieser Klasse.
 * @author joelh
 * @version 1.1
 *
 */
public class Person {
	protected String Vorname;
	protected String Nachname;
	protected String Geburtsdatum;
	protected String Adresse;
	protected String Telefonnummer;
	protected String Email;
	protected eGender Geschlecht;
	
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
}
