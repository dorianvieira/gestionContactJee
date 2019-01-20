package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.lip6.struts.domain.GroupeContact;

public class AddContactValidationForm extends ActionForm {
	/**
	 * LA 1ERE CLASSE A ETRE APPELEE APRES VALIDATION DU FORMULAIRE PUIS LE ACTION
	 * PUIS LE DAO
	 */
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
	private int idGroupe;
	private String numTel = null;
	private String numFixe = null;

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
		this.idGroupe = 0;
		this.numTel = null;
		this.numFixe = null;

	}

	/**
	 * @return Email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return First Name
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return Last name
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setEmail(String string) {
		email = string;
	}

	/**
	 * @param string Sets the First Name
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param string sets the Last Name
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return ID Returns ID
	 */
	public long getIdContact() {
		return idContact;
	}

	/**
	 * @param l Sets the ID
	 */
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return Last rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return Last name
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setCodePostal(int cp) {
		codePostal = cp;
	}

	/**
	 * @return Last name
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * @return Last name
	 */
	public Boolean getEntreprise() {
		return entreprise;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setEntreprise(Boolean entr) {
		entreprise = entr;
	}

	/**
	 * @return Last name
	 */
	public int getGroupeContact() {
		return idGroupe;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setGroupeContact(int id) {
		idGroupe = id;
	}

	/**
	 * @return Last name
	 */
	public String getNumTel() {
		return numTel;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	/**
	 * @return Last name
	 */
	public String getNumFixe() {
		return numFixe;
	}

	/**
	 * @param string Sets the Email
	 */
	public void setNumFixe(String numFixe) {
		this.numFixe = numFixe;
	}

	/* si la validation genere des erreurs => fichier porperties */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		if (getNom() == null || getNom().length() < 1) {
			errors.add("nom", new ActionMessage("creation.fn.error.required"));
		}
		if (getPrenom() == null || getPrenom().length() < 1) {
			errors.add("last name", new ActionMessage("creation.ln.error.required"));
		}
		if (getEmail() == null || getEmail().length() < 1) {
			errors.add("email", new ActionMessage("creation.email.error.required"));
		}
		if (getVille() == null || getVille().length() < 1) {
			errors.add("ville", new ActionMessage("creation.ville.error.required"));
		}
		if (getRue() == null || getRue().length() < 1) {
			errors.add("rue", new ActionMessage("creation.rue.error.required"));
		}
		if (getCodePostal() == 0 || getCodePostal() < 4) {
			errors.add("codePostal", new ActionMessage("creation.codePostal.error.required"));
		}
		if (getPays() == null || getPays().length() < 1) {
			errors.add("pays", new ActionMessage("creation.pays.error.required"));
		}
		if (getNumTel() == null || getNumTel().length() < 1 || getNumTel().length() > 10) {
			errors.add("numtel", new ActionMessage("creation.numtel.error.required"));
		}
		if (getNumFixe() == null || getNumFixe().length() < 1 || getNumFixe().length() > 10) {
			errors.add("numfixe", new ActionMessage("creation.numfixe.error.required"));
		}

		return errors;
	}
}