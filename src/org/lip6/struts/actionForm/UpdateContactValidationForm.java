package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UpdateContactValidationForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private int idContact = 0;
	private String nom = null;
	private String prenom = null;
	private String email = null;
	private String ville = null;
	private String rue = null;
	private int codePostal = 0;
	private String pays = null;
	private Boolean entreprise = null;
	private String idGroupe;
	private String numTel = null;
	private String numFixe = null;

	public int getId() {
		return idContact;
	}

	public void setId(int id) {
		this.idContact = id;
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

	public String getGroupeContact() {
		return idGroupe;
	}

	public void setGroupeContact(String id) {
		idGroupe = id;
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

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.idContact = 0;
		this.nom = null;
		this.prenom = null;
		this.email = null;
		this.ville = null;
		this.rue = null;
		this.codePostal = 0;
		this.pays = null;
		this.entreprise = null;
		this.idGroupe = null;
		this.numTel = null;
		this.numFixe = null;

	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		return errors;
	}

}
