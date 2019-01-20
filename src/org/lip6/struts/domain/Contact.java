package org.lip6.struts.domain;

import java.util.List;

public class Contact {

	private int idContact;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String ville;
	private String rue;
	private int codePostal;
	private String pays;
	private Boolean entreprise;
	private String numTel;
	private String numFixe;
	// clé étrangère vers contactGroupe
	private GroupeContact idGroupe;
	
	

	public Contact() {
		super();
	}

	public Contact(int idContact, String nom, String prenom, String email, String adresse, String ville, String rue,
			int codePostal, String pays, Boolean entreprise, String numTel, String numFixe, GroupeContact idGroupe) {
		super();
		this.idContact = idContact;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.rue = rue;
		this.codePostal = codePostal;
		this.pays = pays;
		this.entreprise = entreprise;
		this.numTel = numTel;
		this.numFixe = numFixe;
		this.idGroupe = idGroupe;
	}

	public int getIdContact() {
		return idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Boolean getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Boolean entreprise) {
		this.entreprise = entreprise;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getNumFixe() {
		return numFixe;
	}

	public void setNumFixe(String numFixe) {
		this.numFixe = numFixe;
	}

	public GroupeContact getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(GroupeContact idGroupe) {
		this.idGroupe = idGroupe;
	}

	@Override
	public String toString() {
		return "Contact [idContact=" + idContact + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", ville=" + ville + ", rue=" + rue + ", codePostal=" + codePostal
				+ ", pays=" + pays + ", entreprise=" + entreprise + ", numTel=" + numTel + ", numFixe=" + numFixe
				+ ", idGroupe=" + idGroupe + "]";
	}
	
	

}