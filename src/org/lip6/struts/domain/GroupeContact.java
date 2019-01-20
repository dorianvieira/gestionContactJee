package org.lip6.struts.domain;

import java.util.ArrayList;
import java.util.List;

public class GroupeContact  {
	int idGroupe;
	String nomGroupe;
	private List<GroupeContact> contactsgroupe;

	


	public GroupeContact(int idGroupe, String nomGroupe) {
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.contactsgroupe = new ArrayList<GroupeContact>();
	}
	

	

	
	public GroupeContact(int idGroupe) {
		super();
		this.idGroupe = idGroupe;
	}





	public int getIdGroupe() {
		return idGroupe;
	}



	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}



	public String getNomGroupe() {
		return nomGroupe;
	}



	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}



	public List<GroupeContact> getContactsGroupe() {
		return contactsgroupe;
	}



	public void setContactsGroupe(List<GroupeContact> contactsgroupe) {
		this.contactsgroupe = contactsgroupe;
	}




	@Override
	public String toString() {
		return "GroupeContact [idGroupe=" + idGroupe + ", nomGroupe=" + nomGroupe + ", contactsgroupe=" + contactsgroupe
				+ "]";
	}

	
	
	
}
