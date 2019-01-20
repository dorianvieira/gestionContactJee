<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>

<%@ include file="../WEB-INF/layout/script.jsp"%>
<%@ include file="../WEB-INF/layout/scriptAfficheListe.jsp"%>

<!DOCTYPE html>
<html:html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles/main.css">

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/ProjectContact/ContactRead.do"><bean:message
						key="nav.name" /></a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/ProjectContact/ContactRead.do"><bean:message
							key="nav.all" /></a></li>
				<li><a href="/ProjectContact/ContactReadOffice.do"><bean:message
							key="nav.office" /></a></li>
				<li class="active"><a
					href="/ProjectContact/ContactReadFriends.do"><bean:message
							key="nav.friends" /></a></li>
				<li><a href="/ProjectContact/ContactReadFamily.do"><bean:message
							key="nav.family" /></a></li>

			</ul>
		</div>
	</nav>
	<div class="col-md-12">
		<h4>Liste des contacts</h4>
		<div style="text-align: right">
			<a href="/ProjectContact/ContactCreation.do">
				<button title="See this user" class="btn btn-success btn-xs">
					<span class="glyphicon glyphicon-plus"></span>
				</button>
			</a>
		</div>
		<div class="table-responsive">

			<table id="mytable" class="table table-bordred table-striped results">
				<div class="form-group pull-left">
					<input type="text" class="search form-control"
						placeholder="Recherche">
				</div>
				<span class="counter pull-left"></span>
				<thead>
					<th><bean:message key="form.lastname" /></th>
					<th><bean:message key="form.firstname" /></th>
					<th><bean:message key="form.email" /></th>
					<th><bean:message key="form.see" /></th>
					<th><bean:message key="form.edit" /></th>
					<th><bean:message key="form.delete" /></th>
					<tr class="warning no-result">
						<td colspan="8"><i class="fa fa-warning"></i> <bean:message
								key="form.result" /></td>
					</tr>
				</thead>
				<tbody>

					<logic:iterate id="contact" name="contacts">

						<tr>
							<html:form action="/ReadContact">
								<td><bean:write name="contact" property="nom" /></td>
								<td><bean:write name="contact" property="prenom" /></td>
								<td><bean:write name="contact" property="email" /></td>
							</html:form>

							<td><a
								href="/ProjectContact/SeeDetails.do?id=${contact.idContact}">
									<button title="See this contact" class="btn btn-primary btn-xs">
										<span class="glyphicon glyphicon-eye-open"></span>
									</button>
							</a></td>
							<td><a
								href="/ProjectContact/UpdateContact.do?id=${contact.idContact}">
									<button title="Edit this contact"
										class="btn btn-warning btn-xs">
										<span class="glyphicon glyphicon-edit"></span>
									</button>
							</a></td>
							<td><a
								href="/ProjectContact/DeleteContact.do?id=${contact.idContact}">
									<button title="Delete this contact"
										class="btn btn-danger btn-xs" onclick="deleteAlert()">
										<span class="glyphicon glyphicon-trash"></span>
									</button>
							</a></td>

						</tr>
					</logic:iterate>

				</tbody>

			</table>

			<button id="clear" onclick="myFunction()">
				<bean:message key="clean" />
			</button>
			<div class="clearfix"></div>

		</div>

	</div>
</body>
</html:html>