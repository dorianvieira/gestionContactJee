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
import org.lip6.struts.actionForm.DeleteContactValidationForm;
import org.lip6.struts.domain.DAOContact;

public class DeleteContactAction extends Action {

	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) throws NamingException, SQLException {

		final DeleteContactValidationForm lForm = (DeleteContactValidationForm) pForm;
		final DAOContact lDAOContact = new DAOContact();
		int idContact = Integer.parseInt(lForm.getId());
		String resultat = lDAOContact.deleteContact(idContact);
		if (resultat == "success") {
			// if no exception is raised, forward "success"
			return pMapping.findForward("success");
		}
		return null;
	}
}