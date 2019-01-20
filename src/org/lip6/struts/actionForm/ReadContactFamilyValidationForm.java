package org.lip6.struts.actionForm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.domain.Contact;

public class ReadContactFamilyValidationForm extends ActionForm {
	private List<Contact> contact;

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4265684094063535460L;

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		return null;
	}
}
