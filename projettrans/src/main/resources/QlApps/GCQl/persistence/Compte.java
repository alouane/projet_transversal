package GCQl.persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.persistence.GeneratedValue;//utilisé pour la génération automatique des id 
//import javax.persistence.GenerationType;//idem
import javax.persistence.Id;


@Entity
@Table(name="compte")

public class Compte implements Serializable {
	
	private static final long serialVersionUID = 1832981588029828559L;
	
	@Id
	private int idcompte;
	@Column
	private int promotion_idpromotion;
	@Column
	private int cne;
	@Column
	private String cin;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String email;
	@Column
	private String previlege;
	@Column
	
	
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









