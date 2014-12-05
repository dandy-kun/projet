<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>

<h1 class="text-center">Portail des clients</h1>
<div class="row">
	<div class="span4">
		<h2>Ajout client</h2>
		<div class="table-responsive">
			<form:form role="form"
				action="${pageContext.request.contextPath}/client/add"
				method="POST" commandName="client">

				<div class="form-group">
					<form:label path="nom">Nom</form:label>
					<form:input path="nom" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="prenom">Prenom</form:label>
					<form:input path="prenom" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="adresse">Adresse</form:label>
					<form:input path="adresse" class="form-control" />
				</div>
				
				
				<button type="submit" class="btn btn-default">Ajouter</button>
			</form:form>
		</div>
	</div>
	<div class="span4">
		<div class="table-responsive">
			<table class="table">
				<caption>
					<h2>Clients</h2>
				</caption>
				<thead>
					<tr>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Adresse</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clients}" var="client">
						<tr>
							<td>${client.nom}</td>
							<td>${client.prenom}</td>
							<td>${client.adresse}</td>
							
							<td><a
								href="${pageContext.request.contextPath}/client/remove/${client.id}"
								class="btn btn-danger btn-sm delete"> Supprimer </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<br>
</body>
<%@ include file="footer.jsp"%>