<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>

<%@ include file="../WEB-INF/layout/script.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles/main.css">
<script>
	<script>
	function deleteAlert() {
		alert("Le contact a bien été supprimé !");
	}
</script>
<meta charset="UTF-8">
<title><bean:message key="title.contact" /></title>
</head>
<body>
	<logic:iterate id="contactD" name="contactsDetails">

		<div
			class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
			<div class="panel panel-info">
				<div class="panel-heading">

					<h3 class="panel-title">
						<bean:write name="contactD" property="nom" />
						<bean:write name="contactD" property="prenom" />
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class=" col-md-9 col-lg-9 ">
							<table class="table table-user-information">
								<tbody>
									<tr>
										<td><bean:message key="form.email" /> :</td>
										<td><a href="mailto:info@support.com"><bean:write
													name="contactD" property="email" /></a></td>
									</tr>
									<tr>
										<td><bean:message key="form.rue" /> :</td>
										<td><bean:write name="contactD" property="rue" /></td>
									</tr>
									<tr>
										<td><bean:message key="form.ville" /> :</td>
										<td><bean:write name="contactD" property="ville" /></td>
									</tr>
									<tr>
										<td><bean:message key="form.codePostal" /> :</td>
										<td><bean:write name="contactD" property="codePostal" /></td>
									</tr>

									<tr>
									<tr>
										<td><bean:message key="form.pays" /> :</td>
										<td><bean:write name="contactD" property="pays" /></td>
									</tr>
									<tr>
										<td><bean:message key="form.group" /> :</td>
										<td><bean:write name="nomGroupe" /></td>
									</tr>
									<tr>
										<td><bean:message key="form.phone" /> :</td>
										<td><bean:write name="contactD" property="numFixe" /> (<bean:message
												key="form.numfixe" />)<br> <br> <bean:write
												name="contactD" property="numTel" /> (<bean:message
												key="form.numtel" />)</td>

									</tr>

								</tbody>
							</table>
							<div class="">
								<span class="pull-right"><a
									href="/ProjectContact/pages/afficherListe.jsp">
										<button title="Back" data-toggle="tooltip" type="button"
											class="btn btn-sm btn-primary">
											<i class="glyphicon glyphicon-backward"></i>
										</button>
								</a> <a
									href="/ProjectContact/UpdateContact.do?id=${contactD.idContact}">
										<button title="Edit this user" data-toggle="tooltip"
											type="button" class="btn btn-sm btn-warning">
											<i class="glyphicon glyphicon-edit"></i>
										</button>
								</a> <a
									href="/ProjectContact/DeleteContact.do?id=${contactD.idContact}">
										<button title="Remove this user" onclick="deleteAlert()"
											data-toggle="tooltip" type="button"
											class="btn btn-sm btn-danger">
											<i class="glyphicon glyphicon-trash"></i>
										</button>
								</a> </span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</logic:iterate>
</body>
</html>