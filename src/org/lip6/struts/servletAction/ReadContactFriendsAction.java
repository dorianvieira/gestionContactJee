package org.lip6.struts.servletAction;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.domain.GroupeContact;

public class ReadContactFriendsAction extends Action {

	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) throws NamingException, SQLException {

		final DAOContact lDAOContact = new DAOContact();
		List<Contact> resultat = lDAOContact.findFriends();
		int idContact;
		GroupeContact groupeContact;
		for (Contact c : resultat) {
			idContact = c.getIdContact();
			groupeContact = c.getIdGroupe();
			pRequest.getSession().setAttribute("idContact", idContact);
			if (groupeContact.getIdGroupe() == 1) {
				pRequest.getSession().setAttribute("nomGroupe", "famille");
			} else if (groupeContact.getIdGroupe() == 2) {
				pRequest.getSession().setAttribute("nomGroupe", "amis");
			} else {
				pRequest.getSession().setAttribute("nomGroupe", "pro");
			}

		}
		pRequest.getSession().setAttribute("contacts", resultat);
		if (resultat != null) {
			// if no exception is raised, forward "success"
			return pMapping.findForward("success");
		} else {
			// If any exception, return the "error" forward
			return pMapping.findForward("error");
		}
	}
}