<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
body {
	padding: 20px 20px;
}

.results tr[visible='false'], .no-result {
	display: none;
}

.results tr[visible='true'] {
	display: table-row;
}

.counter {
	padding: 8px;
	color: #ccc;
}
</style>
<script>
	function deleteAlert() {
		alert("Le contact a bien été supprimé !");
	}
</script>
<script>
	$(document)
			.ready(
					function() {
						$(".search")
								.keyup(
										function() {
											var searchTerm = $(".search").val();
											var listItem = $('.results tbody')
													.children('tr');
											var searchSplit = searchTerm
													.replace(/ /g,
															"'):containsi('")
											$
													.extend(
															$.expr[':'],
															{
																'containsi' : function(
																		elem,
																		i,
																		match,
																		array) {
																	return (elem.textContent
																			|| elem.innerText || '')
																			.toLowerCase()
																			.indexOf(
																					(match[3] || "")
																							.toLowerCase()) >= 0;
																}

															});
											$(".results tbody tr").not(
													":containsi('"
															+ searchSplit
															+ "')").each(
													function(e) {
														$(this).attr('visible',
																'false');

													});
											$(
													".results tbody tr:containsi('"
															+ searchSplit
															+ "')").each(
													function(e) {
														$(this).attr('visible',
																'true');

													});
											var jobCount = $('.results tbody tr[visible="true"]').length;
											$('.counter').text(
													jobCount + ' résultat(s)');
											if (jobCount == '0') {
												$('.no-result').show();
											} else {
												$('.no-result').hide();
											}

										});
					});
</script>
<script>
	function myFunction() {
		location.reload();
	}
</script>

<script>
	$(document).ready(function() {
		$('#mytable').DataTable();
	});
</script>
</head>
<body>

</body>
</html>