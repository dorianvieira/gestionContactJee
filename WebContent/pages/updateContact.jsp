<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>

<!DOCTYPE html>
<html:html>
<head>
<link rel="stylesheet" href="styles/main.css">

<%@ include file="../WEB-INF/layout/script.jsp"%>

<meta charset="UTF-8">
</head>
<body>
	<logic:iterate id="contactD" name="contacts">


		<p style="color: white">
			<html:errors />
			<br />
		</p>
		<div
			class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
			<div class="panel panel-info">
				<div class="panel-heading">

					<h3 class="panel-title">
						<td align="center" colspan="2"><font size="4"><bean:message
									key="form.edit.title" /></font></td>
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class=" col-md-12 col-lg-12 ">

							<table class="table table-striped">
								<tbody>
									<tr>
										<td colspan="1">
											<div class="class="wellform-horizontal"">
												<html:form action="/ContactUpdate?id=${contactD.idContact}">
													<fieldset>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.lastname" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-user"></i></span>
																	<html:text name="contactD" property="nom" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.firstname" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-user"></i></span>
																	<html:text name="contactD" property="prenom" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.email" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-envelope"></i></span>
																	<html:text name="contactD" property="email" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.rue" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-home"></i></span>
																	<html:text name="contactD" property="rue" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.ville" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-home"></i></span>
																	<html:text name="contactD" property="ville" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.codePostal" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-map-marker"></i></span>
																	<html:text name="contactD" property="codePostal" />

																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.pays" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-map-marker"></i></span>
																	<html:text name="contactD" property="pays" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.group" /></label>
															<div class="col-md-6 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-list"></i></span> <select
																		id="idGroupe" name="idGroupe"
																		class="selectpicker form-control">
																		<option disabled selected><bean:message
																				key="form.choice" /></option>
																		<option value="1"><bean:message
																				key="nav.family" /></option>
																		<option value="2"><bean:message
																				key="nav.friends" /></option>
																		<option value="3"><bean:message
																				key="nav.office" /></option>
																	</select>
																</div>
															</div>
														</div>


														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.numtel" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-earphone"></i></span>
																	<html:text name="contactD" property="numTel" />
																</div>
															</div>
														</div>
														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.numfixe" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-phone-alt"></i></span>
																	<html:text name="contactD" property="numFixe" />
																</div>
															</div>
														</div>

														<div class="form-group">
															<label class="col-md-4 control-label"><bean:message
																	key="form.entreprise" /></label>
															<div class="col-md-8 inputGroupContainer">
																<div class="input-group">
																	<span class="input-group-addon"><i
																		class="glyphicon glyphicon-user"></i></span>
																	<html:text name="contactD" property="entreprise" />

																</div>
															</div>
														</div>

													</fieldset>
													<html:submit>
														<bean:message key="form.save" />
													</html:submit>
												</html:form>
											</div>
										</td>
									</tr>
								</tbody>
							</table>

						</div>
					</div>
				</div>
			</div>
		</div>

	</logic:iterate>

</body>
</html:html>