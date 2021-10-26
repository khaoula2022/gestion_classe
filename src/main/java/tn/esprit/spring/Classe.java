package tn.esprit.spring;

public class Classe {
	int id ;
	String niveau ;
	String caracteristiques ;
	int nbEleves ;
	String adresseMail ;
	public int getId() {
		return id;
	}
	public Classe() {
		super();
	}
	public Classe(String niveau, String caracteristiques, int nbEleves, String adresseMail) {
		super();
		this.niveau = niveau;
		this.caracteristiques = caracteristiques;
		this.nbEleves = nbEleves;
		this.adresseMail = adresseMail;
	}
	@Override
	public String toString() {
		return "Classe [niveau=" + niveau + ", caracteristiques=" + caracteristiques + ", nbEleves=" + nbEleves
				+ ", adresseMail=" + adresseMail + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	public int getNbEleves() {
		return nbEleves;
	}
	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	

}
