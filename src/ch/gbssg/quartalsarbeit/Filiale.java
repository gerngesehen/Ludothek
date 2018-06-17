package ch.gbssg.quartalsarbeit;

public class Filiale {

	private int ID;
	private String Name;
	private String Adresse;
	private Filialleiter filialleiter;
	private Mitarbeiter Stellvertreter;
	private Mitarbeiter[] Mitarbeiter;
	
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
		return filialleiter;
	}
	public void setFilialleiter(Filialleiter filialleiter) {
		this.filialleiter = filialleiter;
	}
	public Mitarbeiter getStellvertreter() {
		return Stellvertreter;
	}
	public void setStellvertreter(Mitarbeiter stellvertreter) {
		Stellvertreter = stellvertreter;
	}
	public Mitarbeiter[] getMitarbeiter() {
		return Mitarbeiter;
	}
	public void setMitarbeiter(Mitarbeiter[] mitarbeiter) {
		Mitarbeiter = mitarbeiter;
	}
	public int getID() {
		return ID;
	}
	
}
