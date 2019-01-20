<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>

<%@ include file="../WEB-INF/layout/script.jsp"%>
<html:html>
<head>
<link rel="stylesheet" href="styles/main.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 style="text-align: center; color: white"><bean:message
								key="main.welcome" /></h1>
			<div class="row">


				<h4 style="text-align:center;">
					<button type="button" class="btn btn-secondary">
						<a style="color: white" href="ContactRead.do"><bean:message
								key="main.page" /></a>
					</button>
				</h4>
			</div>
		</div>
	</div>
	<br>
</body>
</html:html>
