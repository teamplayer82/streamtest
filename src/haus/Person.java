package haus;

public class Person {

	//Attribute
	private String Vorname;
	private String Nachname;
	private int Alter;
	
	//Getter und Setter
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
	public int getAlter() {
		return Alter;
	}
	public void setAlter(int alter) {
		Alter = alter;
	}
	
	//Konstruktor
	public Person(String vorname, String nachname, int alter) {
		setVorname(vorname);
		setNachname(nachname);
		setAlter(alter);
	}
}
