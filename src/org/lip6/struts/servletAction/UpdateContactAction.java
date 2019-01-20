package org.lip6.struts.servletAction;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.actionForm.UpdateContactValidationForm;
import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.DAOContact;

public class UpdateContactAction extends Action {

	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) throws NamingException, SQLException {

		final UpdateContactValidationForm lForm = (UpdateContactValidationForm) pForm;
		final int idContact = lForm.getId();
		final String nom = lForm.getNom();
		final String prenom = lForm.getPrenom();
		final String email = lForm.getEmail();
		final String ville = lForm.getVille();
		final String rue = lForm.getRue();
		final int codePostal = lForm.getCodePostal();
		final String pays = lForm.getPays();
		final Boolean entreprise = false;
		final String numTel = lForm.getNumTel();
		final String numFixe = lForm.getNumFixe();
		final String idGroupe = pRequest.getParameter("idGroupe");

		final DAOContact lDAOContact = new DAOContact();
		List<Contact> resultat = lDAOContact.findById(idContact);

		final String modifiee = lDAOContact.updateContact(idContact, nom, prenom, email, ville, rue, codePostal, pays,
				entreprise, numTel, numFixe, idGroupe);

		// recupere les donn�es du contact
		pRequest.getSession().setAttribute("contacts", resultat);

		if (modifiee != null) {
			// if no exception is raised, forward "success"
			return pMapping.findForward("success");
		} else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}

	}
}
