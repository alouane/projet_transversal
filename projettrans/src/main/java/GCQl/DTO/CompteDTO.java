package GCQl.DTO;

import javax.persistence.Column;

public class CompteDTO {
	 
	private int idcompte;
	
	private int promotion_idpromotion;
	
	private int cne;

	private String cin;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String previlege;

	public int getIdcompte() {
		return idcompte;
	}

	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}

	public int getPromotion_idpromotion() {
		return promotion_idpromotion;
	}

	public void setPromotion_idpromotion(int promotion_idpromotion) {
		this.promotion_idpromotion = promotion_idpromotion;
	}

	public int getCne() {
		return cne;
	}

	public void setCne(int cne) {
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
