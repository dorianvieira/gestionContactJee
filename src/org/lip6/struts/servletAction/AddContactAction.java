package org.lip6.struts.servletAction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.domain.GroupeContact;

public class AddContactAction extends Action {

	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) {

		final AddContactValidationForm lForm = (AddContactValidationForm) pForm;

		final int idContact = (int) lForm.getIdContact();

		final String nom = lForm.getNom();
		final String prenom = lForm.getPrenom();
		final String email = lForm.getEmail();
		final String ville = lForm.getVille();
		final String rue = lForm.getRue();
		final int codePostal = lForm.getCodePostal();
		final String pays = lForm.getPays();
		final Boolean entreprise = lForm.getEntreprise();
		final String numTel = lForm.getNumTel();
		final String numFixe = lForm.getNumFixe();
		final int idGroupe = Integer.parseInt(pRequest.getParameter("idGroupe"));

		// create a new Contact
		final DAOContact lDAOContact = new DAOContact();
		final String resultat = lDAOContact.addContact(idContact, nom, prenom, email, ville, rue, codePostal, pays,
				entreprise, numTel, numFixe, idGroupe);

		if (resultat != null) {
			// if no exception is raised, forward "success"
			return pMapping.findForward("success");
		} else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}

	}
}