package ch.gbssg.quartalsarbeit;

/**
 * Filialenklasse
 * @author joelh
 */
public class Filiale {

	private int ID;
	private String Name;
	private String Adresse;
	private Filialleiter Filialleiter;
	static private Mitarbeiter [] MitarbeiterArray = new Mitarbeiter[10];
	static private int AnzahlMitarbeier = 0;

	/**
	 * Dieser Konstruktor erstellt eine neue Filiale mit einer ID, dem Namen, der Adresse und dem Filialleiter
	 * @param ID Id der neuen Filiale
	 * @param Name Name der neuen Filiale
	 * @param Adresse Adresse der neuen Filiale
	 * @param Filialleiter der Filialleiter der neuen Filiale
	 */
	public Filiale(int ID, String Name , String Adresse,Filialleiter Filialleiter){
		this.Filialleiter = Filialleiter;
		System.out.println("Neu Filiale " + Name + " in " + Adresse + " wurde angelegt");
	}
	
	/**
	 * Diese Methode füngt ein neuer Mitarbeiter zur Filialie hinzu.
	 * @param Mitarbeiter Das ist der Mitarbeiter der in dieser Filiale arbeiten soll.
	 */
	public void addMitarbeiter(Mitarbeiter Mitarbeiter) {
		this.MitarbeiterArray[AnzahlMitarbeier] = Mitarbeiter;
		AnzahlMitarbeier++;
		System.out.println("Neuer Mitarbeiter " + Mitarbeiter.getVorname() + " eingestellt");
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getAdresse() {
		return Adresse;
	}
	
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public Filialleiter getFilialleiter() {
		return Filialleiter;
	}
	
	public void setFilialleiter(Filialleiter filialleiter) {
		Filialleiter = filialleiter;
	}
	
	public int getID() {
		return ID;
	}
}