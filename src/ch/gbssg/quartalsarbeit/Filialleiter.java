package ch.gbssg.quartalsarbeit;

public class Filialleiter {

	private String Name;
	private String Vorname;
	private String Telefon;
	private boolean Vorsitzender;
	private boolean Vorstand;
	
	public Filialleiter(String Name, String Vorname, String Telefon, boolean Vorsitzender, boolean Vorstand) {
		this.Name = Name;
		this.Vorname = Vorname;
		this.Telefon = Telefon;
		this.Vorsitzender = Vorsitzender;
		this.Vorstand = Vorstand;
		
		System.out.println("Der Filialleiter " + Name +" " +  Vorname + " wurde erstellt");
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	public boolean isVorsitzender() {
		return Vorsitzender;
	}
	public void setVorsitzender(boolean vorsitzender) {
		Vorsitzender = vorsitzender;
	}
	public boolean isVorstand() {
		return Vorstand;
	}
	public void setVorstand(boolean vorstand) {
		Vorstand = vorstand;
	}
	
}
