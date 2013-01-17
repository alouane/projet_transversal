package org.claros.chat.models;

public class Compte {
	
	int idcompte;
	String user_name;
	String password;
	int id_promotion;
	long cne;
	String cin;
	String nom;
	String prenom;
	String email;
	String previlege;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_promotion() {
		return id_promotion;
	}
	public void setId_promotion(int id_promotion) {
		this.id_promotion = id_promotion;
	}
	public long getCne() {
		return cne;
	}
	public void setCne(long cne) {
		this.cne = cne;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrevilege() {
		return previlege;
	}
	public void setPrevilege(String previlege) {
		this.previlege = previlege;
	}
	
}
