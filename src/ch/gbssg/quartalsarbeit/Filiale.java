package ch.gbssg.quartalsarbeit;

public class Filiale {

	private int ID;
	private String Name;
	private String Adresse;
	private Filialleiter Filialleiter;
	static private Mitarbeiter [] MitarbeiterArray = new Mitarbeiter[10];
	static private int AnzahlMitarbeier = 0;


	public Filiale(int ID, String Name , String Adresse,Filialleiter Filialleiter){
		this.Filialleiter = Filialleiter;
		System.out.println("Neu Filiale " + Name + " in " + Adresse + " wurde angelegt");
	}
	
	public void addMitarbeiter(Mitarbeiter Mitarbeiter) {
		this.MitarbeiterArray[AnzahlMitarbeier] = Mitarbeiter;
		AnzahlMitarbeier++;
		System.out.println("Neuer Mitarbeiter " + Mitarbeiter.getVorname() + " eingestellt in " + this.Name);
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